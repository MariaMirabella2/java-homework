package tema3;

public class vehicle {
    private int wheels;
    private  String way; //air, water

    public vehicle(int wheels, String way) {
        this.wheels = wheels;
        this.way = way;
    }

    public vehicle() {
        wheels=0;
        way = "";
    }

    public int getWheels() {
        return wheels;
    }

    public String getWay() {
        return way;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setWay(String way) {
        this.way = way;
    }
}
