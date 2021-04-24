/*   Created by IntelliJ IDEA.
 *   Author: Manish Kumar
 *   Date: 23-04-2021
 *   Time: 20:59
 *   File: Main.java
 */

package VideoRentalInventorSystem.execution;

import VideoRentalInventorSystem.definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        //when we have not created any constructor for the class the java
        //compiler creates the default constructor.
        //the default constructor ,initializes the values to the default of each type.

        System.out.println("video name: " + video.getVideoName() + ", " +
                "video rating: " + video.getRating() + ", " +
                "Is video available: " + video.isCheckOut() + ".");

        Video video1 = new Video("mohit", 4, false);
        System.out.println("video name: " + video1.getVideoName() + ", " +
                "video rating: " + video1.getRating() + ", " +
                "Is video available: " + video1.isCheckOut() + ".");
    }

}