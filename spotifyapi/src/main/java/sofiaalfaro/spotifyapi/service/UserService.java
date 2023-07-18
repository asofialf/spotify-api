package sofiaalfaro.spotifyapi.service;

import sofiaalfaro.spotifyapi.model.User;

import java.util.List;

public interface UserService {
    public abstract User createUser(User user);
    public abstract User updateUser(User user);
    public abstract User getUserById(Long userId);
    public abstract List<User> getAllUsers();
    public abstract void deleteUser(Long userId);
}
