public class Book {
    String Title;
    String Author;
    int Year_of_publication;

    public Book(String Title, String Author, int Year_of_publication) {
        this.Title = Title;
        this.Author = Author;
        this.Year_of_publication = Year_of_publication;
    }

    public void display() {
        System.out.println("Title of the book is " + Title + "\n" + "Its Author is " + Author + "\n" + "Its year of Publication is " + Year_of_publication);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Thomas Calculus", "Thomas", 1999);
        Book book2 = new Book("Anandmath", "Bankim Chandra Chatterjee", 2006);
        Book book3 = new Book("Chandalika", "Rabindra Nath Tagore", 1937);

        book1.display();
        book2.display();
        book3.display();
    }
}
