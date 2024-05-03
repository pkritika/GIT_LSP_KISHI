package org.howard.edu.lsp.oopfinal.question1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
	
	
	private final Map <String, Set<String>> map = new HashMap<String, Set<String>>();

    
    public void addSong(String genre, String songTitle) {
        if (genre == null || songTitle == null) {
            throw new IllegalArgumentException("Genre and song title cannot be null");
        }

        genre = genre.trim(); 
        songTitle = songTitle.trim(); 
        Set<String> songs = map.getOrDefault(genre, new HashSet<>()); 
        songs.add(songTitle);
        map.put(genre, songs);
    }


public String getGenreOfSong(String songTitle) {
    if (songTitle == null) {
        throw new IllegalArgumentException("Song title cannot be null");
    }
    songTitle = songTitle.trim(); 
    for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
        if (entry.getValue().contains(songTitle)) {
            return entry.getKey();
        }
    }
    return null;
}


public Set<String> getSongs(String genre) {
    if (genre == null) {
        throw new IllegalArgumentException("Genre cannot be null");
    }
    genre = genre.trim(); 
    return map.getOrDefault(genre, new HashSet<>()); 
}
}

