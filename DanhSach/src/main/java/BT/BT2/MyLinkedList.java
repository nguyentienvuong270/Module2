package BT.BT2;

public class MyLinkedList <E>{
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    // Thêm vào vị trí bất kỳ
    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        Node newNode = new Node(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        numNodes++;
    }

    // Thêm đầu danh sách
    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    // Thêm cuối danh sách
    public void addLast(E e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        numNodes++;
    }

    // Xóa theo index
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        Node removedNode;
        if (index == 0) {
            removedNode = head;
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedNode = current.next;
            current.next = removedNode.next;
        }
        numNodes--;
        return (E) removedNode.data;
    }

    // Xóa theo object
    public boolean remove(Object e) {
        if (head == null) return false;
        if (head.data.equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(e)) {
                current.next = current.next.next;
                numNodes--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> cloneList = new MyLinkedList<>();
        Node current = head;
        while (current != null) {
            cloneList.addLast((E) current.data);
            current = current.next;
        }
        return cloneList;
    }

    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    public int indexOf(E o) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(o)) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i < 0 || i >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }
        Node current = head;
        for (int j = 0; j < i; j++) {
            current = current.next;
        }
        return (E) current.data;
    }

    @SuppressWarnings("unchecked")
    public E getFirst() {
        if (head == null) return null;
        return (E) head.data;
    }

    @SuppressWarnings("unchecked")
    public E getLast() {
        if (head == null) return null;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return (E) current.data;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }
}
