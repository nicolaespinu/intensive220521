package main.repo;

import main.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MesssageRepo  extends CrudRepository<Message,Integer> {

}
