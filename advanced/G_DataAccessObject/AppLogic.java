package pl.sdacademy.java.advanced.G_DataAccessObject;


import java.util.Optional;

public class AppLogic {
    private final DAO<Client> clientsDAO;
//    private final DAO<Client> clientsDAO1 = new FakeClientDAO();

    public AppLogic(DAO<Client> clientsDAO) {
        this.clientsDAO = clientsDAO;
    }

    public void testClientDAO() {
        clientsDAO.create(new Client("Mateusz", "Zawistowski", 1999, "Legionowo"));
        clientsDAO.create(new Client("Mat", "Zaw", 1920, "Bunny"));
//        Optional<Client> optionalClient = clientsDAO.read(clientsDAO.read().size() - 1);
        Optional<Client> optionalClient = clientsDAO.read(0);
        giveInfo(optionalClient);
    }
    public void delete2 (){
        clientsDAO.delete(clientsDAO.read().size() - 1);
        clientsDAO.delete(clientsDAO.read().size() - 1);
//        clientsDAO.delete(clientsDAO.read().size() - 1);
        System.out.println(clientsDAO.read().size() + " size");
    }

    private static void giveInfo (Optional<Client> client) {
        if (client.isPresent()) {
            // Optional contains a value
            Client cli = client.get();
            System.out.println(cli.getName() + " z " + cli.getCity());
        } else {
            System.out.println("Client with ID 0 not found!");
        }
        // isEmpty is the opposite of isPresent
    }

    public static void staticTestDAO() {

        FakeClientDAO dao = new FakeClientDAO();

        dao.create(new Client("Baba", "Zawistowski", 1999, "Gala"));
        System.out.println(dao.read("Baba", "Zawistowski").get().getName());

        AppLogic app = new AppLogic(dao);
        app.testClientDAO();
        app.delete2();


       /* FakeDAO<String> dd = new FakeDAO<>();
        dd.create("AAA");
        dd.create("BBB");
        System.out.println(dd.read(1));
        System.out.println(dd.read(2));
        System.out.println(dd.delete("AAA"));
        System.out.println(dd.read(0));
        FakeDAO<Client> aa = new FakeDAO<>();
        FakeClientDAO cc = new FakeClientDAO();


        aa.create(new Client("nam1", "surname",1999, "warszaw"));
        aa.create(new Client("nam2", "surname",1999, "warszaw"));
        aa.create(new Client("nam3", "surname",1999, "warszaw"));*/
    }
}
