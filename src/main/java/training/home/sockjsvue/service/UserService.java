package training.home.sockjsvue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import training.home.sockjsvue.data.UserRepository;
import training.home.sockjsvue.model.User;
import training.home.sockjsvue.model.payload.RegisterPayload;

import javax.servlet.http.HttpServletResponse;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    HttpService httpService;

    public void register(RegisterPayload registerPayload) {
        HttpServletResponse response = httpService.getResponse();

        if(isRegisterPayloadValid(registerPayload)){
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        try{
            userRepository.save(new User(registerPayload));
            response.setStatus(HttpServletResponse.SC_CREATED);
        }catch (Exception e){
            response.setStatus(HttpServletResponse.SC_CONFLICT);
        }
    }

    private boolean isRegisterPayloadValid(RegisterPayload registerPayload) {
        return registerPayload.getPassword() == null || registerPayload.getUsername() == null;
    }
}
