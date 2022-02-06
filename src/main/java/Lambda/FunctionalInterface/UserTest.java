package Lambda.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> userList=new ArrayList<>();
        userList.add(new User("ali","aaa",10 ));
        userList.add(new User("eli","asfas",14));

        List<User> allUser=showUser(userList,user -> userList.contains(user));
        System.out.println(allUser);
        List<User> someUser=showUser(userList,user -> user.getName().startsWith("a"));
        System.out.println(someUser);


        }


    private static List<User> showUser(List<User> userList, Predicate<User> p) {

        List<User> result = new ArrayList<>();

        for(User user :userList){
            if(p.test(user)){
                result.add(user);
            }
        }

        return result;
    }


}
