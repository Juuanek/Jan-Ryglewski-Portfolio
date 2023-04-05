import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    private String name;
    private ArrayList<Customer> customersList = new ArrayList<>(500);
    private Customer addTransaction;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNewCustomer(Customer customer){
        if (customersList.contains(customer)){
            System.out.println("Customer already in the list");
        }
            customersList.add(customer);
    }


    public void showStatement(Customer customer){
        System.out.println(customer.getName());
        customer.showTransactions();
    }

    public void showCustomers(){
        System.out.println(Arrays.toString(customersList.toArray()));
    }
}
