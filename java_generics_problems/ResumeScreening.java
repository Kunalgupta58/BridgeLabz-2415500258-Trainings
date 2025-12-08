import java.util.*;
abstract class JobRole{ public String title(){return getClass().getSimpleName();} }
class SoftwareEngineer extends JobRole{}
class DataScientist extends JobRole{}
class ProductManager extends JobRole{}
class Resume<T extends JobRole>{
    private final String candidate;
    private final T role;
    public Resume(String candidate,T role){this.candidate=candidate;this.role=role;}
    public String toString(){return candidate+"-"+role.title();}
}
class Pipeline{
    public static void handle(java.util.List<? extends JobRole> roles){
        for(JobRole r:roles)System.out.println(r.title());
    }
}
class ResumeDemo{
    public static void main(String[] args){
        Resume<SoftwareEngineer> r=new Resume<>("Alex",new SoftwareEngineer());
        System.out.println(r);
        java.util.List<JobRole> roles=new java.util.ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        Pipeline.handle(roles);
    }
}
