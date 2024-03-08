package task1;

public class Newspaper extends Publication {
    private String publisingHouse;
    public Newspaper(int id, String name) {
        super(id, name);
    }

    public Newspaper(int id, String name, String publisingHouse) {
        super(id, name);
        this.publisingHouse = publisingHouse;
    }


    public Type getType() {
        return Type.NEWSPAPER;
    }

    public String getPublisingHouse() {
        return publisingHouse;
    }

    @Override
    public String toString() {
        return "id=" + getId() +
                " Тип " + getType().getTitle() +
                " Название \"" + getName()+ "\"" + "\n";
    }
}
