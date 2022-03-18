package com.pascal.springbootjpaexample.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// Lombok getter und setter annotations
@Getter
@Setter
@Data
// JPA-Entity annotation
@Entity
public class BookModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String buchname;

    private Long buchnr;

    private boolean ausgeliehen;




}
