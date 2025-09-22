public class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double fixedAllowance;
    public FullTimeEmployee(String id,String name,double baseSalary,double fixedAllowance){
        super(id,name,baseSalary);this.fixedAllowance=fixedAllowance;
    }
    public double getFixedAllowance(){return fixedAllowance;}
    public void setFixedAllowance(double a){fixedAllowance=a;}
    public double calculateSalary(){return getBaseSalary()+fixedAllowance;}
    public void assignDepartment(String d){department=d;}
    public String getDepartmentDetails(){return department;}
}