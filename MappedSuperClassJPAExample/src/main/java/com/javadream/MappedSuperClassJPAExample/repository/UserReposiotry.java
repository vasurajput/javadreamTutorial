package com.javadream.MappedSuperClassJPAExample.repository;

import com.javadream.MappedSuperClassJPAExample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposiotry extends JpaRepository<User, Long> {
}
