import java.util.Scanner;
public class BMICalculator{
  public static double computeBMI(double weightKg,double heightCm){
    double h=heightCm/100.0;
    return weightKg/(h*h);
  }
  public static String bmiStatus(double bmi){
    if(bmi<18.5) return "Underweight";
    else if(bmi<25) return "Normal";
    else if(bmi<30) return "Overweight";
    else return "Obese";
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double[][] data=new double[10][3];
    for(int i=0;i<10;i++){
      double weight=sc.nextDouble();
      double height=sc.nextDouble();
      data[i][0]=weight;
      data[i][1]=height;
      data[i][2]=computeBMI(weight,height);
    }
    for(int i=0;i<10;i++){
      System.out.println("Height: "+data[i][1]+" cm Weight: "+data[i][0]+" kg BMI: "+data[i][2]+" Status: "+bmiStatus(data[i][2]));
    }
  }
}
