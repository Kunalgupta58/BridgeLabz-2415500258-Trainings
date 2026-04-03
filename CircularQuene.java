class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularQuene {
    Node front;
    Node rear;

    void eneque(int val) {
        Node newnode = new Node(val);
        if (front == null) {
            front = newnode;
            rear = newnode;
            rear.next = front;
        } else {
            rear.next = newnode;
            rear = newnode;
            rear.next = front;
        }
    }

    void dequene() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        if (front == rear) { 
            front = null;
            rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        do {
            System.out.print(temp.data );
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQuene q = new CircularQuene();

        q.eneque(10);
        q.eneque(20);
        q.eneque(30);

        q.display(); // 10 20 30

        q.dequene();
        q.display(); // 20 30

        q.dequene();
        q.display(); // 30

        q.dequene();
        q.display(); // Queue is empty
    }
}