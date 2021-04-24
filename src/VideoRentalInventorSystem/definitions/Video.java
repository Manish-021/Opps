/*   Created by IntelliJ IDEA.
 *   Author: Manish Kumar
 *   Date: 23-04-2021
 *   Time: 21:05
 *   File: Video.java
 */

package VideoRentalInventorSystem.definitions;

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
        this.videoName = "manish";
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
}