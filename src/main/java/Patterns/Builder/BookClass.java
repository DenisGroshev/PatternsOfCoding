package Patterns.Builder;

public class BookClass {
    private String title;
    private int year;
    private int number;
    private int countOfPages;

    public String getTitle() {
        return title;
    }


    public int getYear() {
        return year;
    }


    public int getNumber() {
        return number;
    }


    public int getCountOfPages() {
        return countOfPages;
    }

    private BookClass(){}

    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder {
        private BookClass bookClass;
        private Builder(){
            this.bookClass=new BookClass();
        }
        public Builder number(int number){
            this.bookClass.number=number;
            return this;
        }
        public Builder year(int year){
            this.bookClass.year=year;
            return this;
        }
        public Builder title(String title){
            this.bookClass.title=title;
            return  this;
        }
        public Builder countOfPages(int countOfPages){
            this.bookClass.countOfPages=countOfPages;
            return this;
        }

        public BookClass build(){
            BookClass result=this.bookClass;
            return result;
        }
    }

}
