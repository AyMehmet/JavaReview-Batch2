package Lambda.doublecolonOperator;

import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //Zero-argument
        Supplier<Car> c1=()->new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2= Car::new;

        //One Argument


      Function<Integer>

        Function<Integer,Car> f1 = model -> new Car(model);
        Car bmw = f1.apply(2009);
        System.out.println(bmw.getModel());

        Function<Integer,Car> f2 = Car::new;
        Car bmw2 = f2.apply(2015);
        System.out.println(bmw2.getModel());


         */

    }
}
