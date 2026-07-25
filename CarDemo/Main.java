public class Main {
    public static void main(String[] args) {
        // Object 1: Black Toyota Corolla
        car corollaBlack = new car("Toyota Corolla", "Black", 0, "Park", 100, false);
        System.out.println("=== FIRST OBJECT ===");
        corollaBlack.displayDetails();
        corollaBlack.startEngine();
        corollaBlack.moveFast();
        corollaBlack.horn();
        corollaBlack.stopEngine();

        System.out.println("\n"); // Space between outputs

        // Object 2: alto
        car alto = new car("Suzuki Alto", "White", 0, "Park", 100, false);
        System.out.println("=== SECOND OBJECT ===");
        alto.displayDetails();
        alto.startEngine();
        alto.moveSlow();
        alto.changeSpeed(50);
        alto.horn();
        alto.stopEngine();
    }
}
