import java.util.Scanner;
public class Chocolates{
  public static int[] divideChocolates(int chocolates,int children){
    int each=children==0?0:chocolates/children;
    int rem=children==0?chocolates:chocolates%children;
    return new int[]{each,rem};
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int chocolates=sc.nextInt();
    int children=sc.nextInt();
    int[] res=divideChocolates(chocolates,children);
    System.out.println("Each child gets: "+res[0]+" Remaining chocolates: "+res[1]);
  }
}
