package com.alex.SpringBootKafkaProject.payload;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class User {

    private int id;
    private String firstName;
    private String lastName;


}
