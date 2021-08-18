
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int amount=0;
        int odd=0;
        int even=0;
        System.out.println("Give numbers:");
        while(true){
            int answer = Integer.parseInt(scanner.nextLine());
            if(answer==-1){
                System.out.println("Thx! Bye!");
                break;
            }
            if(answer%2==0){
                even++;
            } else{
                odd++;
            }
            sum+=answer;
            amount++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + amount);
        System.out.println("Average: " + (1.0*sum/amount));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
