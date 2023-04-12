package pl.sdacademy.java.basic;

public class NightSky {
    public static void main(String[] args) {
        //tablica dwuwymiarows z objektami typu integer
        Integer[][] sky = new Integer[5][8];
        sky[0][2] = 1;
        sky[1][5] = 2;
        sky[2][7] = 1;
        sky[3][1] = 1;
        sky[4][6] = 2;
        sky[4][3] = 1;
        printSky(sky);
    }

    public static void printSky(Integer[][] sky) {
        for (int row = 0; row < sky.length; row++){
            for (int column = 0; column < sky[row].length; column++) {
                if (sky[row][column] == null ) {
                    System.out.print(" ");
                } else if (sky[row][column] == 1) {
                    System.out.print("*");
                } else if (sky[row][column] ==2) {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
