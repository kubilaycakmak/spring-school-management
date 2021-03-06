package com.groupd.springschoolmanagement.repository;


import com.groupd.springschoolmanagement.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Account, Long> {
    Account findByEmail(String email);
}

