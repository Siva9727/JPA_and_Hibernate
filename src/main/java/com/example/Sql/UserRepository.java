package com.example.Sql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    // here User: is the part to connect to  the entity. or whom to connect
    // second part is the data type of the primary key

}
