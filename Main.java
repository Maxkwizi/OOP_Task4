public class Main {
public static void main(String[] args) {
    Book<String> book1 = new Book<>("Жизнь Пи");
    Book<String> book2 = new Book<>("Милые кости");
    Book<String> book3 = new Book<>("Парфюмер");
    Book<String> book4 = new Book<>("Хроники Заводной Птицы");
    Book<String> book5 = new Book<>("Игра престолов");

    Library library = new Library();

    LibraryCard<Integer, String> card1 = new LibraryCard<>(1, "Янн Мартел, 2000");
    LibraryCard<Integer, String> card2 = new LibraryCard<>(2, "Элис Сиболд, 2002");
    LibraryCard<Integer, String> card3 = new LibraryCard<>(3, "Патрик Зюскинд, 1985");
    LibraryCard<Integer, String> card4 = new LibraryCard<>(4, "Харуки Мураками, 1994");
    LibraryCard<Integer, String> card5 = new LibraryCard<>(5, "Джордж Р.Р. Мартин, 1996");

    library.publishedLibraryCard(book1, card1);
    library.publishedLibraryCard(book2, card2);
    library.publishedLibraryCard(book3, card3);
    library.publishedLibraryCard(book4, card4);
    library.publishedLibraryCard(book5, card5);

    library.showPublishedBooks();
}
}