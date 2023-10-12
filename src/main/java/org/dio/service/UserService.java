package org.dio.service;

import org.dio.domain.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
