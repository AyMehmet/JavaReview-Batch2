package Stream;

import Stream.task.Dish;
import Stream.task.DishData;

import java.util.Optional;

public class MatchingFinding {

    public static void main(String[] args) {

        //ALL MATCH
        System.out.println("*******************");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        //ANY MATCH
        System.out.println("*******************");
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian))
            System.out.println("The menu is vegetarian friendly");

        //NONE MATCH
        System.out.println("*******************");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        //FIND ANY
        Optional<Dish> dish=DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());


        //FIND FIRST
        Optional<Dish> dish2=DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());
    }
}
