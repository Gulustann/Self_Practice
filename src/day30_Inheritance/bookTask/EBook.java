package day30_Inheritance.bookTask;

public class EBook extends Book{
    private String size;
    private int pages;

    public EBook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages<=0){
            System.err.println("Number of pages cannot be zero or less than zero");
            System.exit(1);
        }
        this.pages = pages;
    }
    public void readBook(){
        System.out.println("Read book");
    }

    public String toString() {
        return "EBook{" +
                "size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
