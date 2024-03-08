package task1;

public enum Type {
    BOOK("Книга"),
    NEWSPAPER("Газета"),
    MICROFILM("Микрофильм");

    private String title;
    Type(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }



}

