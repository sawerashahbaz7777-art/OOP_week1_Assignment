public class Main {
    public static void main(String[] args) { 
        // memory stored in a heep 
        Calculator calc = new Calculator();

        // 1. Division
        System.out.println("Divide 10 / 2: " + calc.divide(10, 2));
        System.out.println("Divide 10 / 0: " + calc.divide(10, 0));

        // 2. Power
        System.out.println("Power 2^3: " + calc.power(2, 3));
        System.out.println("Power 5^0: " + calc.power(5, 0));

        // 3. Modulus
        System.out.println("Modulus 10 % 3: " + calc.modulus(10, 3));
        System.out.println("Modulus 10 % 0: " + calc.modulus(10, 0));

        // 4. Average
        System.out.println("Average (10, 20, 30): " + calc.average(10, 20, 30));
        System.out.println("Average (empty): " + calc.average());
    }
}
