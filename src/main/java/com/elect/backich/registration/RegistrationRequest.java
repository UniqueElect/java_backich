package com.elect.backich.registration;

import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String username;
    private final String password;
}
