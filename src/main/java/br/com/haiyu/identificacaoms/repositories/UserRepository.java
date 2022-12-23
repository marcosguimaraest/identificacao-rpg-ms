package br.com.haiyu.identificacaoms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.haiyu.identificacaoms.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
