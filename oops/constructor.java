package oops;
class Student{
    int id ;
    String name;
    // Default Constructor
    Student(){
        System.out.println("Default Constructor called");
    }
    // Parameterized Constructor -> Constructor overloading
    Student(String name){
        System.out.println("Student name is : "+ name);
    }

    // Parameterized Constructor without using 'this' keyword here.
    /*
    Student(int myid , String myname){
        id = myid;
        name = myname;
    }
    */
    Student(int id , String name){
        this.id = id;
        this.name = name;
    }
}
public class constructor {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student();
        s1.id = 1;
        s1.name= "Aayush";
        System.out.println(s1.name+ " " +s1.id);

        Student s3= new Student("Dino");

        Student s4= new Student(2,"Stuart");
        System.out.println(s4.name);
    }
}

