package uli.nick.springsimple.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;
import uli.nick.springsimple.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
