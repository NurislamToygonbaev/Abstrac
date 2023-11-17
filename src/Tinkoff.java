import java.util.Scanner;

public class Tinkoff {
    public static void bank() {
        Scanner scanner = new Scanner(System.in);
        double cash = 10000d;
        int pinCode = 1111;
        System.out.println(STR."Эскертуу, катасы жок ПИН код жазыныз, болбосо эсеп боготтолот!");
        System.out.print(STR."Пин код жазыныз: ");
        int buttonForPinCode = new Scanner(System.in).nextInt();
        if (buttonForPinCode == pinCode) {
            System.out.println(STR."тилдерди танданыз: ");
            boolean running = true;
            while (running) {
                iPhone.bankMenu();
                System.out.print(STR."Тандоонузду киргизиниз: ");
                int buttonForMenu = scanner.nextInt();
                switch (buttonForMenu) {
                    case 1 -> System.out.println(STR. "Сиздин балансыныз: $\{ cash }" );
                    case 2 -> {
                        boolean proverka = true;
                        while (proverka) {
                            System.out.print(STR."номер жазыныз: +996 ");
                            int numberPhone = scanner.nextInt();
                            System.out.print(STR."Салынуучу сумманы киргизиниз: ");
                            double withdrawMoney = scanner.nextDouble();
                            System.out.println(STR. "Телефон номер: \{ numberPhone } |сумма: \{ withdrawMoney }" );
                            System.out.println(STR."подвердите + или назад -");
                            switch (new Scanner(System.in).nextLine()) {
                                case "+" -> {
                                    if (withdrawMoney > 0 && withdrawMoney <= cash) {
                                        cash -= withdrawMoney;
                                        System.out.println(STR. "$\{ withdrawMoney } эсебинизден чыгарылды." );
                                        proverka = false;
                                    } else {
                                        System.out.println(STR."Баланс жетишсиз. жарактуу сумманы киргизиниз.");
                                    }
                                }
                                case "-" -> proverka = false;
                                default -> System.out.println("Incorrect choice!");
                            }
                        }
                    }
                    case 3 -> running = false;
                    default -> System.out.println(STR."Жарамсыз тандоо. Тандоонузду текшерип, кайра киргизиниз.");
                }
            }
        } else {
            System.out.println(STR."жараксыз пин код. Каттоо эсебиңиз бөгөттөлдү.");
        }

    }
}
