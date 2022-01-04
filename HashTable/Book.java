package DataStructures.HashTable;

public class Book {
    private int id;
    private String name;
    private int year;

    public Book() {
    }

    public Book(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", book name='" + getName() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }
}