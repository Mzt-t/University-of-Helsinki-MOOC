
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int answer = Integer.valueOf(scan.nextLine());
        if(answer>4999 && answer<25001){
            System.out.println(100+((answer-5000)*0.08));
        } else if(answer>24999 && answer<55001){
            System.out.println(1700+((answer-25000)*0.10));
        } else if(answer>54999 && answer<200001){
            System.out.println(4700+((answer-55000)*0.12));
        } else if(answer>199999 && answer<999999){
            System.out.println(22100+((answer-200000)*0.15));
        } else if(answer>999999){
            System.out.println(142100+((answer-1000000)*0.17));
        } else {
            System.out.println("No tax!");
        }
    }
}
