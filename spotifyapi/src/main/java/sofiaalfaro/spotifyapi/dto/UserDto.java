package sofiaalfaro.spotifyapi.dto;

import lombok.Builder;
import lombok.Data;
import sofiaalfaro.spotifyapi.model.Artist;
import sofiaalfaro.spotifyapi.model.Playlist;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class UserDto {
    private String username;
    private String password;
    private LocalDate birthdate;
    private String address;

    private String country;
    private Artist artist;
    private List<Playlist> playlists;
}