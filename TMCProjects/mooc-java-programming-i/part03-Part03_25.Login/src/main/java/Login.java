
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
//        String[] username = {"alex","emma"};
//        String[] password = {"sunshine","haskell"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String answer = scanner.nextLine();
        System.out.println("Enter password:");
        String answer2 = scanner.nextLine();
        if(answer.equals("alex")&& answer2.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        } else if (answer.equals("emma")&& answer2.equals("haskell")){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
