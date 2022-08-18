import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");

            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    buyCoffee();
                    break;

                case "fill":
                    fillMachine();
                    break;

                case "take":
                    takeMoney();
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

    public static void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.nextLine();

        switch(choice) {
            case "1":
                if(water < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (water >= 250) {
                    water -= 250;
                }

                if(beans < 16){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                if (beans >= 16) {
                    beans -= 16;
                }

                if(cups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                if (cups >= 1){
                    cups -= 1;
                }

                money += 4;

                System.out.println("I have enough resources, making you a coffee!");
                System.out.println("---");

                doingCoffee();
                break;

            case "2":
                if(water < 350){
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (water >= 350) {
                    water -= 350;
                }

                if(milk < 75){
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if (milk >= 75) {
                    milk -= 75;
                }

                if(beans < 20){
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                if (beans >= 20) {
                    beans -= 20;
                }

                if(cups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                if (cups >= 1) {
                    cups -= 1;
                }

                money += 7;

                System.out.println("I have enough resources, making you a coffee!");
                System.out.println("---");

                doingCoffee();
                break;

            case "3":
                if(water < 200){
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (water >= 200) {
                    water -= 200;
                }

                if(milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if (milk >= 100) {
                    milk -= 100;
                }

                if(beans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                if (beans >= 12) {
                    beans -= 12;
                }

                if(cups < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                if (cups >= 1) {
                    cups -= 1;
                }

                money += 6;

                System.out.println("I have enough resources, making you a coffee!");
                System.out.println("---");

                doingCoffee();
                break;

            case "back":
                break;
        }
    }

    public static void doingCoffee() {
        System.out.println("Starting to make a coffee");
        System.out.println();
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }

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

    public static void takeMoney() {
        if(money == 0) {
            System.out.println("I don't have money to give you");
            return;
        }
        System.out.println("I gave you $"+ money);
        money = 0;
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

