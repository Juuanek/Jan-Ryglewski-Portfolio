import java.util.ArrayList;
import java.util.Arrays;

public class Customer extends Bank{

    private String name;
    private ArrayList<Double> transactions = new ArrayList<>(500);
    //private Double credit;
    //private Double debit;

    public Customer(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public void creditTransaction(Double credit){
         this.transactions.add(credit);
        System.out.println(Arrays.toString(transactions.toArray()));
    }

    public void debitTransaction(Double debit){
        this.transactions.add(debit);
        System.out.println(transactions);
    }

    public void showTransactions(){
        System.out.println(Arrays.toString(transactions.toArray()));
    }

    @Override
    public String toString() {
        return "\n"+"Customer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
