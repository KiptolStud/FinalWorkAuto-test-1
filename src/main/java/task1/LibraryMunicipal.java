package task1;

import java.util.List;

public class LibraryMunicipal extends Library {
    private int squareReadingHall;

    public LibraryMunicipal(String name, List<LibraryEntity> listEntity) {
        super(name, listEntity);
    }

    public LibraryMunicipal(String name, List<LibraryEntity> listEntity, int squareReadingHall) {
        this(name, listEntity);
        this.squareReadingHall=squareReadingHall;

    }

}
