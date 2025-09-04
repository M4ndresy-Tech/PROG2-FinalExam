package org.example;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
    private String phoneNumber;
    private String group;
    private Tutor tutor;


}
