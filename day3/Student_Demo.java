import java.util.Scanner;

class Student {
    int roll_no;
    int marks;
    Student(int r, int m) {
        roll_no = r;
        marks = m;
    }
    void show() {
        System.out.println(" roll number: " + roll_no + ", marks: " + marks);
    }
}

class Student_Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++) {
            System.out.print(" enter roll number" + (i + 1) + " ");
            int roll_no = s.nextInt();
            System.out.print(" enter marks" + (i + 1) + " " );
            int marks = s.nextInt();
            students[i] = new Student(roll_no, marks);
        }
        System.out.println(" details");
        for (Student student : students) {
            student.show();
            
        }
    }
}
