public class BankAccount {

    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withdrawFunds(int number) {
        if (accountBalance <= 0) {
            System.out.println("Withdraw not possible you have no funds");
        } else {
            System.out.println("Balance before withdraw: " + accountBalance);
            accountBalance = accountBalance - number;
            System.out.println("Your balance is: " + accountBalance);
        }}

    public void depositFunds ( int number){
        System.out.println("Balance before deposit: " + accountBalance);
        accountBalance = accountBalance + number;
        System.out.println("Your balance is: " + accountBalance);
    }

}
