import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Title: ");
            String answer = scanner.nextLine();
            if(answer.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pg = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication Year: ");
            int py = Integer.valueOf(scanner.nextLine());
            books.add(new Book(answer,pg,py));
        }
        System.out.print("What information will be printed?");
        String ans = scanner.nextLine();
        for(Book b : books){
            if(ans.equals("everything")){
                System.out.println(b.toString());
            } else if(ans.equals("name")){
                System.out.println(b.getName());
            }
        }
    }
}
