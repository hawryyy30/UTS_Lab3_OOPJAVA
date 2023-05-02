class Account {
    private String id;
    private String name;
    private int balance = 0;

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
        if (this.balance < amount) {
            System.out.println("Amount exceeded balance");
            return this.balance;

        } else {
            return this.balance -= amount;
        }
    }

    public int transferTo(Account another, int amount) {
        if (this.balance >= amount) {
            this.debit(amount);
            another.credit(amount);
            return this.balance;

        } else {
            System.out.println("Amount exceeded balance");
            return this.balance;
        }
    }

    public String toString() {
        return "Account[ id = " + this.getID() + ", Name = " + this.getName() + ", Balance = " + this.getBalance()
                + "]";
    }

}

public class App {
    public static void main(String[] args) throws Exception {

        // constructor and toString
        Account a1 = new Account("A101", "Lorenzo Liunardo", 88);
        Account a2 = new Account("A102", "Harry Sion");
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        // Setters and getters
        System.out.println("ID : " + a1.getID());
        System.out.println("Name : " + a1.getName());
        System.out.println("Balance :" + a1.getBalance());

        // credit() and debit()
        a1.credit(100);
        System.out.println(a1.toString());
        a1.debit(50);
        System.out.println(a1.toString());
        a1.debit(500);
        System.out.println(a1.toString());

        // Transfer
        a1.transferTo(a2, 100);
        System.out.println(a1.toString());
        System.out.println(a2.toString());

    }

}
