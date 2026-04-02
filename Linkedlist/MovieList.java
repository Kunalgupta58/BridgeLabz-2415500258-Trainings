class Movie {
    String title;
    Movie prev, next;

    Movie(String t) {
        title = t;
    }
}

class MovieList {
    Movie head, tail;

    void addEnd(String t) {
        Movie newNode = new Movie(t);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
}