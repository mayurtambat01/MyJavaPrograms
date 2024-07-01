package AbtractClass;

public class Car extends Vehicle{

    int numGear;
    boolean isConvertable;

    @Override
    public boolean isMotorized() {
        return false;
    }

    public void printCar(){
        super.print();
        System.out.println("Color is : "+color);
        // System.out.println("maxSpeed is : "+maxSpeed);
        System.out.println("maxSpeed is : "+getMaxSpeed());
        System.out.println("numGear is : "+numGear);
        System.out.println("isConvertable is : "+isConvertable);
    }

    
}