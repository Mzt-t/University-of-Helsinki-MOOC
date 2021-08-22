
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String answer = scanner.nextLine();
            if(answer.isEmpty()){
                break;
            }
            String[] split = answer.split(" ");
            System.out.println(split[0]);
        }

    }
}
