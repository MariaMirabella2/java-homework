package tema3;

public class car  extends  vehicle{
    private String brand;
    private  int speed;
    private  int fuel;

    public car(int wheels, String way, String brand, int speed, int fuel) {
        super(wheels, way);
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
    }

    public car(String brand, int speed, int fuel) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
    }
    public  car(){
    super(0,"");
    }
}
