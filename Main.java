public class Main {
    public static void main(String[] args) {
        TextBook textBook = new TextBook("Java Programming", "John Smith", 2020, "Programming");
        Novel novel = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        Magazine magazine = new Magazine("National Geographic", "Various", 2021, "Nature");

        Book[] book = new Book[3];
        book[0] = textBook;
        book[1] = novel;
        book[2] = magazine;

        displayAllBooksInfo(book);

        System.out.println("---- Borrowing and Returning Books ----");
        book[0].borrowBook();
        book[2].borrowBook();
        book[0].returnBook();
        book[1].returnBook();
}
private static void displayAllBooksInfo(Book[] book) {
    System.out.println("---- BOOK INFORMATION ----");
    System.out.println("\n");
    for (Book b : book) {
        b.displayInfo();
        System.out.println("\n------------------------");
        System.out.println("\n");
        }
    }
}