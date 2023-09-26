

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardHelper {
    public static Scanner scanner = new Scanner(System.in);
    public static String getText(String message) {
        System.out.println(message);
        while (true) {
            scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            return name;

        }
    }
    
    public static int getNumber(String message) {
        System.out.println(message);
        while (true) {
            try {
                scanner = new Scanner(System.in);
                int x = scanner.nextInt();
                return x; 
            } catch (InputMismatchException e) {
                System.err.println(e.getClass());
            }
        }
    }

    public static boolean askYesNo(String message) {
        System.out.println(message);
        while (true) {
            scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("ha")) {
                return true;
            } else if (answer.equalsIgnoreCase("yoq")) {
                return false;
            } else {
                System.out.println("Iltimos 'ha' yoki 'yoq' kiriting");
            }
        }
    }

    public static boolean getBoolean(String message) {
        System.out.println(message);
        while (true) {
            scanner = new Scanner(System.in);
            String qw = scanner.next();
            if (qw.equalsIgnoreCase("ayol")) {
                return true;
            } else if (qw.equalsIgnoreCase("erkak")) {
                return false;
            } else {
                System.out.println("Iltimos 'ayol' yoki 'erkak' kiriting");
            }
        }
    }

    // public static boolean getUylanganmisiz(String message) {
    //     System.out.println(message);
    //     while (true) {
    //         scanner = new Scanner(System.in);
    //         String answer = scanner.next();
    //         if (answer.equalsIgnoreCase("ha")) {
    //             return true;
    //         } else if (answer.equalsIgnoreCase("yoq")) {
    //             return false;
    //         } else {
    //             System.out.println("Iltimos 'ha' yoki 'yoq' kiriting");
    //         }
    //     }
    // }
}
