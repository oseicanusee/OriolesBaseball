package OriolesBaseball;

import java.util.Scanner;

public class OriolesBaseball {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Type 1 to enter a number or 2 to enter a name: ");
        int number = scanner.nextInt();

        while (true) {
            if (number == 1) {
                System.out.print("Enter player number: ");
                int playerNumber = scanner.nextInt();

                    if (playerNumber == 10 || playerNumber == 16 || playerNumber == 36 || playerNumber == 19) {

                    System.out.print("Which player wears number " + playerNumber + " on his jersey? ");
                    String name = scanner.next();

                        if ((name.equalsIgnoreCase("Jones") && playerNumber == 10) ||
                            (name.equalsIgnoreCase("Mancini") && playerNumber == 16) ||
                            (name.equalsIgnoreCase("Joseph") && playerNumber == 36) ||
                            (name.equalsIgnoreCase("Davis") && playerNumber == 19))
                        {
                            System.out.println("Correct!");
                                break;
                        }
                        else {
                            System.out.println("Incorrect");
                            break;
                        }
                    } else {
                    System.out.println("Invalid choice");
                    }
                break;
            }


            if (number == 2) {
                System.out.print("Choose a name: ");
                String name = scanner.next();

                if ((name.equalsIgnoreCase("Jones")) ||
                        (name.equalsIgnoreCase("Mancini")) ||
                        (name.equalsIgnoreCase("Joseph")) ||
                        (name.equalsIgnoreCase("Davis"))) {

                    System.out.print("What number does " + name + " wear? ");
                    int playerNumber = scanner.nextInt();

                    if ((name.equalsIgnoreCase("Jones") && playerNumber == 10) ||
                            (name.equalsIgnoreCase("Mancini") && playerNumber == 16) ||
                            (name.equalsIgnoreCase("Joseph") && playerNumber == 36) ||
                            (name.equalsIgnoreCase("Davis") && playerNumber == 19)) {

                        System.out.println("Correct");
                        break;
                    }
                    System.out.println("Incorrect!");
                    break;


                } else {
                    System.out.println("Invalid choice");
                    break;
                }
            }
        }
    }
}
