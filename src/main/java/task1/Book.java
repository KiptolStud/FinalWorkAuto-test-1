package task1;

public class Book extends Publication implements Authoreable {
    private String author;

    public Book(int id, String name) {
        super(id, name);

    }

    public Book(int id, String name, String author) {
        this(id, name);
        this.author = author;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }


    public Type getType() {
        return Type.BOOK;
    }

    @Override
    public String toString() {
        return "id=" + getId() +
                " Тип " + getType().getTitle() +
                " Название \"" + getName() + "\"" + " Автор " + getAuthor() + "\n";
    }
}
