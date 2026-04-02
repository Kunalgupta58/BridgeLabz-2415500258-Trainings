class Student {
    int roll;
    String name;
    int age;
    char grade;
    Student next;

    Student(int r, String n, int a, char g) {
        roll = r;
        name = n;
        age = a;
        grade = g;
    }
}

class StudentList {
    Student head;

    void addFirst(int r, String n, int a, char g) {
        Student newNode = new Student(r, n, a, g);
        newNode.next = head;
        head = newNode;
    }

    void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name);
            temp = temp.next;
        }
    }
}