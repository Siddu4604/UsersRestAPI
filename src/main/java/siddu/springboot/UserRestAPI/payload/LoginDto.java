package siddu.springboot.UserRestAPI.payload;


import lombok.Data;
//Data Transfer Object

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
