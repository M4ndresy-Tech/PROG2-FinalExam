package org.example;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Data
@Getter
@Setter
@ToString
public class Teacher {
    private int id;
    private String name;
    private Date birthDate;
    private String email;
    private String phoneNumber;
    private String specialty;
}
