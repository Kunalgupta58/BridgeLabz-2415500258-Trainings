import java.util.*;
abstract class CourseType{ public String name(){return getClass().getSimpleName();} }
class ExamCourse extends CourseType{}
class AssignmentCourse extends CourseType{}
class ResearchCourse extends CourseType{}
class Course<T extends CourseType>{
    private final String title;
    private final T type;
    public Course(String title,T type){this.title=title;this.type=type;}
    public String toString(){return title+"-"+type.name();}
}
class CourseView{
    public static void show(java.util.List<? extends CourseType> list){
        for(CourseType c:list)System.out.println(c.name());
    }
}
class CourseDemo{
    public static void main(String[] args){
        Course<ExamCourse> ce=new Course<>("Math",new ExamCourse());
        Course<AssignmentCourse> ca=new Course<>("Programming",new AssignmentCourse());
        java.util.List<CourseType> l=new java.util.ArrayList<>();
        l.add(new ExamCourse());
        l.add(new ResearchCourse());
        System.out.println(ce);
        System.out.println(ca);
        CourseView.show(l);
    }
}
