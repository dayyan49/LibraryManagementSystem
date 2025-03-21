import java.util.Stack;
class User{
    private String name,userId;
    private Stack<BookBase>borrowedBooks=new Stack<>(); // Stack to store borrowed books
    public User(String name,String userId){
        this.name=name;
        this.userId=userId;
    }
    // Method to borrow a book(if available)
    public void borrowBook(BookBase book){
        if(book.availableCopies>0){
            borrowedBooks.push(book);
            book.availableCopies--;
            System.out.println(name+" borrowed: "+book.title);
        }
        else{
            System.out.println("Book not available.");
        }
    }
    // Method to return the last borrowed book
    public void returnBook(){
        if(!borrowedBooks.isEmpty()){
            BookBase book=borrowedBooks.pop();
            book.availableCopies++;
            System.out.println(name+" returned: "+book.title);
        }
        else{
            System.out.println("No books to return.");
        }
    }
}