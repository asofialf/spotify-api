package sofiaalfaro.spotifyapi.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private String username;
    private String password;
    private LocalDate birthdate;
    private String address;

    private String country;
    private Long artistId;
}