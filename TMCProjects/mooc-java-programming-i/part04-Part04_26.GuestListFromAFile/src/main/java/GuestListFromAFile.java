
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();;
        try(Scanner am = new Scanner(Paths.get(file))){
            System.out.println("");

            System.out.println("Enter names, an empty line quits.");
            while (true) {
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    break;
                }

                if(am.hasNextLine()){
                    if(name.equals(am.nextLine())){
                        System.out.println("The name is on the list.");
                        continue;
                    }
                }
                System.out.println("The name is not on the list.");
            }

            System.out.println("Thank you!");
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
