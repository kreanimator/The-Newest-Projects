public class Main {
    public static void main(String[] args) {
        Book book =
                new Book("1984", "George Orwell", 500, 344353353 );
            System.out.println("Название: " + book.getBookName());
            System.out.println("Автор: " + book.getBookAuthor());
            System.out.println("Количество страниц: " + book.getPageCount());
            System.out.println("Штрих-код: " + book.getCodeSNMB());


    }
}
