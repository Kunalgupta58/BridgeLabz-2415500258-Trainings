class Ticket {
    int id;
    Ticket next;

    Ticket(int i) {
        id = i;
    }
}

class TicketSystem {
    Ticket head;

    void add(int id) {
        Ticket newNode = new Ticket(id);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        Ticket temp = head;
        while (temp.next != head) temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }
}