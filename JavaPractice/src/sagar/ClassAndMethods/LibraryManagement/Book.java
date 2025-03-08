package ClassAndMethods.LibraryManagement;

public class Book {
    private  String tittle;
    private  String author;

    //Constructor
    public Book(String tittle, String author) {
        this.tittle = tittle;
        this.author = author;
    }
    //Method to display book details
    public void showBookDetails(){
        System.out.println("Tittle: " + tittle + "Author: " + author);
    }
}
