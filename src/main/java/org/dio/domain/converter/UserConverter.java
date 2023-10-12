package org.dio.domain.converter;

import org.dio.domain.dto.UserDTO;
import org.dio.domain.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserConverter {
    public UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        return dto;
    }

    public User toEntity(UserDTO dto) {
        User user = new User ();
        user.setId(dto.getId());
        user.setName(dto.getName());
        return user;
    }
}
