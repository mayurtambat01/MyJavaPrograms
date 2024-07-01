package AbtractClass;

public abstract class VehicleUse {

    public static void main(String[] args) {
        // Vehicle v= new Vehicle();
        // v.color="white";
        // v.setMaxSpeed(1010);
        // System.out.println(v.color + " " + v.getMaxSpeed());
        // v.print();

        Car c= new Car();
        c.numGear=10;

        c.color="RED";
        // c.maxSpeed=90;
        c.setMaxSpeed(90);
        c.printCar();
    }
}