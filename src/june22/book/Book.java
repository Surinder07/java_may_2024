package june22.book;

public class Book {
     private int numberOfPages;
     private String author;
     private String name;

    public Book(int numberOfPages, String author, String name) {
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.name = name;
    }

    public void bookInfo(){

         System.out.println(name);
         System.out.println(author);
         System.out.println(numberOfPages);
     }
}

