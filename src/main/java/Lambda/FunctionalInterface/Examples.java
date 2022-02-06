package Lambda.FunctionalInterface;

import java.util.function.*;

public class Examples {

    public static void main(String[] args) {


        //**********PREDICATE*********//

      /*  Predicate<Integer> lesserThan=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer<15;
            }
        };
        lesserThan.test(50);*/

        Predicate<Integer> lesserThan=(a)-> a<18;

        System.out.println(lesserThan.test(10));

        //**********CONSUMER*********//

        Consumer<Integer> display=i->System.out.println(i);
        display.accept(10);

        //**********CONSUMER*********//
        BiConsumer<Integer, Integer> addtwo=(a,b)->System.out.println(a+b);
        addtwo.accept(10,20);

        //**********FUNCTION*********//

        Function<String,String>  fun=s->"Ozzy"+s;
        System.out.println(fun.apply("ozzy"));

        Function<String,Integer>  fun1=s->s.length();
        System.out.println(fun1.apply("ozzy"));

        //************BICONSUMER******************//
        BiConsumer<Integer,Integer> addTwo = (x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);

        //************SUPPLIER******************//
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());


    }


}
