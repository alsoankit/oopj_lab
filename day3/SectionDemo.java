class Student {
  int rollNo;
  int marks;

  public Student(int rollNo, int marks) {
      this.rollNo = rollNo;
      this.marks = marks;
  }

  public void show() {
      System.out.println("Roll No: " + rollNo + ", Marks: " + marks);
  }
}

class Section {
  Student[] students; 

  public Section(Student[] students) {
      this.students = students;
  }

  public void showAll() {
      for (Student student : students) {
          student.show();
      }
  }

  public void showHighest() {
      Student highest = students[0]; 
      for (Student student : students) {
          if (student.marks > highest.marks) {
              highest = student; 
          }
      }
      System.out.println("Student with the highest marks:");
      highest.show();
  }
}

public class SectionDemo {
  public static void main(String[] args) {
      Student[] students = {
          new Student(101, 85),
          new Student(102, 90),
          new Student(103, 78),
          new Student(104, 92) 
      };

      Section section = new Section(students);

      section.showAll();

      section.showHighest();
  }
}
