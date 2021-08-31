
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String answer = scanner.nextLine();
        try(Scanner file = new Scanner(Paths.get(answer))){
        while(true){
            if(file.hasNextLine()){
                String line = file.nextLine();
                System.out.println(line);
            }else{
                break;
            }

        }
        }
        catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
