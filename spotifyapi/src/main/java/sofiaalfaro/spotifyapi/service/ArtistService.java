package sofiaalfaro.spotifyapi.service;

import sofiaalfaro.spotifyapi.model.Artist;

import java.util.List;

public interface ArtistService {
    public abstract Artist createArtist(Artist artist);
    public abstract Artist updateArtist(Artist artist);
    public abstract List<Artist> getAllArtists();
    public abstract Artist getArtistById(Long artistId);
    public abstract void deleteArtist(Long artistId);
}
