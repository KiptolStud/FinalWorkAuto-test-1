package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LibraryEntity book1 = new Book(1, "Азбука", "Иванов");
        LibraryEntity book2 = new Book(2, "Камасутра", "Петров");
        LibraryEntity book3 = new Book(3, "Книга рекордов Гинесса", "Ганди");

        LibraryEntity newspaper1 = new Newspaper(4, "Игромания");
        LibraryEntity newspaper2 = new Newspaper(5, "GameExe");
        LibraryEntity newspaper3 = new Newspaper(6, "ЛКИ");

        LibraryEntity microFilm1 = new MicroFilm(7, "В мире ботанов", "Пашка");
        LibraryEntity microFilm2 = new MicroFilm(8, "Про задротов", "AdminCom");
        LibraryEntity microFilm3 = new MicroFilm(9, "Лебединое озеро", "Павлуша");


        Library library1 = new LibraryMunicipal("Библиотека1", new ArrayList<>());
        library1.addEntity(book1).addEntity(newspaper2).addEntity(microFilm3)
                .addEntity(book3).addEntity(newspaper3).addEntity(microFilm1)
                .addEntity(book2).addEntity(newspaper1).addEntity(microFilm2);

        Search search = new Search();
        List<LibraryEntity> searchList = search.filterList(library1,2);
        System.out.println(searchList);

        List<LibraryEntity> searchList1 = search.filterList(library1,"Петров");
        System.out.println(searchList1);
    }

}
