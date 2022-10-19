public class VideoStore {

    Video[] Catalogue = new Video[10];
    int filmsCount;

    public void addFilm(String title) {
        if (filmsCount > 10) {
            System.out.println("Sorry, there are no space! ");
        } else {
            Catalogue[filmsCount] = new Video();
            Catalogue[filmsCount].setTitle(title);
            filmsCount++;

        }
    }

    public void checkOutFilm(int film) {
        Catalogue[film].checkOut();
    }

    public void returnFilm(int film) {
        Catalogue[film].returnToStore();
    }

    public void rateFilm(int film, double rating) {
        Catalogue[film].addRating(rating);
    }

    public double ratingForFilm(int film) {
        return Catalogue[film].getRating();
    }

    public int getFilmByTitle(String title) {
        for (int i = 0; i < filmsCount; i++) {
            if (title.equals(Catalogue[i].getTitle()))
                return i;
        }
        return 0;
    }

    public String getVideoByIndex(int index) {
        if (Catalogue[index] == null) {
            return "Film #" + index + " not found";
        } else {
            return Catalogue[index].getTitle();
        }
    }

    public void listInventory() {
        for (int i = 0; i < filmsCount; i++) {
            System.out.println(i + ": " + Catalogue[i].getTitle());
            System.out.println("\tRating:" + ratingForFilm(i));
            if (Catalogue[i].isCheckedOut()) {
                System.out.println("\tChecked out: Yes");
            } else {
                System.out.println("	Checked out: No");
            }
        }
    }
}
