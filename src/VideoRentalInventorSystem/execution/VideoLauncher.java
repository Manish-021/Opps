/*   Created by IntelliJ IDEA.
 *   Author: Manish Kumar
 *   Date: 23-04-2021
 *   Time: 20:59
 *   File: Main.java
 */

package VideoRentalInventorSystem.execution;

import VideoRentalInventorSystem.definitions.VideoStore;

import java.util.Scanner;

public class VideoLauncher {
    public static final int ADD_VIDEO = 1;
    public static final int CHECK_OUT_VIDEO = 2;
    public static final int RETURN_VIDEO = 3;
    public static final int RECEIVE_RATING = 4;
    public static final int LIST_INVENTORY = 5;
    public static final int EXIT = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerInput;
        VideoStore myVideoStore = new VideoStore();
        String videoName;
        int videoRating;
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
            switch (customerInput) {
                case ADD_VIDEO:
                    System.out.println("Enter the name of the video you want to add");
                    scanner.nextLine();
                    videoName = scanner.nextLine();
                    myVideoStore.addVideo(videoName);
                    break;
                case CHECK_OUT_VIDEO:
                    System.out.println("enter the name of the video you want to return");
                    scanner.nextLine();
                    videoName = scanner.nextLine();
                    myVideoStore.doCheckOut(videoName);
                    break;
                case RETURN_VIDEO:
                    System.out.println("Enter the name of the video you want to return");
                    scanner.nextLine();
                    videoName = scanner.nextLine();
                    myVideoStore.doreturn(videoName);
                    break;
                case RECEIVE_RATING:
                    System.out.println("Enter the name of the video");
                    scanner.nextLine();
                    videoName = scanner.nextLine();
                    System.out.println("Enter Rating");
                    videoRating = scanner.nextInt();
                    myVideoStore.receiveRating(videoName, videoRating);
                    break;
                case LIST_INVENTORY:
                    myVideoStore.listInventory();
                    break;
                default:
                    break;
            }
        } while (customerInput != EXIT);
    }
}