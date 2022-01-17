package $$StreamExample;

import day58_polymorphism.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MappingExamples {

    public static void main(String[] args) {

        List<String> alpha = Arrays.asList("a","b","c","d");

        //Before java 8

        List<String> alphaUpper = new ArrayList<>();

        for (String s : alpha) {
            alphaUpper.add(s.toUpperCase());
        }

        System.out.println(alpha);
        System.out.println(alphaUpper);

        //Java 8

        List<String> collect = alpha
                .stream()
                .map(each -> each.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collect);

        //Extra, stream apply to any data type
        List<Integer> num = Arrays.asList(1,2,3,4,5);

        List<Integer> collect1 = num.stream()
                .map(each -> each * 2 ).collect(Collectors.toList());
        System.out.println(collect1);


        System.out.println("===================================================================");

        List<User> users = new ArrayList<>();
        users.add(new User(1,"Ramesh","secret","ramesh@gmail.com"));
        users.add(new User(2,"Tony","secret","tony@gmail.com"));
        users.add(new User(3,"Tom","secret","tom@gmail.com"));

        List<UserDTO> userDTO = new ArrayList<>();
        for(User user: users){
            userDTO.add( new UserDTO(user.getId(),user.getUserName(),user.getEmail()));
        }

        for(UserDTO each : userDTO){
            System.out.println(each);
        }

        System.out.println("========= using stream().map() ==================");

        users.stream().map(new Function<User, UserDTO>() {
            @Override
            public UserDTO apply(User user) {
                return new UserDTO(user.getId(),user.getUserName(),user.getEmail());
            }
        });

        users.stream().map((User user) -> new UserDTO(user.getId(),user.getUserName(),user.getEmail()))
                .forEach((userdto) -> {
                    System.out.println(userdto);
                });

        List<UserDTO> userDTOS = users.stream().map((User user) -> new UserDTO(user.getId(),user.getUserName(),user.getEmail()))
                .collect(Collectors.toList());
        System.out.println(userDTOS); //or
        userDTOS.forEach(System.out::println);




    }
}
class UserDTO{
    private int id;
    private String userName;

    private String email;

    public UserDTO(int id, String userName, String email) {
        super();
        this.id = id;
        this.userName = userName;

        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}




class User{
    private int id;
    private String userName;
    private String password;
    private String email;

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
