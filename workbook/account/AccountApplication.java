package pl.sdacademy.java.workbook.account;

public class AccountApplication {
    public static void main(String[] args) {
        Account account = new Account();
        Account account1 = new Account();
        account.setName("Konto Premium");
        account.deposit(300);
        account.withdraw(400);
        account.withdraw(1000);
        System.out.println();
        System.out.println("Nazwa: " + account.getName()
                + " | Stan konta: " + account.getBalance());
        account.transfer(account1,200);

        System.out.println(account);
        System.out.println(account1);



    }
}
