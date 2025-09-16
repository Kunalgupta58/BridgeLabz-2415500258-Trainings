import java.util.Scanner;
public class QuotientRemainder{
  public static int[] quotientAndRemainder(int number,int divisor){
    int q=number/divisor;
    int r=number%divisor;
    return new int[]{q,r};
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int divisor=sc.nextInt();
    int[] qr=quotientAndRemainder(number,divisor);
    System.out.println("Quotient: "+qr[0]+" Remainder: "+qr[1]);
  }
}
