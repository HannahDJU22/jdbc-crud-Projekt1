package se.iths;

public class Album {
    private final int id;
    private String title;

    public Album(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "AlbumId: " + id + ", AlbumTitle: " + title + ".";
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
