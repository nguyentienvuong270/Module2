package BT.BT1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    // Constructor mặc định
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Constructor với dung lượng tự chọn
    public MyList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        elements = new Object[capacity];
    }

    // Thêm phần tử vào cuối danh sách
    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    // Thêm phần tử vào vị trí index
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    // Xóa phần tử tại index
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        E removedElement = (E) elements[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null; // clear reference
        return removedElement;
    }

    // Trả về số phần tử
    public int size() {
        return size;
    }

    // Clone danh sách
    @SuppressWarnings("unchecked")
    public MyList<E> clone() {
        MyList<E> clone = new MyList<>(elements.length);
        clone.size = this.size;
        clone.elements = Arrays.copyOf(this.elements, this.elements.length);
        return clone;
    }

    // Kiểm tra có chứa phần tử hay không
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    // Tìm index của phần tử
    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) return i;
            }
        }
        return -1;
    }

    // Đảm bảo dung lượng mảng
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = Math.max(elements.length * 2, minCapacity);
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    // Lấy phần tử tại index
    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }
        return (E) elements[i];
    }

    // Xóa tất cả phần tử
    public void clear() {
        Arrays.fill(elements, 0, size, null);
        size = 0;
    }
}
