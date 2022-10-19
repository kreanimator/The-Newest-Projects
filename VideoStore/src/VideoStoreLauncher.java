public class VideoStoreLauncher {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Test a Video.
        Video vid1 = new Video();
        vid1.setTitle("The Punisher");

        vid1.addRating(3);
        vid1.addRating(2);
        vid1.addRating(5);
        vid1.getRating();

        String s1 = String.format("%s: %s", vid1.getTitle(), vid1.getRating());
        System.out.println(s1);

        vid1.checkOut();
        getStatus(vid1);
        vid1.returnToStore();
        getStatus(vid1);

        // Test a VideoStore.
        VideoStore vs = new VideoStore();

        vs.addFilm("Java for Dummies");
        vs.addFilm("How to live this life");
        vs.addFilm("How to live under the bridge");

        // Add user ratings for 'Java for Dummies'.
        vs.rateFilm(1, 5);
        vs.rateFilm(2, 4);
        vs.rateFilm(2, 4);
        vs.rateFilm(1, 3);
        vs.rateFilm(0, 5);
        vs.rateFilm(1, 4);
        vs.rateFilm(0, 4);
        vs.rateFilm(1, 3);
        System.out.println(vs.getVideoByIndex(3));

        vs.checkOutFilm(0);
        vs.checkOutFilm(2);

        System.out.println("Average Rating for video #0: "
                + vs.ratingForFilm(0));

        vs.listInventory();
    }

    public static void getStatus(Video v) {
        String title = v.getTitle();
        if (v.isCheckedOut()) {
            String s = String.format("'%s' is checked out.", title);
            System.out.println(s);
        } else {
            String s = String.format("'%s' is on the shelves.", title);
            System.out.println(s);

        }
    }

}