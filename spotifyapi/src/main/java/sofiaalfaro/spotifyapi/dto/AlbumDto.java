package sofiaalfaro.spotifyapi.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AlbumDto {
    private String albumName;
    private String genre;
    private LocalDate releaseDate;
    private Long artistId;
}
