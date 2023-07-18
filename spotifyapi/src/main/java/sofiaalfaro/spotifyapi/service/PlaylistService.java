package sofiaalfaro.spotifyapi.service;

import sofiaalfaro.spotifyapi.model.Playlist;

import java.util.List;

public interface PlaylistService {
    public abstract Playlist createPlaylist(Playlist playlist);
    public abstract Playlist updatePlaylist(Playlist playlist);
    public abstract List<Playlist> getAllPlaylists();
    public abstract Playlist getPlaylistById(Long playlistId);
}
