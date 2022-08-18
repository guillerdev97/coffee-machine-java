import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Write action (remaining, exit):");

            String action = scanner.nextLine();

            switch (action) {
                case "remaining":
                    machineInfo(water, milk, beans, cups, money);
                    break;

                case "exit":
                    System.out.println("See you soon!");
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }

    static int water = 350;
    static int milk = 1200;
    static int beans = 150;
    static int cups = 100;
    static int money = 50;

    public static void machineInfo(int water, int milk, int beans, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println();
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }
}

