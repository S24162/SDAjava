package pl.sdacademy.java.basicPrograming.day6;

import java.time.*;

public class Main {
    public static void main(String[] args) {

//        ---------------------------------------------------------------linkedin.com/in/emil-rafalko-4067301b9

//        localDateTimeInstance();


//        cw17("2023-02-21");

//        String text = "aa psik I was saying that war crimes must..";
//        System.out.println("Cw18" + "\n" + text
//                + "\n" + text.matches("(.*)^a+ +psik(.*)"));

        System.out.println(authorMaxStrophe(authorPoemInit()) + " has maximum strophe number");
    }

    public static void localDateTimeInstance(){
        LocalTime time = LocalTime.of(12,51);
        LocalDate date = LocalDate.parse("2023-02-21");
        LocalDateTime dateTime = LocalDateTime.now();

        Instant instant = Instant.now();
        System.out.println(instant + " instance ");
        Instant instant1 = Instant.ofEpochMilli(1L);
    }

    public static void cw17(String dateIn) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Year is (YYYY) : ");
//        String date = sc.nextLine();
//        System.out.print("Month is MM : ");
//        date = date + "-" + sc.nextLine();
//        System.out.print("Day is DD : ");
//        date = date + "-" + sc.nextLine();

        String date1 = dateIn;

        LocalDate nextDay = LocalDate.parse(date1);
        LocalDate now = LocalDate.now();

        System.out.println(now+"\n"+nextDay);
        int daysLeft = (int) ( nextDay.toEpochDay() - now.toEpochDay());
        System.out.println(daysLeft + " days left");
        System.out.println("Compare " + nextDay.compareTo(now));

        Duration dur = Duration.between(now.atStartOfDay(),nextDay.atStartOfDay());
        System.out.println(dur.toHours());
        System.out.println(dur);

    }

    public static String authorMaxStrophe(Poem[] arr) {
        Poem poemWithMaxStrophe = null;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getStropheNumbers() > arr[i - 1].getStropheNumbers()) {
                poemWithMaxStrophe = arr[i];
            }
        }

        if (poemWithMaxStrophe==null)
            return "\n"+ "All author has the same strophe number, or there is no poems in list" +
                    ", or poem has no information about author";

        return "\n" + poemWithMaxStrophe.getCreator().getSurname()
                + " (" + poemWithMaxStrophe.getCreator().getNationality() + ")";

    }

    public static Poem[] authorPoemInit() {
        Author first = new Author("First", "Poland");
        Author second = new Author("Second", "Germany");

        Poem firstP = new Poem(first, 10);
        Poem secondP = new Poem(second, 187);
        Poem thirdP = new Poem(first, 97);

        Poem[] poemsArr = {firstP, secondP, thirdP};

        return poemsArr;
    }
}


