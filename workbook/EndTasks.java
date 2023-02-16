package pl.sdacademy.java.workbook;

import java.util.Arrays;

public class EndTasks {
    public static void main() {
//        multiply(15);
//        figures(7);
//        ticTacToe(5);
//        sms();
//        pesel();
    }


    public static void pesel() {
        String a = "88123144445";
        System.out.println(a.toCharArray().length);
        boolean b = true;
        b = a.matches("\\d{11}");


        if (a.substring(2, 3).matches("[0-1]")) {
            if (a.substring(2, 3).matches("0") && a.substring(3, 4).matches("[1-9]") ||
                    a.substring(2, 3).matches("1") && a.substring(3, 4).matches("[0-2]")) {
                System.out.println("Month is wright 1");
            } else {
                System.out.println("Month is wrong 2");
                b = false;
            }

        } else {
            System.out.println("wrong " + a.substring(2, 3));
            b = false;
        }

        if (a.substring(4, 5).matches("[0-3]")) {
            System.out.println("Day seems to be ok");
        } else b = false;
        if (a.substring(4, 5).matches("3")) {
            if (a.substring(5, 6).matches("[0-1]")) {
                System.out.println("Day seems to be ok1 ");
            } else b = false;
        }

//        b = a.substring(2, 3).matches("1");

        System.out.println(b);


    }

    public static void sms() {
        String a = "   Ala ma kota, a  kot ma     Alę !" + "\n" + "Hej, będę dziś później. Nie czekaj na mnie z kolacją.";

        System.out.println(a + " " + a.length());
        String aa = a.trim();
        System.out.println(aa + " " + aa.length());

        for (int i = 0; i < aa.length() - 1; i++) {
            if (aa.charAt(i) == ' ' && aa.charAt(i + 1) == ' ') {
                aa = aa.replaceFirst("( {2})", " ");
                i--;
            }
        }
        System.out.println(aa + " " + aa.length());
        for (int i = 0; i < aa.length() - 1; i++) {
            if (aa.charAt(i) == ' ') {
                aa = aa.replaceFirst(" .", aa.substring(i + 1, i + 2).toUpperCase());
            }
        }
        System.out.println(aa + " " + aa.length());
        int n = 0;
        for (int i = 0; i <= aa.length(); i += 160) {
            n++;
        }
        System.out.println(a.length() + " | " + aa.length() + " | " + "Price is " + n * 0.25 + "Zl");
    }

    public static void ticTacToe(int sideLength) {
        String[][] mass = new String[sideLength][sideLength];
        for (int i = 0; i < sideLength; i++) {
            for (int q = 0; q < sideLength; q++) {
                int r = (int) (Math.random() * 3 + 1);
                mass[i][q] = String.valueOf(r);
            }
        }

        for (int i = 0; i < sideLength; i++) {
            for (int q = 0; q < sideLength; q++) {
                int a = Integer.parseInt(mass[i][q]);
                switch (a) {
                    case (1) -> {
                        mass[i][q] = "x";
                    }
                    case 2 -> {
                        mass[i][q] = "_";
                    }
                    case 3 -> mass[i][q] = "0";
                    default -> System.out.println("Something wrong");
                }
            }
        }

        for (int i = 0; i < sideLength; i++) {
            for (int q = 0; q < sideLength; q++) {
                mass[i][q] = mass[i][q].replace("0", "O");
                mass[i][q] = mass[i][q].replace("o", "O");
                mass[i][q] = mass[i][q].replace("x", "X");
            }
        }

        int sumX = 0;
        int sumO = 0;
        for (int r = 0; r < sideLength; r++) {
            for (int c = 0; c < sideLength - 2; c++) {
                if (mass[r][c].equals("X") && mass[r][c + 1].equals("X") && mass[r][c + 2].equals("X"))
                    sumX++;
                if (mass[r][c].equals("O") && mass[r][c + 1].equals("O") && mass[r][c + 2].equals("O"))
                    sumO++;
            }
        }
        for (int r = 0; r < sideLength - 2; r++) {
            for (int c = 0; c < sideLength; c++) {
                if (mass[r][c].equals("X") && mass[r + 1][c].equals("X") && mass[r + 2][c].equals("X"))
                    sumX++;
                if (mass[r][c].equals("O") && mass[r + 1][c].equals("O") && mass[r + 2][c].equals("O"))
                    sumO++;
            }
        }

        for (int r = 0; r < sideLength - 2; r++) {
            for (int c = 0; c < sideLength - 2; c++) {
                if (mass[r][c].equals("X") && mass[r + 1][c + 1].equals("X") && mass[r + 2][c + 2].equals("X"))
                    sumX++;
                if (mass[r][c].equals("O") && mass[r + 1][c + 1].equals("O") && mass[r + 2][c + 2].equals("O"))
                    sumO++;
            }
        }
        for (int r = 0; r < sideLength - 2; r++) {
            for (int c = sideLength - 1; c >= 2; c--) {
                if (mass[r][c].equals("X") && mass[r + 1][c - 1].equals("X") && mass[r + 2][c - 2].equals("X"))
                    sumX++;
                if (mass[r][c].equals("O") && mass[r + 1][c - 1].equals("O") && mass[r + 2][c - 2].equals("O"))
                    sumO++;
            }
        }

        massOut(mass);
        System.out.printf("%3s %3s\n", "sumX", "sumO");
        System.out.printf("%3d %3d", sumX, sumO);
        System.out.println();
        if (sumX > sumO)
            System.out.println("  X Won");
        else if (sumO > sumX)
            System.out.println("  O Won");
        else System.out.println("  A tie!");
    }

    public static void figures(int sideLength) {
        String a = "# ";
        String s = "  ";
        int j = 1;

        for (int i = 1; i <= sideLength; i++) {
            System.out.print(a.repeat(i));
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < sideLength; i++) {
            System.out.print(a.repeat(sideLength - i));
            System.out.println();
        }
        System.out.println();

        for (int i = sideLength; i >= 1; i--) {
            System.out.print(s.repeat(i - 1) + a.repeat(j));
            System.out.println();
            j++;
        }
        System.out.println();

        j = 0;
        for (int i = sideLength; i >= 1; i--) {
            System.out.print(s.repeat(j) + a.repeat(i));
            System.out.println();
            j++;
        }
        System.out.println();

        for (int i = 1; i <= sideLength; i++) {
            if (i == 1) {
                System.out.println(a.repeat(sideLength));
            } else if (i < sideLength) {
                System.out.print(s.repeat(i - 1) + a);
                System.out.println();
            } else {
                System.out.print(a.repeat(sideLength));
            }
        }
        System.out.println("\n");

        for (int i = 1; i <= sideLength; i++) {
            if (i == 1) {
                System.out.println(a.repeat(sideLength));
            } else if (i < sideLength) {
                System.out.print(s.repeat(sideLength - i) + a);
                System.out.println();
            } else {
                System.out.print(a.repeat(sideLength));
            }
        }
        System.out.println("\n");

        for (int i = 1; i <= sideLength; i++) {
            if (i == 1 || i == sideLength) {
                System.out.print(a.repeat(sideLength));
            } else {
                System.out.print(a + s.repeat(sideLength - 2) + a);
            }
            System.out.println();
        }
        System.out.println("\n");

        String[][] mass = new String[sideLength][sideLength];
        for (int i = 0; i < sideLength; i++) {
            for (int q = 0; q < sideLength; q++) {
                mass[i][q] = a;
            }
        }

        for (int i = 1; i < sideLength - 1; i++) {
            for (int q = 0; q < sideLength; q++) {
                mass[i][q] = mass[i][q].replaceAll(a, s);
            }
        }

        j = 1;
        for (int i = 1; i < sideLength - 1; i++) {
            for (int q = 0; q < sideLength; q++) {
                mass[i][j] = mass[i][j].replace(s, a);
            }
            j++;
        }
        j = sideLength - 2;
        for (int i = 1; i < sideLength - 1; i++) {
            for (int q = 0; q < sideLength; q++) {
                mass[i][j] = mass[i][j].replace(s, a);
            }
            j--;
        }

        massOut(mass);


        for (int i = 1; i < sideLength - 1; i++) {
            for (int q = 0; q <= sideLength; ) {
                mass[i][q] = mass[i][j].replace(s, a);
                q += sideLength - 1;
            }
        }
        massOut(mass);
    }

    public static void massOut(String[][] mass) {
        for (String[] x : mass) {
            for (String y : x) {
                System.out.printf("%s ", y);
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void multiply(int multiplyingFor) {
        int x = multiplyingFor;
        for (int i = 1; i <= x; i++) {
            System.out.println("+---".repeat(x) + "+");
            for (int j = 1; j <= x; j++) {
                if (i * j < 100)
                    System.out.printf("|%2s ", i * j);
                else
                    System.out.printf("|%3s", i * j);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("+---".repeat(x) + "+");
    }

}

