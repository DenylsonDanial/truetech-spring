package com.truetech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.truetech.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
