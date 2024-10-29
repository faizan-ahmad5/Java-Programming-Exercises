package Exercise09.uet;

public class VIPCustomer {

   private String name;
   private  double creditLimit;
   private String email;

    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VIPCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = "default@gmail.com";
    }

    public VIPCustomer(String name) {
        this.name = name;
        this.creditLimit = 120.0;
        this.email = "faizan@gmail.com";
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
}
