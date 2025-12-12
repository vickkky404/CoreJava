// OOPS Program 14: Object Class and toString() Method
public class OOPS_14_ToString {
    static class Book {
        String title;
        String author;
        int price;
        
        public Book(String title, String author, int price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }
        
        @Override
        public String toString() {
            return "Book{" + "title='" + title + "', author='" + author + "', price=" + price + "}"; 
        }
    }
    public static void main(String[] args) {
        Book b = new Book("Java", "Gosling", 500);
        System.out.println(b);
    }
}
