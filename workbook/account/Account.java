package pl.sdacademy.java.workbook.account;

public class Account {
    private String name;
    private int balance = 0;
    private boolean debit = false;
    private int minDebit = -1000;

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(int amount) {
        String before = String.valueOf(balance);
        if (isPositive(amount))
            balance += amount;
        String after = String.valueOf(balance);
        System.out.println(before + " + " + amount + " = " + after);

    }

    public void withdraw(int amount) {
        String before = String.valueOf(balance);

        if (isPositive(amount)) {
            if (balance - amount >= minDebit) {
                balance -= amount;
                String after = String.valueOf(balance);
                System.out.println(before + " - " + amount + " = " + after);
            }
            else System.out.println("You cannot perform an operation that exceeds the debit");
        }
        if (balance < 0)
            debit = true;
        if (debit)
            System.out.println("Negative account balance");
    }

    public boolean isPositive(int amount) {
        if (amount <= 0)
            System.out.println("Must be above zero");
        return amount > 0;
    }

    public void transfer(Account other, int amount) {
        withdraw(amount);
        other.deposit(amount);
    }

    public String toString() {
        return " Account{name: " + name + ", balance: " + balance + "}";
    }
}
