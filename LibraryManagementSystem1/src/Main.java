public class Main{
    public static void main(String[] args) {
        Library library=new Library();
        User user=new User("Alex","U123");
        BookBase book1=new Book("Java Basics","Roger Smith","123ABC",3);
        BookBase ebook1=new EBook("Advanced Java","Frank Gerrard","456DEF",2,5.2);

        library.addBook(book1);
        library.addBook(ebook1);

        user.borrowBook(book1);
        user.borrowBook(ebook1);
        user.returnBook();
        library.searchBook("Java Basics");
    }
}