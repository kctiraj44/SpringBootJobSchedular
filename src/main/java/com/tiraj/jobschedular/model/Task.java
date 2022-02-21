package com.tiraj.jobschedular.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@ToString
public class Task {

    @Id
    @GeneratedValue
    private int id;
    private String message;
}
