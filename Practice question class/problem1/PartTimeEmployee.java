public class PartTimeEmployee extends Employee implements Department {
    private String department;
    private double hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String id,String name,double hourlyRate,double hoursWorked){
        super(id,name,0);this.hourlyRate=hourlyRate;this.hoursWorked=hoursWorked;
    }
    public double calculateSalary(){return hourlyRate*hoursWorked;}
    public void assignDepartment(String d){department=d;}
    public String getDepartmentDetails(){return department;}
}