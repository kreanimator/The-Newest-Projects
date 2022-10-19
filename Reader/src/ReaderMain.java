public class ReaderMain {
        public static void main(String[] args) {
            Reader reader1 = new Reader("Alfred Einstein", 1, "Meta Physics", "14.03.1879", "+9722876556");
            Reader reader2 = new Reader("Erwin Shredinger", 2, "Quantum Mechanics", "12.08.1887", "+9721133456");
            Reader reader3 = new Reader("Alexander Bell", 3, "Radiomechanics", "05.04.1879", "+00000000");
            Reader[] readers = {reader1, reader2, reader3};

            Book book1 = new Book("Quantum Mechanics for dummies", "Me");
            Book book2 = new Book("Physics for dummies", "You");
            Book book3 = new Book("Radiomechanics for dummies", "Them");
            Book[] books = {book1, book2, book3};

            printReaders(readers);
            printBooks(books);

            reader1.takeBook(String.valueOf(5));
            reader2.takeBook("Quantum mechanics for dummies", "Physics for dummies");
            reader3.takeBook(book1, book2,book3);

            reader1.returnBook(1);
            reader2.returnBook("Physics for dummies");
            reader3.returnBook(book3);
        }

        private static void printBooks(Book[] books) {
            System.out.println("Books list: ");
            for (Book book : books) {
                System.out.println(book.getInfo());
            }
            System.out.println();
        }

        private static void printReaders(Reader[] readers) {
            System.out.println("List of readers:");
            for (Reader reader : readers) {
                System.out.println( reader.getInfo());
            }
            System.out.println();
        }
    }
