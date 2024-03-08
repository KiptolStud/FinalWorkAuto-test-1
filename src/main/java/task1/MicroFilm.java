package task1;

public class MicroFilm extends LibraryEntity implements Authoreable {
    private String name;
    private String author;

    public MicroFilm(int id, String name) {
        super(id);
        this.name = name;
    }
    public MicroFilm(int id, String name, String author) {
        this(id, name);
        this.author = author;
    }

    public Type getType() {
        return Type.MICROFILM;
    }

    public String getName() {
        return name;
    }
    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return "id=" + getId() +
                " Тип " + getType().getTitle() +
                " Название \"" + getName()+ "\"" + " Автор " + getAuthor() + "\n";
    }
}
