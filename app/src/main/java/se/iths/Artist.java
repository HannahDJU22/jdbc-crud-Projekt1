package se.iths;

public class Artist {
   private final long id;
    private String name;

    public Artist(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ArtistId: " + id + ", ArtistName: " + name + ".";
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
