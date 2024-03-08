package task1;

public abstract class LibraryEntity {
    private final int id;
    protected LibraryEntity(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public abstract String toString();

}
