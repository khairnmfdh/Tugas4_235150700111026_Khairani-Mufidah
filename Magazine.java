public class Magazine extends Book {
    private String category;

    public Magazine(String title, String author, int year, String category){
        super(title,author,year);
        this.category = category;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void borrowBook(){
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Magazine : " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Magazine : " + getTitle() + " is already borrowed.");
        }
    }
    public void returnBook() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Novel : " + getTitle() + " returned successfully.");
        } else {
            System.out.println("Novel : " + getTitle() + " is not borrowed.");
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.print("Category : "+getCategory());
    }
}
