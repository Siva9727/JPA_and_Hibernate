package com.example.Sql;

import jakarta.persistence.*;

@Entity
@Table(name = "library_card")
public class LibraryCard {
    @Id
    private int cardNo;
    private int fine;
    private int bookIssued;
    @Enumerated(value = EnumType.STRING)  // to store values in the db in string format
    private CardStatus cardStatus;

    // child class contains the foreign key. which help us to combine or join the tables.
    @OneToOne // this is the Mapping relation btw Parent and Child class
    @JoinColumn // you are telling : add a foreign key column ---> define the column name of parent class or by default it will take the primary key column in parent class
    User user;  // to which entity you are connecting
}
