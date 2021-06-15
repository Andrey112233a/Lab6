package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person Tom = new Person();
        Tom.fullname = "Tom";
        Person Sam = new Person("Sam",20);
        Tom.move();
        Tom.talk();
        Sam.move();
        Sam.talk();
    }
}
 class Person{
    String fullname;
    int age;
    Person(){
        this.fullname=fullname;
        this.age=age;
    }
    Person(String f,int a){
        fullname="Sam";
        age=20;
    }
    
    void move(){
        System.out.println(this.fullname+" is speaking");
    }
    void talk(){
        System.out.println(this.fullname+" isn't speaking");
    }
}