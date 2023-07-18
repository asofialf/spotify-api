package sofiaalfaro.spotifyapi.service;

import sofiaalfaro.spotifyapi.dto.UserDto;
import sofiaalfaro.spotifyapi.model.User;

import java.util.List;

public interface UserService {
    public abstract UserDto createUser(User user);
    public abstract UserDto updateUser(User user);
    public abstract UserDto getUserById(Long userId);
    public abstract List<UserDto> getAllUsers();
    public abstract void deleteUser(Long userId);
}
