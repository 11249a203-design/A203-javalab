class Student {
 String name;
 int rollno;
int marks;

 Student(String name, int rollno, int marks) {
this.name = name;
this.rollno = rollno;
this.marks = marks;
    }
 String calculateGrade() {
 if (marks >= 90)
return "A";
 else if (marks >= 80)
  return "B";
 else if (marks >= 70)
  return "C";
 else if (marks >= 60)
 return "D";
 else
 return "F";
    }
void displayDetails() {
System.out.println("Student name: " + name);
System.out.println("Roll number: " + rollno);
 System.out.println("Grade: " + calculateGrade());
 System.out.println();
    }
}
class StudentDemo {
public static void main(String[] args) {
Student s1 = new Student("Srun", 101, 95);
Student s2 = new Student("Ramesh", 102, 79);
s1.displayDetails();
s2.displayDetails();
 }
}
