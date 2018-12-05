package training.home.sockjsvue.data;

import org.springframework.data.repository.CrudRepository;
import training.home.sockjsvue.model.User;

public interface UserRepository extends CrudRepository<User, String> {
}
