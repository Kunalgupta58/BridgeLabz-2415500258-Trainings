import java.util.Scanner;
public class NumberAnalysis{
  public static boolean isPositive(int n){return n>0;}
  public static boolean isEven(int n){return n%2==0;}
  public static int compare(int a,int b){if(a>b) return 1; if(a==b) return 0; return -1;}
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    for(int i=0;i<5;i++){arr[i]=sc.nextInt();}
    for(int n:arr){
      if(isPositive(n)){System.out.print("Positive "); if(isEven(n)) System.out.println("Even"); else System.out.println("Odd");}
      else System.out.println("Negative");
    }
    int cmp=compare(arr[0],arr[4]);
    if(cmp==0) System.out.println("First and Last are equal");
    else if(cmp>0) System.out.println("First greater than Last");
    else System.out.println("First less than Last");
  }
}
