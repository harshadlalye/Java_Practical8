/* Write a Java program to create class BankAccount.
Construct 5 customers using default and parametrised constructor
(Account Id, Name, Type, Balance) */
public class BankAccount {
    private int accountId;
    private String name;
    private String type;
    private double balance;
    
    // Default constructor
    public BankAccount() {
        this.accountId = 0;
        this.name = "";
        this.type = "";
        this.balance = 0.0;
    }
    
    // Parameterized constructor
    public BankAccount(int accountId, String name, String type, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }
    
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    
    public int getAccountId() {
        return accountId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        // Constructing 5 customers using default and parameterized constructors
        BankAccount customer1 = new BankAccount();
        BankAccount customer2 = new BankAccount(1234, "John Smith", "Savings", 5000.0);
        BankAccount customer3 = new BankAccount();
        customer3.setAccountId(5678);
        customer3.setName("Jane Doe");
        customer3.setType("Checking");
        customer3.setBalance(2000.0);
        BankAccount customer4 = new BankAccount(9012, "Bob Johnson", "Checking", 10000.0);
        BankAccount customer5 = new BankAccount(3456, "Sarah Lee", "Savings", 7500.0);
        
        // Printing out the details of each customer
        System.out.println("Customer 1: Account ID - " + customer1.getAccountId() + ", Name - " + customer1.getName() + ", Type - " + customer1.getType() + ", Balance - " + customer1.getBalance());
        System.out.println("Customer 2: Account ID - " + customer2.getAccountId() + ", Name - " + customer2.getName() + ", Type - " + customer2.getType() + ", Balance - " + customer2.getBalance());
        System.out.println("Customer 3: Account ID - " + customer3.getAccountId() + ", Name - " + customer3.getName() + ", Type - " + customer3.getType() + ", Balance - " + customer3.getBalance());
        System.out.println("Customer 4: Account ID - " + customer4.getAccountId() + ", Name - " + customer4.getName() + ", Type - " + customer4.getType() + ", Balance - " + customer4.getBalance());
        System.out.println("Customer 5: Account ID - " + customer5.getAccountId() + ", Name - " + customer5.getName() + ", Type - " + customer5.getType() + ", Balance - " + customer5.getBalance());
    }
}
