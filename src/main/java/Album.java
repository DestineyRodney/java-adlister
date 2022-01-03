import java.io.Serializable;

public class Album implements Serializable {
    private int id;
    private String artist;
    private String name;
    private int releaseDate;
    private double sales;
    private String genre;

//    Zero argument constuctor
    public Album(){}

//constructor
    public Album(int id, String artist, String name, int releaseDate, double sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public double getSales() {
        return sales;
    }

    public String getGenre() {
        return genre;
    }

//    setters
    public void setId(int id) {
        this.id = id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
