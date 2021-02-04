public class Bog {
    private int ISBN;
    private String title;
    private int year;

    public Bog(int ISBN, String title, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return ISBN + " - " + title + " - " + year + " ";
    }


}