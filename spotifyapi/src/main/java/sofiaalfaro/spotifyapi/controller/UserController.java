package sofiaalfaro.spotifyapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sofiaalfaro.spotifyapi.dto.UserDto;
import sofiaalfaro.spotifyapi.model.User;
import sofiaalfaro.spotifyapi.repository.UserRepository;
import sofiaalfaro.spotifyapi.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/spotify/v1/users")
public class UserController {
    @Autowired
    private UserService userService;
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    // URL: http://localhost:8080/swagger-ui/index.html#/user-controller/getAllUsers
    // Method: GET
    @Transactional(readOnly = true)
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers(){
        List<UserDto> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    //URL:
    //Method: GET
    @Transactional(readOnly = true)
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable(name = "userId") Long userId){
        UserDto user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    //
    //Method: POST
    @Transactional
    @PostMapping
    public ResponseEntity<UserDto> createUser(@RequestBody User user){
        try{
            UserDto createdUser = userService.createUser(user);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        }catch (IllegalAccessError e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
