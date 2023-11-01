class veh{
    int maxsp = 120;
}


class car extends veh{
    int maxsp = 1000;
    void display(){
        System.out.println("max speed:"+ super.maxsp);
    }
}
class supers{
    public static void main(String[] args) {
        car c = new car();
        c.display();
    }
}