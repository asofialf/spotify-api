package sofiaalfaro.spotifyapi.dto;

import lombok.Data;

@Data
public class PodcastDto {
    private double duration;
    private String podcastName;
    private String genre;
    private Long artistId;
}
