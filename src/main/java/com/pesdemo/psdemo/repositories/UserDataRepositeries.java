package com.pesdemo.psdemo.repositories;

import com.pesdemo.psdemo.models.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepositeries extends JpaRepository<UserData, Long> {}

