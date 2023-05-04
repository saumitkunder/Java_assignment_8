import java.util.Scanner;

public class NomatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        try {
            if (!input.equals("India")) {
                throw new NOMATCHEXCP(input);
            }
            System.out.println("You entered: " + input);
        } catch (NOMATCHEXCP e) {
            System.out.println(e);
        }
    }
}
class NOMATCHEXCP extends Exception {
    private String input;
    public NOMATCHEXCP(String input) {
        this.input = input;
    }
    @Override
    public String toString() {
        return "NOMATCHEXCP: \"" + input + "\" is not equal to \"India\"";
    }
}