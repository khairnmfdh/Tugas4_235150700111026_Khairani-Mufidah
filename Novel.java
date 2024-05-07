public class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int year, String genre){
        super(title,author,year);
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void borrowBook(){
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Novel : " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Novel : " + getTitle() + " is already borrowed.");
        }
    }
    public void returnBook(){
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Novel : " + getTitle() + " returned successfully.");
        } else {
            System.out.println("Novel : " + getTitle() + " is not borrowed.");
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.print("Genre : "+getGenre());
    }
}
