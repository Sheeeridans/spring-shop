package com.nesterova.springeshop.dto;

import com.nesterova.springeshop.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    //d
    private Long id;
    private String username;
    private String password;
    private String matchingPassword;
    private String email;
    //ss
    private Role role;
}
