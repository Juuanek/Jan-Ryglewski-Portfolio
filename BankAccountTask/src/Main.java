public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(9_904_100_25);
        bankAccount.setCustomerName("Jan");
        bankAccount.setEmail("j.ryglewski@wp.pl");
        bankAccount.setPhoneNumber(536_990_410);
        bankAccount.setAccountBalance(0);

        System.out.println(
                "Customer name: "+        bankAccount.getCustomerName() +"\n"+
                        "Account Number: "+         bankAccount.getAccountNumber() + "\n"+
                        "Account balance: "+        bankAccount.getAccountBalance() + "\n"+
                        "Phone Number: "+        bankAccount.getPhoneNumber() + "\n"+
                        "Email: "+        bankAccount.getEmail() + "\n"
        );


        bankAccount.withdrawFunds( 50);
        System.out.println("");
        bankAccount.depositFunds(100);
    }
}

