package DataStructures.DynamicArray;

public class Main {
    public static void main(String[] args) {
        ArraytList<Student> studentList = new ArraytList<>();
        studentList.add(new Student(1, "Trung", "Da Nang", 8.4));
        studentList.add(new Student(2, "Hue", "Da Nang", 8.5));
        studentList.add(new Student(3, "Chi", "Ho Chi Minh", 7.4));
        studentList.add(new Student(4, "Hoa", "Da Nang", 8.2));
        studentList.add(new Student(5, "Lucian", "Gia Lai", 5.4));
        Menu menu = new Menu();
        menu.showMenu(studentList);

        // resutl:
        // 1: Add
        // 2: Display
        // 3: Remove by ID
        // 4: Remove at index
        // 5: Update
        // Else: Exit
        // Enter your choice: 2
        // Student{id: 1, name: Trung, address: Da Nang, mark: 8.4}
        // Student{id: 2, name: Hue, address: Da Nang, mark: 8.5}
        // Student{id: 3, name: Chi, address: Ho Chi Minh, mark: 7.4}
        // Student{id: 4, name: Hoa, address: Da Nang, mark: 8.2}
        // Student{id: 5, name: Lucian, address: Gia Lai, mark: 5.4}
    }
}
