package Tema4;

public class Video {
    private String title;
    private boolean is_or_not=true;
    private int rating;
    private int cateratinguri=0;

    public Video(String title) {
        this.title = title;
    }

    public void Is_or_not() {
        this.is_or_not ^=true;
    }


    public String getTitle() {
        return title;
    }

    public boolean getIs_or_not() {
        return is_or_not;
    }

    public double getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIs_or_not(boolean is_or_not) {
        this.is_or_not = is_or_not;
    }

    public void setRating(int rating) {
        this.cateratinguri++;
        this.rating = (this.rating+rating)/this.cateratinguri;
    }
}
