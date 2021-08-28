
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String answer = scanner.nextLine();
            if(answer.isEmpty()){
                break;
            }
            items.add(new Item(answer));
        }
        for(Item i : items){
            System.out.println(i.toString());
        }

    }
}
