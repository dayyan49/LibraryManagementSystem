class EBook extends BookBase{
    private double fileSize;
    public EBook(String title,String author,String ISBN,int copies,double fileSize){
        super(title,author,ISBN,copies);
        this.fileSize=fileSize;
    }
    @Override
    public void displayDetails(){
        System.out.println("Title: "+title+", Author: "+author+ ", ISBN: "+ISBN+", Copies: "+availableCopies+", File Size: "+fileSize+" MB");
    }
}