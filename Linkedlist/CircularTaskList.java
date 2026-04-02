class Task {
    int id;
    Task next;

    Task(int i) {
        id = i;
    }
}

class CircularTaskList {
    Task head;

    void add(int id) {
        Task newNode = new Task(id);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Task temp = head;
        while (temp.next != head) temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }
}