
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String answer = scanner.nextLine();
            if(answer.isEmpty()){
                break;
            }
            String[] split = answer.split(" ");
            for(String word : split){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }
        }

    }
}
