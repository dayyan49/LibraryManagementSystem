import java.util.LinkedList;
class Library{
    private LinkedList<BookBase> books=new LinkedList<>(); // Using LinkedList to store books
    public void addBook(BookBase book){
        books.add(book);
        System.out.println("Added book: "+book.title);
    }
    public void removeBook(String ISBN){
        books.removeIf(book->book.ISBN.equals(ISBN));
        System.out.println("Removed book with ISBN: "+ISBN);
    }
    public void searchBook(String title){
        for(BookBase book:books){
            if(book.title.equalsIgnoreCase(title)){
                book.displayDetails();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}