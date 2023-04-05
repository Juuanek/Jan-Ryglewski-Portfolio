public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Mbank","Janek");

        customer.creditTransaction(50.00);
        customer.debitTransaction(-25.00);
        customer.debitTransaction(-10.11);
        customer.creditTransaction(12.12);
        customer.showTransactions();

        System.out.println("--------");
        Bank bank = new Bank("Mbank");
        Customer Janek = new Customer("Mbank","Janek");

        bank.addNewCustomer(customer);
        bank.addNewCustomer(Janek);

        Janek.creditTransaction(50.00);
        Janek.debitTransaction(-25.00);
        Janek.debitTransaction(-10.11);
        Janek.creditTransaction(12.12);
        Janek.showTransactions();

        System.out.println("-");
        bank.showCustomers();
        System.out.println("-");

        bank.showStatement(Janek);
    }
}