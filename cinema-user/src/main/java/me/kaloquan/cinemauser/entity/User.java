package me.kaloquan.cinemauser.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column
    String username;
    @Column
    String name;
    @Column
    Integer age;
    @Column
    BigDecimal balance;
}
