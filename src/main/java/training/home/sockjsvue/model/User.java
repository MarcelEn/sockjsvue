package training.home.sockjsvue.model;

import lombok.Getter;
import lombok.Setter;
import training.home.sockjsvue.model.payload.RegisterPayload;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(unique = true)
    @NotNull
    String username;

    @NotNull
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(RegisterPayload registerPayload) {
        username = registerPayload.getUsername();
        password = registerPayload.getPassword();
    }
}
