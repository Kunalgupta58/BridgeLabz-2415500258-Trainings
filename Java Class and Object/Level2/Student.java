public class Student {
    String name;
    int rollNumber;
    double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayDetails() {
        System.out.println("Student Report");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + String.format("%.2f", marks));
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student student1 = new Student("Kunal Gupta", 101, 85.5);
        student1.displayDetails();
    }
}
