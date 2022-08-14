package day39_Recap.cydeoTask;

public class Student extends Person {
    private int studentId;
    private String fieldOfStudy;

    public Student(String name, int age, char gender, int studentId, String fieldOfStudy) {
        super(name, age, gender);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
    public void study(){
        System.out.println(getName()+" is studying");

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
