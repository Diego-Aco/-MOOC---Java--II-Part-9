public class CD implements Packable {
    private final double weight = 0.1;
    private String artist;
    private String title;
    private int publicationYr;

    public CD(String artist, String title, int publicationYr) {
        this.artist=artist;
        this.title=title;
        this.publicationYr=publicationYr;
    }

    public double weight(){
        return this.weight; 
    }

    public String toString() {
        return artist + ": " + title + " (" + publicationYr + ")";
    }
}
