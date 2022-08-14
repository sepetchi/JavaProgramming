package utilities;

import java.util.Arrays;

public class Student {

    public  String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, int studentID, char grade) {
        this(name,studentID);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}

class StudentObjects{
    public static void main(String[] args) {
        Day33_Statics.Student student1 = new Day33_Statics.Student("Ahmet");
        Day33_Statics.Student student2 = new Day33_Statics.Student("Aygun",'F');
        Day33_Statics.Student student3 = new Day33_Statics.Student("Niagara",11);
        Day33_Statics.Student student4 = new Day33_Statics.Student("Mert", 12,'A');
        Day33_Statics.Student student5 = new Day33_Statics.Student("Cihad",'M', 28);
        Day33_Statics.Student student6 = new Day33_Statics.Student("Suhaib",'M',27,13);
        Day33_Statics.Student student7 = new Day33_Statics.Student("Kamil",'M',42,14,'B');



        System.out.println(student1 == student2);
        System.out.println(student2);

        Day33_Statics.Student[] students = {student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));
    }

}
