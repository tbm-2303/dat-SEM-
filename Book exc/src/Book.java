import java.util.Objects;

public class Book {
String ISBN;
String title;
int release_year;


public Book(String ISBN, String titel, int release_year){
      this.ISBN = ISBN;
      this.title = titel;
      this.release_year = release_year;
    }

    public boolean ISBN(String ISBN){
        if(this.ISBN.equals(ISBN)){
            return true;
        }
        return false;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitel() {
        return title;
    }

    public void setTitel(String titel) {
        this.title = titel;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", titel='" + title + '\'' +
                ", release_year=" + release_year +
                '}';
    }


}
