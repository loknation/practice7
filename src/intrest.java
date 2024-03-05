import java.util.Scanner;

public class intrest {
    public static void main(String[] args) {
        getinput(); //totally useless
        System.out.println("it will take "  + (Math.log(2)/0.05) + "years");
    }
    private static float getinput() {
        Scanner scanner = new Scanner(System.in);
        float trash;
        do {
            System.out.printf("enter a number");
            try {
                trash = scanner.nextFloat();
                return trash;
            } catch (Exception e) {
                System.out.println("Try again");
                scanner.nextLine();
            }
        } while (true);
    }
}