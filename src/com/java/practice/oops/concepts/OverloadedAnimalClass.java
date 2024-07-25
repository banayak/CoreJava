package com.java.practice.oops.concepts;

public class OverloadedAnimalClass {
    private String name;
    private int age;

    public OverloadedAnimalClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showInfo(){
        System.out.println("Name: " + name+ " Age: " + age);
    }
    public void showInfo(String name, int age){
        System.out.println("Overloaded Method : Name: " + name+ " Age: " + age);
    }

    public void showInfo(String name){
        System.out.println("Overloaded Method 2: Name: " + name);
    }

    public boolean showInfo(Long name){
        System.out.println("Overloaded Method 2: Name: " + name);
        return false;
    }


    public static void main(String[] args) {
        OverloadedAnimalClass obj = new OverloadedAnimalClass("Tiger", 30);
        obj.showInfo();
        obj.showInfo("Chitta Tiger", 30);
        obj.showInfo("Chitta Tiger");
        obj.showInfo(40L);

    }

}
