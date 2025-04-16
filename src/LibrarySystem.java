class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

class NonFiction extends Book {
    NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction nonFiction = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        fiction.displayDetails();
        System.out.println();
        nonFiction.displayDetails();
    }
}
