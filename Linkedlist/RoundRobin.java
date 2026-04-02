class Process {
    int id, burst;
    Process next;

    Process(int i, int b) {
        id = i;
        burst = b;
    }
}

class RoundRobin {
    Process head;

    void add(int id, int burst) {
        Process newNode = new Process(id, burst);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Process temp = head;
        while (temp.next != head) temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }
}