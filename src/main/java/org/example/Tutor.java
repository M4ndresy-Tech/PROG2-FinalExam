package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;
@Getter
@Setter
@ToString

public class Tutor {
    int id;
    String name;
    Date birthDate;
    String email;
    String phoneNumber;
    String relationDescription;
}
