package org.dio.service;

import org.dio.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate)
}
