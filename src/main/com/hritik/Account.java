package main.com.hritik;

public class Account {
    String id;
    String name;
    int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    public String getID() {
        return this.id;

    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;

    }

    public int credit(int amount) {
        return this.balance += amount;

    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.credit(amount);
            this.balance -= amount;
        } else {
            System.out.println("Amount exceed balance");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + ',' +
                ", name='" + name + ',' +
                ", balance=" + balance +
                ']';
    }
}
