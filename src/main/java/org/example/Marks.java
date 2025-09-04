package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;
@Getter
@Setter
@ToString

public class Marks {
    private  double initialValue;
    private  double finalValue;
    private  double newValue;
    private  double oldValue;
    private  double bonus;
    private  double minus;
    Date startDate;
    Date endDate;

    public void watchMark(double initialValue,double newValue,double finalValue,double bonus,double minus) {
        if ((initialValue != newValue && finalValue != newValue )) {
            if (bonus != 0.0){
                initialValue += (newValue+bonus);
            } else if (minus != 0.0 && minus > 0.0) {
                initialValue += (newValue-minus);
            }else {
                initialValue += newValue;
            }
            System.out.println("mark updated");
        }
        if ((initialValue == newValue && finalValue == newValue && bonus == 0.0 && minus == 0.0)) {
            System.out.println("No mark for this student");
        }
        if ((initialValue != newValue && finalValue == newValue)){
            if (bonus != 0.0){
                initialValue += (newValue+bonus);
            } else if (minus != 0.0 && minus > 0.0) {
                initialValue += (newValue-minus);
            }else {
                initialValue += newValue;
            }
            System.out.println("Last mark for this student");
        }

    }



}
