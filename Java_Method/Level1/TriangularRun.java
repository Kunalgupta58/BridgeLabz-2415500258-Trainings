import java.util.Scanner;
public class TriangularRun{
  public static long roundsForFiveKm(double a,double b,double c){
    double perimeter=a+b+c;
    if(perimeter<=0) return 0;
    return (long)Math.ceil(5000.0/perimeter);
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    System.out.println(roundsForFiveKm(a,b,c));
  }
}
