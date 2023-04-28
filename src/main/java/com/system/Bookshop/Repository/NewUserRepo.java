package com.system.Bookshop.Repository;

import com.system.Bookshop.Entity.NewUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface NewUserRepo extends JpaRepository<NewUser,Integer> {

    Optional<NewUser> findOneByEmailAndPassword(String email, String password);

    NewUser findByEmail(String email);

}
