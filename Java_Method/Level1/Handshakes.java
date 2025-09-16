import java.util.Scanner;
public class Handshakes{
  public static long maxHandshakes(long n){
    return n*(n-1)/2;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    System.out.println(maxHandshakes(n));
  }
}
