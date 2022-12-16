package se.iths;

public class Constants {

    public static final String JDBC_CONNECTION = "jdbc:mysql://localhost:3306/Chinook";
    public static final String JDBC_USER = "iths";
    public static final String JDBC_PASSWORD = "iths";

    public static final String SQL_SELECT_ALL_ARTISTS = "SELECT * FROM Artist";
    public static final String SQL_COL_ARTIST_ID = "SELECT ArtistId FROM Artist";
    public static final String SQL_COL_ARTIST_NAME = "SELECT Name FROM Artist";
    public static final String SQL_SELECT_ALL_ALBUMS = "SELECT * FROM Album";
    public static final String SQL_COL_ALBUM_ID = "SELECT AlbumId FROM Album";
    public static final String SQL_COL_ALBUM_TITLE = "SELECT Title FROM Album";
}
