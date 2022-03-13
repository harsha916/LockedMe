package myLockedMe;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyClientApp  {
    public static void main(String[] args) throws IOException {
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t\t LockedMe");
        System.out.println("-------------------------------------------------------");
        System.out.println("Developer : HarshaVinay M");
        System.out.println("-------------------------------------------------------");
        int choice;
        try {
            do {
                LockedMe.display();
                System.out.println("-------------------------------------------------------");
                System.out.print("Choose here --> ");
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        //Sprint - 1
                        LockedMe.getAllFiles();
                        break;
                    case 2:
                        //Sprint - 2
                        System.out.print("Enter your FileName :");
                        Scanner sc1 = new Scanner(System.in);
                        String userGivenFilename = sc1.nextLine();
                        LockedMe.addFiles(userGivenFilename);
                        break;
                    case 3:
                        //Sprint - 3
                        System.out.print("Enter your FileName to Delete :");
                        Scanner sc2 = new Scanner(System.in);
                        String userGivenFilenameToDelete = sc2.nextLine();
                        LockedMe.deleteFiles(userGivenFilenameToDelete);
                        break;
                    default:
                        System.out.println("Please choose only in between 1-5");
                }

            }
            while (choice > 0);
        }catch (InputMismatchException ex)
        {
            System.out.println("You have entered wrong Input");
        }
    }
}
