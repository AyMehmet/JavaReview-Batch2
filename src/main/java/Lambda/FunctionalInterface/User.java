package Lambda.FunctionalInterface;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private String Name;
    private String lastName;
    private int age;
}
