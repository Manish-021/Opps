/*   Created by IntelliJ IDEA.
 *   Author: Manish Kumar
 *   Date: 23-04-2021
 *   Time: 20:59
 *   File: Main.java
 */

package VideoRentalInventorSystem.execution;

import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerInput;
        do {
            System.out.println("MAIN MENU");
            System.out.println("=============");
            System.out.println("1.Add Video");
            System.out.println("2.Check Out Video");
            System.out.println("3.Return Video");
            System.out.println("4.Receive Rating");
            System.out.println("5.List Inventory");
            System.out.println("6.Exit");
            System.out.println("Enter your choise");
            customerInput = scanner.nextInt();
        } while (false);
    }
}