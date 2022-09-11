package com.simis.rest.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private int id;
    private String name;
    private String email;
    private String password;
}
