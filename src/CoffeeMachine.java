import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Write action (fill, remaining, exit):");

            String action = scanner.nextLine();

            switch (action) {
                case "fill":
                    fillMachine();
                    break;

                case "remaining":
                    machineInfo(water, milk, beans, cups, money);
                    break;

                case "exit":
                    System.out.println("See you soon!");
                    System.exit(0);
                    break;
            }
        }
    }

    static Scanner scanner = new Scanner(System.in);

    static int water = 350;
    static int milk = 1200;
    static int beans = 150;
    static int cups = 100;
    static int money = 50;

    public static void fillMachine() {
        System.out.println("How many ml of water do you want to add?");
        int addWater = scanner.nextInt();

        System.out.println("How many ml of milk do you want to add?");
        int addMilk = scanner.nextInt();

        System.out.println("How many grams of coffee beans do you want to add?");
        int addBeans = scanner.nextInt();

        System.out.println("How many disposable cups of coffee do you want to add?");
        int addCups = scanner.nextInt();

        water += addWater;
        milk += addMilk;
        beans += addBeans;
        cups += addCups;
    }

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

