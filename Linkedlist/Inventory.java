class Item {
    int id, qty;
    double price;
    Item next;

    Item(int i, int q, double p) {
        id = i;
        qty = q;
        price = p;
    }
}

class Inventory {
    Item head;

    void add(int i, int q, double p) {
        Item newNode = new Item(i, q, p);
        newNode.next = head;
        head = newNode;
    }

    double total() {
        double sum = 0;
        Item temp = head;
        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        return sum;
    }
}