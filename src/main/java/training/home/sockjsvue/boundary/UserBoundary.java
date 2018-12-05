package training.home.sockjsvue.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import training.home.sockjsvue.model.payload.RegisterPayload;
import training.home.sockjsvue.service.UserService;

@RestController("/api/user")
public class UserBoundary {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public void register(@RequestBody RegisterPayload registerPayload){
        userService.register(registerPayload);
    }
}
