import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> theList = new ArrayList<>();


    public void addBook(Book data) {
        theList.add(data);
    }
    //i could make a better 'addBook' method by parsing the data for the book constructor through the parameters of the method.
    // but since im not taking user input from the console it seems redundant.

    public void viewList() {
        for (int i = 0; i < theList.size(); i++) {

            System.out.println(theList.get(i).toString());
        }
    }

    public boolean check(String data)
    {
        for (int i = 0; i < theList.size(); i++)
        {
            if (theList.get(i).ISBN(data))
            {
                return true;
            }
        }
                return false;
        }
    }













