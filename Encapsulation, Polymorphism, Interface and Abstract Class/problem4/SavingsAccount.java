public class SavingsAccount extends BankAccount implements Loanable{
    private double interestRate;
    public SavingsAccount(String acc,String name,double bal,double rate){super(acc,name,bal);interestRate=rate;}
    public double calculateInterest(){return getBalance()*interestRate/100;}
    public boolean applyForLoan(double amount){return amount<=getBalance()*10;}
    public double calculateLoanEligibility(){return getBalance()*10;}
}