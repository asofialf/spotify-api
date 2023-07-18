package sofiaalfaro.spotifyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sofiaalfaro.spotifyapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
