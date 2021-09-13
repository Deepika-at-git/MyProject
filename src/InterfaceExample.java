interface vehicles{
    void changeGear(int a);
    void speedUp(int a);
    void applyBreak(int a);
    default void print(){
        System.out.println("Default JDK1.8 method");
    }
}

class Bicycle implements vehicles{
    int gear;
    int speedUp=0;
    int speedDown=50;

    @Override
    public void changeGear(int newGear){
        gear=newGear;
    }

    @Override
    public void speedUp(int increment){
        speedUp= speedUp+increment;
    }

    @Override
    public void applyBreak(int decrement) {
        speedDown=speedDown-decrement;
    }

    public void display(){
        System.out.println("Bicycles details:");
        System.out.println("Gear: " + gear  +" SpeedUp by: " + speedUp + " SpeedDown by: " + speedDown);
    }
}

class Car implements vehicles{
    int gear;
    int speedUp=0;
    int speedDown=50;

    @Override
    public void changeGear(int a) {
        gear=a;
    }

    @Override
    public void speedUp(int a) {
        speedUp=speedUp+a;
    }

    @Override
    public void applyBreak(int a) {
        speedDown=speedDown-a;
    }

    public void display(){
        System.out.println("Car details are:");
        System.out.println("Gear :" + gear + " SpeedUp by: " + speedUp + " speedDown by: " + speedDown);
    }
}

public class InterfaceExample {

    public static void main(String[] args){
        Bicycle b = new Bicycle();
        b.changeGear(2);
        b.speedUp(40);
        b.applyBreak(10);
        b.display();

        Car c = new Car();
        c.changeGear(5);
        c.speedUp(20);
        c.applyBreak(15);
        c.display();

        Car cx = new Car();
        cx.print();

    }
}
