public class TextBook extends Book {
    private String subject;

    public TextBook(String ttile, String author, int year, String subject){
        super(ttile,author,year);
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public void borrowBook(){
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Textbook : " + getTitle() + " borrowed succesfully.");
        } else {
            System.out.println("Textbook : " + getTitle() + " is already borrowed.");
        }
    }
    public void returnBook() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Textbook : " + getTitle() + " returned successfully.");
        } else {
            System.out.println("Textbook : " + getTitle() + " is not borrowed.");
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.print("Subject: "+getSubject());
    }
}
