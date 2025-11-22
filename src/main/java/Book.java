public class Book {

    private String title;
    private String autor;
    private String isbn;

    public Book(){}

    public Book(String title, String autor, String isbn){
        this.title = title;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title + " " + this.autor + " " + this.isbn;
    }
}
