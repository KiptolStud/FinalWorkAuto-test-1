package task1;

import java.util.List;

public class Search implements SearchingEntity<LibraryEntity> {

    @Override
    public List<LibraryEntity> filterList(Library library, int id) {
        List<LibraryEntity> list = library.getListEntity()
                .stream()
                .filter(e -> id == e.getId()).toList();
        if (list.size() > 0) {
            System.out.printf("По вашему запрошенному ID=%d найдены следующие совпадения:\n", id);
        } else {
            System.out.println("По вашему запросу ничего не найдено");
        }
        return list;
    }

    @Override
    public List<LibraryEntity> filterList(Library library, String author) {
        List<LibraryEntity> list = library.getListEntity()
                .stream()
                .filter(e -> e instanceof Authoreable && (((Authoreable) e)
                        .getAuthor()
                        .toLowerCase()
                        .contains(author.toLowerCase())))
                .toList();
        if (list.size() > 0) {
            System.out.printf("По вашему запрошенному Автор=%s найдены следующие совпадения:\n", author);
        } else {
            System.out.println("По вашему запросу ничего не найдено");
        }
        return list;
    }
}
