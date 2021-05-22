package main.repo;

import main.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

    User getByLogin(String login);
    User getBySessionId(String sessionId);


}
