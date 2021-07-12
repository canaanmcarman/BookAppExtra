public class BookClass {
    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private double bookPrice;
    private boolean isInStock;

    public BookClass() {

    }

    public BookClass(String bookTitle, String bookAuthor, String bookDescription, double bookPrice, boolean isInStock) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookDescription = bookDescription;
        this.bookPrice = bookPrice;
        this.isInStock = isInStock;

    }

    public void getDisplayText() {
        System.out.println(this.bookAuthor);
        System.out.println(this.bookTitle);
        System.out.println(this.bookDescription);

    }

    public double totalPrice(double bookNum){
        double totalPrice = 0;
        totalPrice = bookNum * bookPrice;
        return totalPrice;

    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getBookAuthor(){
        return this.bookAuthor;
    }
    public void setBookDescription(String bookDescription){
        this.bookDescription = bookDescription;
    }
    public String getBookDescription(String bookDescription){
        return this.bookDescription;
    }
    public void setBookPrice(int bookPrice){
        this.bookPrice = bookPrice;
    }
    public double getBookPrice(){
        return this.bookPrice;
    }
    public void setIsInStock(boolean isInStock){
        this.isInStock = isInStock;
    }
    public boolean isInStock(){
        return this.isInStock;
    }







}
