class Student{
String name;
int rollno;
int marks;
Student(String name, int rollno,int  marks){
      this.name=name;  
      this.rollno=rollno;
      this.marks=marks;
}
String calculategrade(){
if(marks>=90)
return"A";
else if(marks>=80)
return"B";
else if(marks>=70)
return"C";
else if(marks>=60)
return"D";
else
return"F";
}
void displayDetails(){
System.out.println("student name:" + name);
System.out.println("roll number:" + rollno);
System.out.println("marks:" + marks);
System.out.println("grade:" + calculategrade());
System.out.println();
}
}
class StudentDemo{
public static void main(String[] args) {
Student s1=new Student("srun",101,95);
Student s2=new Student("Priya",102,79);
s1.displayDetails();
s2.displayDetails();
}
} 