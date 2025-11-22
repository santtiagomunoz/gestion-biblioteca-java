public class Main {
    public static void main(String[] argas){
        Book book = new Book("el tunel", "ernesto", "1");
        Book book1 = new Book("opio en las nubes", "n/n", "2");

        Library library = new Library();

        library.addBooks(book);
        library.addBooks(book1);

        library.printBooks();
    }
}
