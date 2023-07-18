package sofiaalfaro.spotifyapi.service;

import sofiaalfaro.spotifyapi.model.Song;

import java.util.List;

public interface SongService {
    public abstract Song createSong(Song song);
    public abstract Song updateSong(Song song);
    public abstract List<Song> getAllSongs();
    public abstract Song getSongById(Long songId);
    public abstract void deleteSong(Long songId);
}
