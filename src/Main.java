import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Lab 3");
	// write your code here
        boolean exit = false;
        while(!exit) {
            System.out.println("choose task:");
            System.out.println("1. Task1;\n2. Task23;\n");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Tests.task1();
                    break;
                case 23:
                    Tests.task23();
                    break;
                case -1:
                    exit = true;
                default:
                    System.out.println("there is no such option :(");
                    break;
            }
            System.out.println("========================================================================================\n\n\n\n\n");
        }
    }
}
