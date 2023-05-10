import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to take a break?");
        String answer = scanner.nextLine();

        while (!answer.equalsIgnoreCase("yes")){
            System.out.println("Do you want to take a break?");
            answer = scanner.nextLine();
        }
    }
}
