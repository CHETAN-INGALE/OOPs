abstract class Animal{
    public abstract void animalsound();
    public void sleep(){
        System.out.println("ZZZZZZZZZZ\n");
    }
}

class Pig extends Animal{
    public void animalsound(){
        System.out.println("weee weee\n");
    }
}

public class Abs {
    public static void main(String[] args) {
        Pig mypig = new Pig();
        mypig.animalsound();
        mypig.sleep();
    }    
}
