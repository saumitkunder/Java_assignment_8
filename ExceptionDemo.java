public class ExceptionDemo {
    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int n = Integer.parseInt(arg);
                long factorial = factorial(n);
                System.out.println(n + "! = " + factorial);
            } catch (NumberFormatException e) {
                System.out.println(arg + " is not a valid integer.");
            } catch (FactorialException e) {
                System.out.println(e);
            }
        }
    }
    public static long factorial(int n) throws FactorialException {
        if (n < 0 || n > 15) {
            throw new FactorialException(n);
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
class FactorialException extends Exception {
    private int number;
    public FactorialException(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "FactorialException: " + number + " is not in the range of 0 to 15";
    }
}
