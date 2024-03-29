import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Book<String>, LibraryCard<Integer, String>> publishedBooks;

    public Library() {
        this.publishedBooks = new HashMap<>();
    }

    public void addBook(Book<String> book, LibraryCard<Integer, String> libraryCard) {
        publishedBooks.put(book, libraryCard);
    }

    public void publishedLibraryCard(Book<String> book, LibraryCard<Integer, String> libraryCard) {
        addBook(book, libraryCard);
        System.out.println("Книга '" + book.getTitle() + "' заведена под номером " + libraryCard.getCardNumber());
    }

    public void showPublishedBooks() {
        for (Map.Entry<Book<String>, LibraryCard<Integer, String>> entry : publishedBooks.entrySet()) {
            Book<String> book = entry.getKey();
            LibraryCard<Integer, String> libraryCard = entry.getValue();
            System.out.println("Книга: " + book.getTitle() + ", номер карточки: " + libraryCard.getCardNumber() + ", Автор и год написания: " + libraryCard.getBookInfo());
        }
    }
}