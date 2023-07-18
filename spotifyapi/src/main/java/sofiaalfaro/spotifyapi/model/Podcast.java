package sofiaalfaro.spotifyapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "podcasts")
public class Podcast {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="podcast_name", nullable = false)
    private String podcastName;

    @Column(name = "duration", nullable = false)
    private double duration;

    @Column(name="genre", nullable = false)
    private String genre;

    @ManyToOne
    @JoinColumn(name="artist_id", nullable = false,
            foreignKey = @ForeignKey(name="FK_ARTIST_PODCAST_ID"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Artist artist;
}
