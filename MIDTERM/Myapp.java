
import java.text.DecimalFormat;
import java.util.Scanner;

public class Myapp {

    int ch;
    String again;
    Scanner sc = new Scanner(System.in);
    double code, peso, dollar, euro;

    public void displayMenu() {

        System.out.println("<<<<<< Ronx2 Currency Converter >>>>>>");
        System.out.println("");
        System.out.println("	1. Currency Converter				 ");
        System.out.println("	2. EXIT 				 \n");
    }

    public void order() {
        while (true) {

            System.out.print("Enter Your Choice: \n");
            System.out.print("");

            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println();
                    System.out.println(
                            "<<<<< Welcome to Ron x2 Currency Converter >>>>>\n\n1 - Peso to Dollar\n2 - Dollar to Peso\n3 - Euro to Peso\n4 - Peso to Euro\n");
                    try (Scanner sc = new Scanner(System.in)) {
                        code = sc.nextInt();
                        DecimalFormat f = new DecimalFormat("##.###");

                        if (code == 1) {
                            System.out.println("Peso to Dollar");
                            System.out.println("Enter amount in Philippines Peso:");
                            peso = sc.nextFloat();
                            dollar = peso / 56.3947;
                            System.out.println("United states Dollar : USD " + f.format(dollar));
                            System.out.println();
                            System.out.println("Do you wish to select again? (Y/N) : ");
                            again = sc.next();
                            if (again.equalsIgnoreCase("Y")) {
                                order();
                            } else if (again.equalsIgnoreCase("N")) {
                                System.exit(1);
                            } else {
                                System.out.println("Invalid Choice");
                            }
                        } else if (code == 2) {
                            System.out.println("Dollar to Peso");
                            System.out.println("Enter amount in United States Dollar:");
                            dollar = sc.nextFloat();
                            peso = dollar / 0.0177330;
                            System.out.println("Philippine Peso : PHP " + f.format(peso));
                            System.out.println();
                            System.out.println("Do you wish to select again? (Y/N) : ");
                            again = sc.next();
                            if (again.equalsIgnoreCase("Y")) {
                                order();
                            } else if (again.equalsIgnoreCase("N")) {
                                System.exit(1);
                            } else {
                                System.out.println("Invalid Choice");
                            }
                        } else if (code == 3) {
                            System.out.println("Euro to Peso");
                            System.out.println("Enter amount in Euro:");
                            euro = sc.nextFloat();
                            peso = euro / 0.0176760;
                            System.out.println("Philippine Peso : PHP " + f.format(peso));
                            System.out.println();
                            System.out.println("Do you wish to select again? (Y/N) : ");
                            again = sc.next();
                            if (again.equalsIgnoreCase("Y")) {
                                order();
                            } else if (again.equalsIgnoreCase("N")) {
                                System.exit(1);
                            } else {
                                System.out.println("Invalid Choice");
                            }
                        } else if (code == 4) {
                            System.out.println("Peso to Euro");
                            System.out.println("Enter amount in Philippine Peso:");
                            peso = sc.nextFloat();
                            euro = peso / 56.3947;
                            System.out.println("Euro : EUR " + f.format(euro));
                            System.out.println();
                            System.out.println("Do you wish to select again? (Y/N) : ");
                            again = sc.next();
                            if (again.equalsIgnoreCase("Y")) {
                                order();
                            } else if (again.equalsIgnoreCase("N")) {
                                System.exit(1);
                            } else {
                                System.out.println("Invalid Choice");
                            }
                        } else
                            System.out.println("Invalid Code!");
                    }
                case 2:
                    System.exit(1);
                    break;

                default:
                    break;
            }
        }
    }
}
