
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int whereTo = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from?");
        int whereFrom = Integer.parseInt(scanner.nextLine());


        for(int i=whereFrom;i<whereTo+1;i++){
            System.out.println(i);
        }
    }
}
