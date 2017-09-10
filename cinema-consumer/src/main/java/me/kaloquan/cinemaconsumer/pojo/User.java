package me.kaloquan.cinemaconsumer.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class User {
    Long id;
    String username;
    String name;
    Integer age;
    BigDecimal balance;
}
