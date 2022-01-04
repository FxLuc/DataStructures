package DataStructures.DynamicArray;

import java.util.Scanner;

public class Menu {
    private Scanner scn;
    public Menu() {
    }
    
    public void showMenu(ArraytList<Student> studentList) {
        int choice;
        while (true) {
            choice = inputChoice();
            switch (choice) {
                case 1:
                    studentList.add(inputStudent());
                    break;
                case 2:
                    studentList.traverse();
                    break;
                case 3:
                    System.out.println(studentList.removeByID(inputID()));
                    break;
                case 4:
                    System.out.println(studentList.removeAt(inputIndex()));
                    break;
                case 5:
                    studentList.set(inputIndex(), inputStudent());
                    break;
                default:
                    return;
            }
        }
    }

    private int inputChoice() {
        scn = new Scanner(System.in);
        int choice;
        System.out.println("1: Add");
        System.out.println("2: Display");
        System.out.println("3: Remove by ID");
        System.out.println("4: Remove at index");
        System.out.println("5: Update");
        System.out.println("Else: Exit");
        System.out.print("Enter your choice: ");
        choice = scn.nextInt();
        return choice;
    }

    private Student inputStudent() {
        Student student = new Student(inputID(), inputName(), inputAddress(), inputMark());
        return student;
    }

    private int inputID() {
        scn = new Scanner(System.in);
        int id = 0;
        while (id == 0) {
            System.out.println("Enter student ID: ");
            id = scn.nextInt();
        }
        return id;
    }

    private int inputIndex() {
        scn = new Scanner(System.in);
        int index = -1;
        while (index == -1) {
            System.out.println("Enter index of array: ");
            index = scn.nextInt();
        }
        return index;
    }

    private double inputMark() {
        scn = new Scanner(System.in);
        double mark = -1;
        while (mark < 0 || mark > 10) {
            System.out.println("Enter student mark: ");
            mark = scn.nextDouble();
        }
        return mark;
    }

    private String inputName() {
        scn = new Scanner(System.in);
        String name = null;
        while (name == null) {
            System.out.println("Enter student name: ");
            name = scn.nextLine();
        }
        return name;
    }

    private String inputAddress() {
        scn = new Scanner(System.in);
        String address = null;
        while (address == null) {
            System.out.println("Enter student address: ");
            address = scn.nextLine();
        }
        return address;
    }
}