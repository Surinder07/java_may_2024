package june22.book;

public class OnlineBook extends Book {
    private int length;

    public OnlineBook(int numberOfPages, String author, String name, int length) {
        super(numberOfPages, author, name);
        this.length = length;
    }

    @Override
    public void bookInfo() {
        System.out.println("Length of the book. "+length);
    }
}
