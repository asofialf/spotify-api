package sofiaalfaro.spotifyapi.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sofiaalfaro.spotifyapi.dto.UserDto;
import sofiaalfaro.spotifyapi.exception.ValidationException;
import sofiaalfaro.spotifyapi.model.User;
import sofiaalfaro.spotifyapi.repository.UserRepository;
import sofiaalfaro.spotifyapi.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
        this.modelMapper = new ModelMapper();
    }

    @Override
    public List<UserDto> getAllUsers(){
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());
    }
    @Override
    public UserDto createUser(User user){
        if(userRepository.existsByUsername(user.getUsername())){
            throw new ValidationException("Ya existe un usuario con el mismo username");
        }
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserDto.class);
    }
    @Override
    public UserDto updateUser(User user){
        User updatedUser = userRepository.save(user);
        return modelMapper.map(updatedUser, UserDto.class);
    }
    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found with ID: " + userId));
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
