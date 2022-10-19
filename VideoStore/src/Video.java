public class Video {


        private String title;
        private boolean checkedOut = false;
        private double averageRating;
        private double ratingSum = 0;
        private double ratingCount = 0;

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }
        public void addRating (double rating){ // Adds and counts rating
                ratingSum = rating + ratingSum;
                ratingCount = ratingCount +1;
                averageRating = ratingSum/ratingCount;
        }
        public double getRating(){
                return averageRating;
        }
        public void checkOut(){ //Sets film checked out
                checkedOut = true;
        }
        public void returnToStore() { // Sets film not checked out
                checkedOut = false;
        }
        public Boolean isCheckedOut() {
                return checkedOut;
        }

        }
//        addVideo(String): add a new video (by title) to the inventory;
//        checkOut(String): check out a video (by title);
//        returnVideo(String): return a video to the store;
//        receiveRating(String, int) : take a user's rating for a video; and
//        listInventory(): list the whole inventory of videos in the store.