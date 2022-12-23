package br.com.haiyu.identificacaoms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.haiyu.identificacaoms.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	public UserRepository ur;
	
}
