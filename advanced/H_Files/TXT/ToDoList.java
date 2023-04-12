package pl.sdacademy.java.advanced.H_Files.TXT;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// TODO Implement a user interface, where you can:
// 1. Display the list of TODOs
// 2. Add a new TODO
// 3. Remove a selected  TODO
public class ToDoList {
    private static String filePath = "D:\\SDA\\HelloSD\\src\\main\\java\\pl\\sdacademy\\java\\advanced\\H_Files\\Files\\ToDo.txt";

    public static void test() {

        ToDoListTXTDAO dao = new ToDoListTXTDAO(filePath);

//        dao.create("Write my first files program in Java");
//        dao.create("Second string.");
//        dao.create("Third string.");
        dao.create("");
        dao.create("");
//        dao.delete(0);

        List<String> lines = dao.read();
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ". " + lines.get(i));
        }

        System.out.println(Paths.get(filePath));
        try{
            System.out.println(Files.readAllLines(Paths.get(filePath)));
        } catch (IOException e) {
            System.out.println("Reading problems");
        }


    }
}
