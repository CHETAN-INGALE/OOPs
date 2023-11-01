package info;

class Student {
    String name;
    int rollno;
    String address;

    Student(String n, int r, String a) {
        name = n;
        rollno = r;
        address = a;
    }

    public void show(){
        System.out.println("\nName : " + name + "\nRoll No. : " + rollno + "\nAddress : " + address);
    }
}

class Record {
    public static void main(String[] args) {
        Student s1 = new Student("ABC", 23, "Sector 4");
        s1.show();
    }
}