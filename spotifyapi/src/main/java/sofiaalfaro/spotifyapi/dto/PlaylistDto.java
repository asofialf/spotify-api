package sofiaalfaro.spotifyapi.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PlaylistDto {
    private String name;
    private LocalDate creationDate;
    private Long userId;
}
