package sofiaalfaro.spotifyapi.service;

import sofiaalfaro.spotifyapi.model.Album;

import java.util.List;

public interface AlbumService {
    public abstract Album createAlbum(Album album);
    public abstract Album getAlbumById(Long albumId);
    public abstract List<Album> getAllAlbums();
    public abstract Album updateAlbum(Album album);
    public abstract void deleteAlbum(Long albumId);
}
