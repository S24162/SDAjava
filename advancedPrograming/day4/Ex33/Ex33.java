package pl.sdacademy.java.advancedPrograming.day4.Ex33;

import java.io.File;

public class Ex33 {
    public static void main(String[] args) {
        String directoryPath = "D:\\SDA\\Ex33";
        searchForPngJpgFiles(directoryPath);
    }

    private static void searchForPngJpgFiles(String path) {
        File file = new File(path);

        File[] pngFiles = file.listFiles(f->f.getName().endsWith(".png"));
        File[] jpgFiles = file.listFiles(f->f.getName().endsWith(".jpg"));
        File[] pngJpgFiles = file.listFiles(f->f.getName().endsWith(".png")||f.getName().endsWith(".jpg"));
        File[] directories = file.listFiles(f -> f.isDirectory());
//        File[] directories = file.listFiles(File::isDirectory);

        for (File f : pngFiles)
            System.out.println(path + "\\" + f.getName());
        for (File f : jpgFiles)
            System.out.println(path + "\\" + f.getName());

        for (File f: directories)
            searchForPngJpgFiles(path + "\\" + f.getName());
    }
}
