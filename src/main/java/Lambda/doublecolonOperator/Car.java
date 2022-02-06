package Lambda.doublecolonOperator;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {

    private String make;
    private String model;

    public Car() {
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

}
