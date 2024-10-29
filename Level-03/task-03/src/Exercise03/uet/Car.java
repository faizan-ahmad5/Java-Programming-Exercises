package Exercise03.uet;

public class Car {
    private String model;
    private String color;
    private int speed;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            System.out.println("Error: Speed cannot be negative. Please enter a valid speed.");
        } else {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }
}
