package com.elect.backich.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table
public class Text
{
    @Id
    @SequenceGenerator(
            name = "text_sequence",
            sequenceName = "text_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "text_sequence"
    )
    private long id;
    private String text;
}

