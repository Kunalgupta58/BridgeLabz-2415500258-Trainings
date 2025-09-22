import java.util.*;
public class EmployeeManagementMain{
    public static void main(String[] args){
        List<Employee> list=new ArrayList<>();
        FullTimeEmployee f=new FullTimeEmployee("F001","Alice",50000,5000);
        f.assignDepartment("HR");
        PartTimeEmployee p=new PartTimeEmployee("P001","Bob",300,80);
        p.assignDepartment("Support");
        list.add(f);list.add(p);
        for(Employee e:list) e.displayDetails();
    }
}