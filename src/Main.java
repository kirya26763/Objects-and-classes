public class Main {
    public static void main(String[] args) {
        Author authorBook = new Author("Уильям", "Шекспир");
        Book book = new Book(1623, "Буря", authorBook);
        System.out.println("Автор " + authorBook + " Произведение " + '\"' + book.getNameBook() + '\"' + " год " + book.getAge());
        book.setAge(1827);
        System.out.println("Автор " + authorBook + " Произведение " + '\"' + book.getNameBook() + '\"' + " год " + book.getAge());
        Author authorBook1 = new Author("Фёдор", "Достоевски");
        Book book1 = new Book(1866, "Преступление и наказание", authorBook1);
        System.out.println("Автор " + authorBook1 + " Произведение " + '\"' + book1.getNameBook() + '\"' + " год " + book1.getAge());
    }
}