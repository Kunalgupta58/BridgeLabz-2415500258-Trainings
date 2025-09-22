import java.util.*;
public class BankingMain{
    public static void main(String[] args){
        List<BankAccount> list=new ArrayList<>();
        SavingsAccount s=new SavingsAccount("S001","Ravi",50000,4);
        CurrentAccount c=new CurrentAccount("C001","Sita",20000,0);
        list.add(s);list.add(c);
        for(BankAccount a:list){
            System.out.println(a.getAccountNumber()+" Interest:"+a.calculateInterest());
            if(a instanceof Loanable) System.out.println("Eligible loan:"+((Loanable)a).calculateLoanEligibility());
        }
    }
}