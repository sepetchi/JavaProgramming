package day30_CustomClass;

public class Employee {
    public String name;
    public  int age;
    public char gender;
    public int id;
    public String jobTitle;
    public double salary;
    public  boolean isFullTime;

    public void setInfo(String name, int age, char gender, int id, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", Id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jobTitle+" "+ name + " is working");
    }
}

