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
    int id;
    String name;
    Date birthDate;
    String email;
    String phoneNumber;
    String specialty;
}
