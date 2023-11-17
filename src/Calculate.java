import java.util.Scanner;

public class Calculate{
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue){
            System.out.print("1-Exit or 2-calculate");
            switch (scanner.nextInt()){
                case 1 -> isTrue = false;
                case 2 -> {
                    System.out.print("enter first number: ");
                    int number = scanner.nextInt();
                    System.out.print("enter second number: ");
                    int number2 = scanner.nextInt();
                    System.out.print("enter choice (*, /, -, +) :");
                    switch (new Scanner(System.in).nextLine().toLowerCase()){
                        case "*" -> {
                            int res = number * number2;
                            System.out.println(number + " * " + number2 + " = " + res);
                        }
                        case "/" -> {
                            int res = number / number2;
                            System.out.println(number + " / " + number2 + " = " + res);
                        }
                        case "-" -> {
                            int res = number - number2;
                            System.out.println(number + " - " + number2 + " = " + res);
                        }
                        case "+" -> {
                            int res = number + number2;
                            System.out.println(number + " + " + number2 + " = " + res);
                        }
                    }
                }
                default -> System.out.println("Enter correct choice!");
            }
        }
    }
}
