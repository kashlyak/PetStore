package by.kashliak.demo.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;


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
