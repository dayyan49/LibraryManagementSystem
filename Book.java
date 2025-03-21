class Book extends BookBase{
    public Book(String title,String author,String ISBN,int copies) {
        super(title,author,ISBN,copies);
    }
    @Override
    public void displayDetails(){
        System.out.println("Title: "+title+", Author: "+author+", ISBN: "+ISBN+", Copies: "+availableCopies);
    }
}