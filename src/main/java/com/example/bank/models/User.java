package com.example.bank.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "The First name field cannot be empty")
    @Size(min = 3, message = "The First name field must greater that 3 characters")
    private String first_name;
    @NotEmpty(message = "The Last name field cannot be empty")
    @Size(min=3, message = "The First name field must greater that 3 characters")
    private String last_name;
    @Email
    @NotEmpty
    @Pattern(regexp = "([a-zA-Z0-9]+(?:[._+-][a-zA-Z0-9]+)*)@([a-zA-Z0-9]+(?:[.-][a-zA-Z0-9]+)*[.][a-zA-Z]{2,})", message = "Please Enter a Valid Email")
    private String email;
    @NotEmpty
    @NotNull
    private String password;
    private String token;
    private String code;
    private int verified;
    private LocalDate verified_ad;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
