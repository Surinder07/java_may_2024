package june22.book;

public class BookMain {
    public static void main(String[] args) {

//int numberOfPages, String author, String name, int length
        OnlineBook audioBook = new OnlineBook(101, "Chetan Bhagat", "5 point someone", 250);
        audioBook.bookInfo();


        // take another class
        // fiction/ non fiction novels
        // onlineBook --- audio , visualBook
        // create child class object

        Fiction fiction = new Fiction(100, "Dale Carnegie", "HTWFAIP");
        fiction.bookInfo();


    }
}
