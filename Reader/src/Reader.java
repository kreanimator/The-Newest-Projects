public class Reader {

    private String fullName;
    private int number;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String fullName, int number, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.number = number;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }
    public Reader (){

    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void takeBook(String... books) {
        System.out.println(this.fullName + " have taken next books:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fullName + " have taken next books :");
        for (Book book : books) {
            System.out.println(book.getName() + ", author - " + book.getAuthor());
        }
        System.out.println();
    }
    public void returnBook ( int number){
        System.out.println(this.fullName + " have returned " + number+ " books.");
    }
    public void returnBook (String ... books){
        System.out.println(this.fullName + " have returned next books: ");
        for (String book : books){
            System.out.println(book);
        }
        System.out.println();
    }
    public void returnBook(Book... books) {
        System.out.println(this.fullName + " have returned next books:");
        for (Book book : books) {
            System.out.println(book.getName() + ", author - " + book.getAuthor());
        }
        System.out.println();
    }

    public String getInfo() {
        return "[" +
                "Full Name= " + fullName + '\'' +
                ", number of books taken = " + number +
                ", faculty = " + faculty + '\'' +
                ", date of birth = " + dateOfBirth + '\'' +
                ", phone = " + phone + '\'' +
                ']';
    }
}
//    Определить класс Reader, хранящий такую информацию о пользователе библиотеки:ФИО,номер читательского билета,факультет,
//    дата рождения,телефон.Методы takeBook(), returnBook().Разработать программу, в которой создается массив объектов данного класса.Перегрузить методы takeBook(), returnBook():
//        - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//        - takeBook, который будет принимать переменное количество названий книг.
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        - takeBook, который будет принимать переменное количество объектов класса Book
//        (создать новый класс, содержащий имя и автора книги).
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        Аналогичным образом перегрузить метод returnBook().
//        Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
//        Или  "Петров В. В. вернул 3 книги".