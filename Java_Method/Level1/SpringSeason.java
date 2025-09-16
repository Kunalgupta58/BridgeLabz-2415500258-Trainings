import java.util.Scanner;
public class SpringSeason{
  public static boolean isSpring(int month,int day){
    int md=month*100+day;
    int start=3*100+20;
    int end=6*100+20;
    return md>=start && md<=end;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int month=sc.nextInt();
    int day=sc.nextInt();
    if(isSpring(month,day)) System.out.println("Its a Spring Season");
    else System.out.println("Not a Spring Season");
  }
}
