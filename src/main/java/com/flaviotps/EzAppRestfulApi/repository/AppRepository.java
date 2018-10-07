package com.flaviotps.EzAppRestfulApi.repository;

import com.flaviotps.EzAppRestfulApi.model.AppModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<AppModel, Long> {
    AppModel findById(long id);
}
