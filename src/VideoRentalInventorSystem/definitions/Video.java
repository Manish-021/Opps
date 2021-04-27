/*   Created by IntelliJ IDEA.
 *   Author: Manish Kumar
 *   Date: 23-04-2021
 *   Time: 21:05
 *   File: Video.java
 */

package VideoRentalInventorSystem.definitions;

import java.util.Objects;

public class Video {
    //1.always set visibility modifier of field to private unless otherwise specified
    //2.always set teh access modifier of field to non-static unless otherwise specified
    //field
    private String videoName;
    private int rating;
    private boolean checkOut;

    //Method
    /*public String getName(){
        return videoName;
    }*/

    //Constructor Method- used to initialize field of an object.

    //formula
    //public <no access modifier> <no return type> <sameAsTheClass>(<parameters>) {}
    //non-parameterized constructor
    public Video() {
        this.videoName = "sahoo Trailer";
        this.rating = 5;
        this.checkOut = true;
    }

    //parameterized constructor
    public Video(String videoName, int rating, boolean checkOut) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = checkOut;
    }

    //1. The Getter Method- is used  to read the value of private field.
    //Observer / Accessor method

    //formula
    //public <am:sameAsTheField><rt:sameAsTheField> get<NameOfTheField>

    public String getVideoName() {
        return videoName;
    }

    /**
     * The setter method- used to write the value of private field.
     * Transformer/mutator method
     **/

    //forula
    //public<sameAsTheField> void set<NameOfTheField>(<sameAsTheField>) {}
    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    //Rule for boolean -start with is instead of get
    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    //The toString()method
    //formula
    //public String toString(){}
    //used to convert the Object to a string.


    @Override
    public String toString() {
        return "Video{" +
                "videoName='" + videoName + '\'' +
                ", rating=" + rating +
                ", checkOut=" + checkOut +
                '}';
    }

    //The 'Object' is a reference type in java
    //Special thing about the object type is,
    //the Object class is super class of all the other classes in java
    //i.e all the classes that we created are already defined
    //are drove from object class
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return getRating() == video.getRating() &&
                isCheckOut() == video.isCheckOut() &&
                Objects.equals(getVideoName(), video.getVideoName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVideoName(), getRating(), isCheckOut());
    }
}