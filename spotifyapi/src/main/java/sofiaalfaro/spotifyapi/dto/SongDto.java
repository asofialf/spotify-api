package sofiaalfaro.spotifyapi.dto;

import lombok.Data;

@Data
public class SongDto {
    private String name;
    private String genre;
    private String description;
    private double length;
    private long artistId;
    private long playlistId;
}
