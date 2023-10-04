class Student {
    private String name;
    private int age;
    private char grade;

    public Student() {
        this.name = "John Doe";
        this.age = 18;
        this.grade = 'A';
    }

    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 'N';
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class Main {
    public static void main(String[] args) {
        // Task 5: Create Student Instances with the default constructor
        Student student1 = new Student();
        System.out.println("Student 1 Info:");
        student1.displayInfo();
        System.out.println();

        // Task 6: Create Parameterized Student Instances
        Student student2 = new Student("Alice Smith", 20, 'B');
        System.out.println("Student 2 Info:");
        student2.displayInfo();
        System.out.println();

        // Task 7: Create Student Instance with the new constructor
        Student student3 = new Student("Bob Johnson", 22);
        System.out.println("Student 3 Info:");
        student3.displayInfo();
    }
}
