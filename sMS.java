import java.util.ArrayList;
import java.util.Scanner;

class Student {

    private int id;
    private String name;
    private int age;
    private String course;

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Display Method
    public void showStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }
}

public class sMS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     

        ArrayList<Student> std = new ArrayList<>();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                // ADD STUDENT
                case 1:

                    Student s = new Student();

                    System.out.print("Enter ID: ");
                    s.setId(sc.nextInt());

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    s.setName(sc.nextLine());

                    System.out.print("Enter Age: ");
                    s.setAge(sc.nextInt());

                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    s.setCourse(sc.nextLine());

                    std.add(s);
                    

                    System.out.println("Student Added Successfully!");
                    break;

                // VIEW STUDENTS
                case 2:

                    if (std.isEmpty()) {
                        System.out.println("No Students Found!");
                    } else {

                        for (int i = 0 ; i < std.size(); i++) {
                            std.get(i).showStudent();
                        }
                    }
                    System.out.println("Case 2 is working");
                    break;

                // SEARCH STUDENT
                case 3:

                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student st : std) {

                        if (st.getId() == searchId) {

                            System.out.println("Student Found:");
                            st.showStudent();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                // DELETE STUDENT
                case 4:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean removed = false;

                    for (int i = 0; i < std.size(); i++) {

                        if (std.get(i).getId() == deleteId) {

                            std.remove(i);

                            System.out.println("Student Deleted Successfully!");

                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                // EXIT
                case 5:

                    System.out.println("Exiting Program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}