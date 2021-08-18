
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amount = 0;
        while(true){
            System.out.println("Give a number:");
            int answer = Integer.parseInt(scanner.nextLine());
            sum+=answer;
            if(answer==0){
                break;
            }
            amount++;
        }
        System.out.println("Average of the numbers: "+(1.0*sum/amount));
    }
}
