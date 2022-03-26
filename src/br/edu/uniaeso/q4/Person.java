package br.edu.uniaeso.q4;

public class Person {
    /**
     * Person
     */
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
        else{
            System.out.println("Name cannot be null.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("Age cannot be lower than 0");
        }
    }
}
