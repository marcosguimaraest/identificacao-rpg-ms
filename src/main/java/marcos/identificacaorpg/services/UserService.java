package marcos.identificacaorpg.services;

import marcos.identificacaorpg.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	public UserRepository ur;
	
}
