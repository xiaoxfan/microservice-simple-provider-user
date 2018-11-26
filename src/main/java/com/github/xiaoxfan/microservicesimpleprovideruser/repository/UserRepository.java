package com.github.xiaoxfan.microservicesimpleprovideruser.repository;

import com.github.xiaoxfan.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author xiaofan
 * @date 2018/11/26 11:35
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
