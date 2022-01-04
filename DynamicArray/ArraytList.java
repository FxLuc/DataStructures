package DataStructures.DynamicArray;

public class ArraytList<T> {
    private T[] data;
    private int capacity;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    public ArraytList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArraytList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.capacity = initialCapacity;
            this.data = (T[]) new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            clear();
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
    }

    public int getSize() {
        return this.size;
    }

    public int capacity() {
        return this.capacity;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void add(T data) {
        if (getSize() + 1 >= capacity()) {
            if (capacity() == 0)
                this.capacity = 1;
            else
                this.capacity *= 2;
            this.data = java.util.Arrays.copyOf(this.data, capacity());
        }
        this.data[this.size++] = data;
    }

    public boolean removeAt(int index) {
        if (index >= getSize() || index < 0)
            throw new IndexOutOfBoundsException();
        System.arraycopy(this.data, index + 1, this.data, index, getSize() - index - 1);
        --this.size;
        --this.capacity;
        return true;
    }

    public boolean removeByID(int id) {
        for (int i = 0; i < getSize(); i++) {
            if (((Student) this.data[i]).getId() == id) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public boolean remove(T data) {
        for (int i = 0; i < getSize(); i++) {
            if (this.data[i].equals(data)) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public T get(int index) {
        if (index >= getSize() || index < 0)
            throw new IndexOutOfBoundsException();
        return this.data[index];
    }

    public void set(int index, T student) {
        if (index >= getSize() || index < 0)
            throw new IndexOutOfBoundsException();
        this.data[index] = student;
    }

    public void clear() {
        for (int i = 0; i < getSize(); i++)
            this.data[i] = null;
        this.size = 0;
    }

    public void traverse() {
        for (int i = 0; i < getSize(); i++)
            System.out.println(this.data[i]);
    }

}
