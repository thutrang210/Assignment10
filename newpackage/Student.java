
package constructor.newpackage;


public class Student {
    int id;
    String name;
    Student(int i, String n) {
        id =i;
        name=n;
    }
    void display(){
        System.out.println(id +" " +name);
    }
    public static void main(String[] args) {
        Student e1=new Student(111, "Karan");
        Student e2= new Student(222,"Aryan");
        e1.display();
        e2.display();
    }
}
