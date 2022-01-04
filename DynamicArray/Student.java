package DataStructures.DynamicArray;

public class Student {
    private String name, address;
    private int id;
    private double mark;

    public Student(int $id, String $name, String $address, double $mark){
        id = $id;
        name = $name;
        address = $address;
        mark = $mark;
    }

    public String getAddress() {
        return address;
    }
    
    public int getId() {
        return id;
    }

    public double getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ("Student{" + "id: " + id + ", name: " + name + ", address: " + address + ", mark: " + mark + '}');
    }
}