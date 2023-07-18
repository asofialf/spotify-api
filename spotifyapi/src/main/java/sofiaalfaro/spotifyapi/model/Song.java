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
@Table(name="songs")
public class Song {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name="genre", nullable = false)
    private String genre;
    @Column(name="description", nullable = false)
    private String description;
    @Column(name = "length", nullable = false)
    private double length;
    @ManyToOne
    @JoinColumn(name="artist_id", nullable = false,
            foreignKey = @ForeignKey(name="FK_ARTIST_SONG_ID"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Artist artist;
    @ManyToOne
    @JoinColumn(name="playlist_id", nullable = true,
            foreignKey = @ForeignKey(name="FK_PLAYLIST_SONG_ID"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Playlist playlist;
}
