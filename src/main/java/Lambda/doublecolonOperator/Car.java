package Lambda.doublecolonOperator;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {

    private String make;
    private Integer model;


    public Car() {

    }

    public Car(Integer model) {
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, Integer model) {
        this.make = make;
        this.model = model;
    }

}
