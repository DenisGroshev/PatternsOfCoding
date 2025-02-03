package Patterns.Strategy;

public class BookReal {
    Book book;

    public void setBookState(Book book){
        this.book=book;
    }

    public void executeBookState(){
        book.exist();
    }
}
