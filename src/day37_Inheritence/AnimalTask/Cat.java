package day37_Inheritence.AnimalTask;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender,age, size, color);

    }
    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
