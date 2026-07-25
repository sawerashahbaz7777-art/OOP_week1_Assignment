public class car {
    // attributes
    private String brand;
    private String colour;
    private int speed;
    private String gear;
    private int fuel;
    private boolean engineOn;
// default constructor
public car() {
    this.brand = "Unknown";
    this.colour = "Unpainted";
    this.speed = 0;
    this.gear = "Park";
    this.fuel = 100;
    this.engineOn = false;
}
// parameterized constructor
public car(String brand, String colour, int speed, String gear, int fuel, boolean engineOn) {
    this.brand = brand;
    this.colour = colour;
    this.speed = speed;
    this.gear = gear;
    this.fuel = fuel;
    this.engineOn = engineOn;
}

public void startEngine(){
    this.engineOn = true;
    this.gear = "Drive";
System.out.println("Engine started. Gear is now in Drive.");
}


public void moveFast(){
    if (this.engineOn && this.fuel > 0) {
        this.speed += 20;
        this.fuel -= 10;
        System.out.println(this.brand + " " + this.colour + " is moving fast. Current speed: " + this.speed + " km/h. Fuel left: " + this.fuel + "%.");
    }
}


public void horn(){
    System.out.println("Beep Beep!");
} 


public void moveSlow(){
    if (this.engineOn && this.fuel > 0) {
        this.speed += 10;
        this.fuel -= 5;
        System.out.println(this.brand + " " + this.colour + " is moving slow. Current speed: " + this.speed + " km/h. Fuel left: " + this.fuel + "%.");
    }
}

public void changeSpeed(int newSpeed) {
    if (this.engineOn && this.fuel > 0) {
        this.speed = newSpeed;
        System.out.println(this.brand + " " + this.colour + " speed changed to: " + this.speed + " km/h.");
    } else {
        System.out.println("Cannot change speed. Either the engine is off or there's no fuel.");
    }
}

public void stopEngine(){
    this.engineOn = false;
    this.speed = 0;
    this.gear = "Park";
    System.out.println("Engine stopped. Gear is now in Park.");
}


public void displayDetails() {
    System.out.println("Car Details:");
    System.out.println("Brand: " + this.brand);
    System.out.println("Colour: " + this.colour);
    System.out.println("Speed: " + this.speed + " km/h");
    System.out.println("Gear: " + this.gear);
    System.out.println("Fuel: " + this.fuel + "%");
    System.out.println("Engine On: " + this.engineOn);
}
}
