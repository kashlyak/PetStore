package by.kashliak.demo.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class Pet {

    public String name;
    public String type;

    public Pet(String name) {
        this.name = name;
    }
}
