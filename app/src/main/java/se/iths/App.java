package se.iths;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import static se.iths.Constants.*;

public class App {
    Connection con = null;
    ResultSet rs = null;
    

    public static void main(String[] args) {
        App app = new App();
        //app.metod
    }

    private Collection<Artist> importArtists(){
        Collection<Artist> artists = new ArrayList<>();
        try {
            con = DriverManager.getConnection(JDBC_CONNECTION, JDBC_USER, JDBC_PASSWORD);
            rs = con.createStatement().executeQuery(SQL_SELECT_ALL_ARTISTS);
            while(rs.next()){
                long id = rs.getLong(SQL_COL_ARTIST_ID);
                String name = rs.getString(SQL_COL_ARTIST_NAME);
                artists.add(new Artist(id, name));
            }
        } catch (SQLException e) {
            System.err.println("Fel" + e);
        } finally {
            try {
                rs.close();
            } catch (Exception ignore) {
            }
            try {
                con.close();
            } catch (Exception ignore) {}
        }
        return artists;
    }

    private Collection<Album> importAlbums(){
        Collection<Album> albums = new ArrayList<>();
        try{
            con=DriverManager.getConnection(JDBC_CONNECTION, JDBC_USER, JDBC_PASSWORD);
            rs=con.createStatement().executeQuery(SQL_SELECT_ALL_ALBUMS);
            while(rs.next()){
                long id= rs.getLong(SQL_COL_ALBUM_ID);
                String title = rs.getString(SQL_COL_ALBUM_TITLE);
                albums.add(new Album(id, title));
            }
        }catch (SQLException e){
            System.err.println("Fel" + e);
        } finally {
        try {
            rs.close();
        } catch (Exception ignore) {}
            try {
                con.close();
            } catch (Exception ignore) {}
    }
        return albums;
    }
}
