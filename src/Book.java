public class Book {
    private String nameBook;
    private int age;
    private Author author;

    public Book(int age, String nameBook, Author author) {
        this.age = age;
        this.nameBook = nameBook;
        this.author = author;
    }

    public Book() {
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
