package sofiaalfaro.spotifyapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "albums")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "album_name", nullable = false)
    private String albumName;

    @Column(name="genre", nullable = false)
    private String genre;

    @Column(name="release_date", nullable = false)
    private LocalDate releaseDate;

    @ManyToOne
    @JoinColumn(name="artist_id", nullable = false,
                    foreignKey = @ForeignKey(name="FK_ARTIST_ALBUM_ID"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Artist artist;
}
