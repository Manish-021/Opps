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
        Video video1 = new Video("sahoo", 5, true);

        //we would like to compare these object
        //and would like to check weather they are equal
        /**
         * there are two condition
         * 1.if the both reference variable have the same reference variable
         * i.e they are referring to the same object
         * 2.if bothe the object are of the same class and all the fields are exactly equal*/

        //        System.out.println(video.hashCode()); //hashcode == reference value
        //        System.out.println(video1.hashCode());

        if (video.getClass().getName().equals(video1.getClass().getName())) {
            if (video.getRating() == video1.getRating() &&
                    video.isCheckOut() == video1.isCheckOut() &&
                    video.getVideoName() == video1.getVideoName()) {
                System.out.println("the object are equal");
            } else {
                System.out.println("they are different");
            }
        }
    }
}