package Patterns.Decorator;

public class BookPagesOverThree implements Book{
        private final Book book;
        private final int BookLux=500;
        public BookPagesOverThree(Book book){
            this.book=book;
        }

        @Override
        public double getPrice() {
            return this.book.getPrice()+BookLux;

        }
    }


