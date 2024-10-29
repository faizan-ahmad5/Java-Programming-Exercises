package Exercise15.uet;

public class VIPCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        setCreditLimit(creditLimit);
        this.email = email;
    }

    public VIPCustomer(String name, double creditLimit) {
        this.name = name;
        setCreditLimit(creditLimit);
        this.email = "default@gmail.com";
    }

    public VIPCustomer(String name) {
        this.name = name;
        this.creditLimit = 120.0;
        this.email = "hello@gmail.com";
    }

    private void setCreditLimit(double creditLimit) {
        if (creditLimit < 0) {
            System.out.println("Warning: Credit limit cannot be negative. Setting credit limit to 0.");
            this.creditLimit = 0;
        } else {
            this.creditLimit = creditLimit;
        }
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void printCustomerDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Credit Limit: $" + creditLimit);
        System.out.println("Email: " + email);
    }
}