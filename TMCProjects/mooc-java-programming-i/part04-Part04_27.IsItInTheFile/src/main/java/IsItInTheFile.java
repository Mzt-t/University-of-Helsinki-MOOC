
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        try (Scanner fileSearch = new Scanner(Paths.get(file))) {
            while (fileSearch.hasNextLine()) {
                list.add(fileSearch.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        for(String line : list){
            if(list.contains(searchedFor)){
                System.out.println("Found!");
            } else{
                System.out.println("Not found.");
            }
        }
//        for(String line : list){
//            if(line.equals(searchedFor)){
//                System.out.println("Found!");
//                break;
//            }
//            else{
//                System.out.println("Not found!");
//            }
//        }
    }
}
