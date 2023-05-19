package br.com.security.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.security.entity.User;

@Repository
public interface UserRepository 
			extends CrudRepository<Long,User> {

	Optional<User> findByUser(String user);
}
