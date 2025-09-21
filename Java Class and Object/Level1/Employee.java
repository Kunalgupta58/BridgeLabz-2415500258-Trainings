class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + String.format("%.2f", salary));
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Kunal", 101, 75000.50);

        employee1.displayDetails();
    }
}