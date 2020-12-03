import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> theList = new ArrayList<>();
        System.out.println("was inserted: "+insertString(theList,"aaa"));
        System.out.println("was inserted: "+insertString(theList,"bbb"));
        System.out.println("was inserted: "+insertString(theList,"ccc"));
        System.out.println("was inserted: "+insertString(theList,"ttt"));
        System.out.println("was inserted: "+insertString(theList,"fff"));
        System.out.println("was inserted: "+insertString(theList,"iii"));


        System.out.println("\nList in order:\n");
        for (int i = 0; i < theList.size(); i++) {
            System.out.println(theList.get(i));
        }
    }
    public static boolean insertString(ArrayList<String> theList, String data)
    {
        if(data != null && !theList.contains(data))
        {
            theList.add(data);
            Collections.sort(theList);
            return true;
        }
        else
            {
            return false;
            }
    }
}

