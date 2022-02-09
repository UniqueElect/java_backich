package com.elect.backich.dto;

import com.elect.backich.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
    private long id;
    private String username;
    private String password;
    private Role role;
}
