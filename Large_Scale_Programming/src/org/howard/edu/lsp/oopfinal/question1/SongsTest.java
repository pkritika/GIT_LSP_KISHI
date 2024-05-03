package org.howard.edu.lsp.oopfinal.question1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class SongsTest {

    @Test
    public void testAddSong_ValidInput() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Country", "Love Story");
        Set<String> songs = db.getSongs("Country");
        assertTrue(songs.contains("Love Story"));
    }

    @Test
    public void testGetGenreOfSong_ExistingSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Pop", "Shake It Off");
        String genre = db.getGenreOfSong("Shake It Off");
        assertEquals("Pop", genre);
    }

    @Test
    public void testGetGenreOfSong_NonexistentSong() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Pop", "Love Story");
        String genre = db.getGenreOfSong("Blank Space");
        assertNull(genre);
    }

    @Test
    public void testGetSongs_ExistingGenre() {
        SongsDatabase db = new SongsDatabase();
        db.addSong("Pop", "Love Story");
        db.addSong("Pop", "Shake It Off");
        db.addSong("Pop", "Blank Space");
        Set<String> popSongs = db.getSongs("Pop");
        assertTrue(popSongs.contains("Love Story"));
        assertTrue(popSongs.contains("Shake It Off"));
        assertTrue(popSongs.contains("Blank Space"));

        db.addSong("Country", "Love Story");
        Set<String> countrySongs = db.getSongs("Country");
        assertTrue(countrySongs.contains("Love Story"));
    }

}
