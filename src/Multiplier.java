import java.util.Scanner;

public class Multiplier {
    public static void main(String[] args) {
        int number = 1;
        int trash = 1;
        while (number != 0) {
            System.out.println("enter 0 to stop");
            System.out.println("What is your number");
            trash = getinput();
            number = trash * number;
            System.out.println(number);

        }
    }

    private static int getinput() {
        Scanner scanner = new Scanner(System.in);
        int trash;
        do {
            System.out.printf("enter a number");
            try {
                trash = scanner.nextInt();
                return trash;
            } catch (Exception e) {
                System.out.println("Try again");
                scanner.nextLine();
            }
        } while (true);
    }
}
