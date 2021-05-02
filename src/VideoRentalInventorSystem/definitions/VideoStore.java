/*   Created by IntelliJ IDEA.
 *   Author: Manish Kumar
 *   Date: 02-05-2021
 *   Time: 15:50
 *   File: VideoStrore.java
 */

package VideoRentalInventorSystem.definitions;

import java.util.Arrays;

public class VideoStore {
    private Video[] store;

    public VideoStore() {
        this.store = new Video[5];
    }

    public Video[] getStore() {
        return store.clone();//.clone returns the copy of an array
        //not the array  reference itself.
    }

    public void setStore(Video[] store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return "VideoStore{" +
                "store=" + Arrays.toString(store) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoStore that = (VideoStore) o;
        return Arrays.equals(getStore(), that.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }

    //This method will allow us to add a video to our store.
    public void addVideo(String name) {
        System.out.println("\"" + name + "\"is now added to the store");
    }

    //this method allows a costumer to rent a video.
    //@param name the name of the video that costumer wants to rent.

    public void doCheckOut(String name) {
        System.out.println("thank you for renting\"" + name + "\".");
    }

    //this method will allow the costumer to return a video that they rented.
    public void doreturn(String name) {
        System.out.println("thank you for returning the video\"" + name + "\".");
    }

    public void receiveRating(String name, int rating) {
        System.out.println("the new rating of " + name + "is now " + rating);
    }
}
