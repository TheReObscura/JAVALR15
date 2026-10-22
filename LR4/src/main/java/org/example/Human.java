package org.example;

public class Human {
    String name;
    Gender gender;

    public Human(String name, Gender _g){
        this.name = name;
        gender = _g;
    }
    public void print(){
        System.out.println("Имя: " + name + ", пол: " + (gender == Gender.FEMALE?"женский":"мужской"));
    }
}
