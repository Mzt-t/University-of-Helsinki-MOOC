
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amount = 0;
        while(true){
            System.out.println("Give a number:");
            int answer = Integer.parseInt(scanner.nextLine());
            if(answer==0){
                break;
            }
            if(answer>0){
                sum+=answer;
                amount++;
            }
        }
        if(sum>0){
            System.out.println("Average of the numbers: "+(1.0*sum/amount));
        } else{
            System.out.println("Cannot calculate the average");
        }
    }
}
