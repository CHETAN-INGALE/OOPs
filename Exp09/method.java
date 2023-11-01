class Person{
    void message(){
        System.out.println("Person class");
    }
}
class student extends Person{
    void message(){
        System.out.println("Student Class");
    }
    void display(){
        message();
        super.message();
    }
}
class method{
    public static void main(String[] args) {
        student s = new student();
        s.display();
    }
}