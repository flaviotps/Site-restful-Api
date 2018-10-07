package com.flaviotps.EzAppRestfulApi.repository;

import com.flaviotps.EzAppRestfulApi.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserModel findById(long id);

}
