import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    public int getAccountNumbert() {
        return this.accountNumber;
    }

    public getBankAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setAccountNumber(int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setInterestEarned(double interestEarned) {
        this.interestEarned = interestEarned;
    }

}



