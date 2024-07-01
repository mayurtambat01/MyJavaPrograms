package AbtractClass;

public abstract class Vehicle {
    
    protected String color;
    private int maxSpeed;

    public abstract boolean isMotorized();

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void print(){
        System.out.println("Color is : "+color);
        System.out.println("Speed is : "+maxSpeed);
    }
}