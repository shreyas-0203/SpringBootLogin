package com.registeration.SpringLogin.Repository;

import com.registeration.SpringLogin.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
