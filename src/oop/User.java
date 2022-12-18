package oop;

public class User {
    //1. 变量要私有化 private修饰
    private String name;
    private double height;
    private char gender;
    private int age;



    //3.无参构造器是默认的
    public User(){

    }

    public User(String name, double height, char gender, int age) {
        this.name = name;
        this.height = height;
        this.gender = gender;
        this.age = age;
    }



    
    //2. 需要提供  setter  &  getter 方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }



}
