abstract class BookBase{
    protected String title,author,ISBN;
    protected int availableCopies;

    public BookBase(String title,String author,String ISBN,int copies){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.availableCopies=copies;
    }
    // Every book must have this method
    public abstract void displayDetails();
}