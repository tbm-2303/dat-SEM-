

public class Main {


    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("21421421512","yallah abu",2014);
        library.addBook(book1);
        Book book2 = new Book("21421567","timothius",2018);
        Book book3 = new Book("214214242112","the great the..",2029);
        library.addBook(book2);
        library.addBook(book3);
        library.viewList();
        System.out.println(library.check("21421421512"));

    }
}
