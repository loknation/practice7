import java.util.Scanner;

public class less100 {
    public static void main(String[] args) {
        int f = getinput();
    }
    private static int getinput(){
        Scanner scanner = new Scanner(System.in);
        int trash;
        do{
            System.out.printf("enter a number between 0 and 100");
            try {
                trash = scanner.nextInt();
                if (trash < 100) {
                    return trash;
                }
                throw new Exception();
            }catch (Exception e){
                System.out.println("Try again");
                scanner.nextLine();
            }
        }while(true);
    }
}
