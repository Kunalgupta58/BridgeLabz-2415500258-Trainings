public class CurrentAccount extends BankAccount implements Loanable{
    private double interestRate;
    public CurrentAccount(String acc,String name,double bal,double rate){super(acc,name,bal);interestRate=rate;}
    public double calculateInterest(){return 0;}
    public boolean applyForLoan(double amount){return amount<=getBalance()*5;}
    public double calculateLoanEligibility(){return getBalance()*5;}
}