class per{
    per(){
        System.out.println("person class constructor");
    }
}
class student extends per{
    student(){
        super();
        System.out.println("student class constructor");
    }
}

class person {
    public static void main(String[] args) {
        student s = new student();
    }
}