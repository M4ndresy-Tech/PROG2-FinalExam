package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Courses {
    private int id;
    private String label;
    private int credit;
    private Teacher teacher;

}
