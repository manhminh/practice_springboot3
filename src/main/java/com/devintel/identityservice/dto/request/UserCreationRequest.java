package com.devintel.identityservice.dto.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCreationRequest {
    private String username;
    @Size(min = 8, message = "PASSWORD_INVAlID")
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate dob;
}
