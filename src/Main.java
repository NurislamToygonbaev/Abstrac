import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanForStr = new Scanner(System.in);
        short pinCode = 1111;
        boolean isTrue = true;
        iPhone.menuLOck();
        while (isTrue){
            System.out.print("Enter pinCode: ");
            short pin = scanner.nextShort();
            if (pinCode == pin) {
                iPhone.menu();
                System.out.print("Enter choice: ");
                String action = scanForStr.nextLine();
                switch (action) {
                    case "1" -> {
                        Calculate.calculate();
                    }
                    case "2" -> {
                        Notes notes = new Notes();
                        notes.note();

                    }
                    case "3" -> Tinkoff.bank();
                    case "4" -> isTrue = false;
                }
            } else {
                System.out.println("Incorrect choice");
            }
        }
    }
}
