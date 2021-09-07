
public class Main {

    public static void main(String[] args) {
        PaymentCard t = new PaymentCard(10);
        t.takeMoney(10);
        System.out.println(t.balance());
    }
}

