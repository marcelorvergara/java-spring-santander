package org.dio.domain.dto;

import org.dio.domain.model.Account;

public class UserDTO {

    private Long id;
    private String name;

    public UserDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
