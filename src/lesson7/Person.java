package lesson7;

public class Person {
    private int age;
    private String name;
    private String move;


    public Person(int age, String name, String move) {
        this.age = age;
        this.name = name;
        this.move = move;
    }


    void speak() {
        System.out.println(name + " говорит " + "ему исполнилось " + age + " лет" + " и он любит бег.");
    }


}










