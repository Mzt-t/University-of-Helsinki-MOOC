
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int i=0;i<number;i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i=0;i<number;i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int amountSpaces = size - 1;
        int amountStars = 1;
        for (int i = 0; i < size; i++) {
            printSpaces(amountSpaces);
            printStars(amountStars);
            amountSpaces--;
            amountStars++;
        }
    }

    public static void christmasTree(int height) {
        int amountSpaces = height - 1;
        int amountStars = 1;
        for(int i=0;i<height;i++){
            printSpaces(amountSpaces);
            printStars(amountStars);
            amountSpaces--;
            amountStars+=2;
        }
        for(int i=0;i<2;i++){
            printSpaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
