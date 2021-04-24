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
        video.setVideoName("manish");
        video.setRating(5);
        video.setCheckOut(true);
        System.out.println("video name: " + video.getVideoName() + ", " +
                "video rating: " + video.getRating() + ", " +
                "Is video available: " + video.isCheckOut() + ".");
    }

}