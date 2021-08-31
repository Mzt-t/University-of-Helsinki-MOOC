
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String amcik = scanner.nextLine();
            if(amcik.equals("end")){
                break;
            }

            System.out.println(Integer.valueOf(amcik)*Integer.valueOf(amcik)*Integer.valueOf(amcik));
        }
    }
}
