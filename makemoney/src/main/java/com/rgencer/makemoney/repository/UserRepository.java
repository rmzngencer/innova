package com.rgencer.makemoney.repository;

import com.rgencer.makemoney.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
