package pl.sdacademy.java.advanced.G_DataAccessObject.App;

import pl.sdacademy.java.advanced.G_DataAccessObject.*;

import java.util.List;
import java.util.Optional;

public class AppG {
    public static void main(String[] args) {

        Client a = new Client("Mateusz", "Zawistowski", 1999, "Legionowo");
        Client b = new Client("Mat", "Zaw", 1920, "Bunny");
        FakeClientDAO daoA = new FakeClientDAO();
        daoA.create(a);
        daoA.create(b);
        Optional<Client> thisClient = daoA.read(1);
        thisClient = daoA.read("Mateusz","Zawistowski");


        if (thisClient.isPresent()) {
            // Optional contains a value
            Client client = thisClient.get();
            System.out.println(client.getName() + " z " + client.getCity());
        }
        else {
            System.out.println("Client with ID 0 not found!");
        }

        DAO<String> as = new FakeDAO<>();
        as.create("sss");
        System.out.println(as.read(0));

        FakeDAO<String> ass= new FakeDAO<String>();
        ass.create("asdf");
        String assO = ass.read(0).get();
        System.out.println(assO);

        FakeClientDAO assa = new FakeClientDAO();
        assa.create(b);
        assa.create(a);
        List<Client> aaa = assa.read();
        for (Client client : aaa) {
            System.out.println(client.getName() + " z " + client.getCity());
        }

        AppLogic appWithAss = new AppLogic(assa);
        System.out.println();
        AppLogic.staticTestDAO();



    }
}
