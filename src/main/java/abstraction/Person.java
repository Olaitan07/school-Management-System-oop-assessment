package abstraction;

public abstract class Person {
    private String name;
    private int age;

  // encapsulation: using private access modifier to hide the data and providing public getter and setter methods to access and modify the data

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void showRole() {
        System.out.println("I am a Person");
    }


}
