class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN; // Standard Java value for "Not a Number"
        }
        return a / b;
    }

    public double power(double base, double exp) {
        return Math.pow(base, exp);
    }

    public double modulus(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot mod by zero!");
            return Double.NaN;
        }
        return a % b;
    }

    public double average(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("Error: No numbers provided!");
            return Double.NaN;
        }
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
}
