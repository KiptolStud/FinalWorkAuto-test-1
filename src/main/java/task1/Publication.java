package task1;

public abstract class Publication extends LibraryEntity{
    private String name;
    private String datePublication;
    protected Publication(int id, String name) {
        super(id);
        this.name = name;
    }

    protected Publication(int id, String name, String datePublication) {
        this(id, name);
        this.datePublication = datePublication;
    }

    public String getName() {
        return this.name;
    }
    public String getDatePublication() {
        return datePublication;
    }
}
