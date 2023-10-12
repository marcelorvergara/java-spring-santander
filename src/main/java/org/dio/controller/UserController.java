package org.dio.controller;

import org.dio.domain.converter.UserConverter;
import org.dio.domain.dto.UserDTO;
import org.dio.domain.model.User;
import org.dio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    @Autowired
    private UserConverter userConverter;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        var user = userService.findById(id);
        return ResponseEntity.ok(userConverter.toDTO(user));
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody User userToCreate) {
        var userCreated = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userConverter.toDTO(userCreated));
    }
}
