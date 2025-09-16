import java.util.Scanner;
public class TrigFunctions{
  public static double[] calculateTrig(double angle){
    double rad=Math.toRadians(angle);
    return new double[]{Math.sin(rad),Math.cos(rad),Math.tan(rad)};
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double angle=sc.nextDouble();
    double[] t=calculateTrig(angle);
    System.out.println("sin: "+t[0]);
    System.out.println("cos: "+t[1]);
    System.out.println("tan: "+t[2]);
  }
}
