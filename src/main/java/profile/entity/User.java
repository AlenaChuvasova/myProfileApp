package profile.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max = 10, message = "Please, enter your name")
    private String userName;
    @NotEmpty(message = "Please, enter your email")
    @Email(regexp = "^(.+)@(.+)$", message = "Invalid email")
    private String email;
    @NotNull
    @Size(min = 8, max = 20)
    private String password;
    private boolean active = true;
    private String roles = "ROLE_USER";
}
