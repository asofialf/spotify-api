package sofiaalfaro.spotifyapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="playlists")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name = "creation_date", nullable = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDate creationDate;

    @PrePersist
    protected void onCreate() {
        creationDate = LocalDate.now();
    }
    @OneToMany(mappedBy = "playlist", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Song> songs;
    @ManyToOne
    @JoinColumn(name="user_id", nullable = false,
            foreignKey = @ForeignKey(name="FK_ARTIST_USER_ID"))
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private User user;
}
