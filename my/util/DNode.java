package my.util;

public class DNode<T> {

    public T data;
    public DNode<T> prev;
    public DNode<T> next;

    public DNode(T data) {
        this.prev = null;
        this.next = null;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DNode<T> prev) {
        this.prev = prev;
    }

    public DNode<T> getNext() {
        return next;
    }

    public void setNext(DNode<T> next) {
        this.next = next;
    }

    
}
