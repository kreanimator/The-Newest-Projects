/**
 * The Reviewer1 class represents a person who can rate a movie,
 * by assigning it a score from 1 to 5.
 */
public class Reviewer1 {

    /**
     * Assume there are exactly 5 films that need to be rated.
     */
    int[] ratings = new int[5];


    public void setRating1(int movieIndex, int rating) {
        ratings[movieIndex] = rating;
    }
    // TODO: implement method stub

    public int getRating1(int movieIndex) {
        return ratings[movieIndex];
        // TODO: implement method stub
    }

    public int favourite1() {
        int max = 0;
        int index = 0;
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] > max) {
                max = ratings[i];
                index = i;
            }
        }
        return index;

    }
}
