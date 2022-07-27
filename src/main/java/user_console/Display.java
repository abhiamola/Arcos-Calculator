package user_console;

import util.NewMath;

import java.util.Scanner;

public class Display {
    private Integer input;
    private Scanner scanner = new Scanner(System.in);

    public void display() {
        System.out.println("   _____ ___________________   _________  ________    _________\n" +
                "  /  _  \\\\______   \\_   ___ \\  \\_   ___ \\ \\_____  \\  /   _____/\n" +
                " /  /_\\  \\|       _/    \\  \\/  /    \\  \\/  /   |   \\ \\_____  \\ \n" +
                "/    |    \\    |   \\     \\____ \\     \\____/    |    \\/        \\\n" +
                "\\____|__  /____|_  /\\______  /  \\______  /\\_______  /_______  /\n" +
                "        \\/       \\/        \\/          \\/         \\/        \\/ ");
        System.out.println("Welcome to arc cos calculator: ");
        while(true) {
            System.out.println("[1] Calculate arcos");

            System.out.println("Enter your choice :");

            input = scanner.nextInt();

            switch(input) {
                case 1:
                    Double inputForAcos;
                    Scanner scannerAcos = new Scanner(System.in);
                    System.out.println("Enter your value to calculate acos: ");
                    inputForAcos = scannerAcos.nextDouble();

                    double result = NewMath.acos(inputForAcos);
                    System.out.println("The acos result of your value is : "+result);

                    this.askIfUserWantsToQuite();

                    break;
                default:
                    break;
            }
        }
    }

    private void askIfUserWantsToQuite() {
        String ans;
        Scanner ansScanner = new Scanner(System.in);

        System.out.println("\nDo you want to continue anymore?");

        ans = ansScanner.nextLine();

        if(ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } else {
            System.out.println("Exiting the program.");
            System.exit(1);
        }
    }
}
