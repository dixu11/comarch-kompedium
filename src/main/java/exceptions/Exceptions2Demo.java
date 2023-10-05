package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exceptions2Demo {
    public static void main(String[] args) {
        //dziedziczenie wyjatkow - rodzaje wyjątków
        List<Book> books = new ArrayList<>();
        try {
//            Scanner scanner = new Scanner(new File("src/main/plan.txt"));
            Scanner scanner = new Scanner(new File("books.csv"));
            while (scanner.hasNextLine()){
                String content = scanner.nextLine();
                System.out.println(content);
                String[] bookArray = content.split(",");
                String title = bookArray[0];
                int pages = Integer.parseInt(bookArray[1]);
                String author = bookArray[2];
                Book book = new Book(title, pages, author);
                books.add(book);
            }
        }catch (FileNotFoundException e){  // -> IOException -> Exception -> Throwable
            System.out.println("Nie znaleziono pliku!");
        }catch (NumberFormatException e){ // -> IllegalArgumentException -> RuntimeException -> Exception -> Throwable
            System.out.println("Źle sformatowany plik");
        } // NullPointer -> RuntimeException -> Exception -> Throwable
        System.out.println(books);
        //rzucanie i tworzenie własnych wyjątków
    }
}

class Book{
    private String title;
    private int pages;
    private String author;

    public Book(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                '}';
    }
}
