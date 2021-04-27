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
        if (video.equals(video1)) {
            System.out.println("they are exactly same");
        } else {
            System.out.println("they are different");
        }
    }
}