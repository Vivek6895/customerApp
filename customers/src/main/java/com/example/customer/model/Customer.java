package com.example.customer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Document("Customer")
@Data
public class Customer {

    @Id
    String ID;
    String FirstName;
    String SecondName;
    String LastName;
    String Address;


}
