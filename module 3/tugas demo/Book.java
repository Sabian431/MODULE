class Book {
    private String bookId;
    private String title;
    private String author;
    private String category;
    private int stock;
    private int duration;
    public Book(String bookId, String title, String author, String category, int stock, int duration) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;
        this.duration = duration;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayInfo() {
        System.out.println("|| " + bookId + " || " + title + " || " + author + " || " + category + " || " + stock + " ||");
    }
}

class HistoryBook extends Book {
    public HistoryBook(String bookId, String title, String author, int stock, int duration) {
        super(bookId, title, author, "Sejarah", stock, duration);
    }
}

class StoryBook extends Book {
    public StoryBook(String bookId, String title, String author, int stock, int duration) {
        super(bookId, title, author, "Cerita", stock, duration);
    }
}

class TextBook extends Book {
    public TextBook(String bookId, String title, String author, int stock, int duration) {
        super(bookId, title, author, "Novel", stock, duration);
    }
}