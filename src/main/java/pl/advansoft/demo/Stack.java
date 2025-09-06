package pl.advansoft.demo;

public class Stack<T> {

    private record Node<T>(Node<T> prev, T value) {
    }

    private Node<T> head;

    public Stack() {
        head = null;
    }

    public void put(T value) {
        head = new Node<>(head, value);
    }

    public T get() {
        if (head == null) {
            return null;
        }

        T value = head.value();
        head = head.prev();

        return value;
    }
}
