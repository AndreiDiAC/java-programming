package $OOP.SocialMediaTask;

import OfficeHours.Practice_06_21.A;
import day41_arraylist.ArraysAsList;

import java.time.LocalTime;
import java.util.ArrayList;

public class Facebook extends SocialMedia implements hasGroups{
    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private ArrayList<String> posts;
    private int countGroups;

    public Facebook(String username, String password){
        this.username = username;
        setPassword(password);
        this.personalUrl = "facebook.com/" + username;
        this.posts = new ArrayList<>();
    }

    public Facebook(String username, String password, String fullName){
        this(username,password);
        setFullName(fullName);
    }

    public Facebook(String username, String password, String fullName, int age, int numberOfFriends){
        this(username,password,fullName);
        setAge(age);
        setNumberOfFriends(numberOfFriends);
    }


    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message + " sent to " + username);
    }

    @Override
    public void post(String body) {
        posts.add(body);
    }

    @Override
    public void Notifications() {
        int time = LocalTime.now().getHour();
        if(time > 8 && time < 17){
            System.out.println("Notification");
        }else{
            System.out.println("Sleep mode");
        }
    }

    static {
        Platform = "Facebook";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.toLowerCase().contains(username.toLowerCase())){
            System.out.println("Password contained username");
            this.password = "password";
        }else{
            this.password = password;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        for(int i = 0; i < fullName.length(); i++){
            if(!Character.isLetter(fullName.charAt(i))){
                System.out.println("invalid name");
                this.fullName = "no name";
            }else{
                this.fullName = fullName;
            }
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > -1){
            this.age = age;
        }else{
            System.out.println("Invalid age");
        }

    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        if(numberOfFriends > -1 && numberOfFriends <= 5000){
            this.numberOfFriends = numberOfFriends;
        }else{
            System.out.println("Invalid number of friends!");
        }

    }


    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }

    public int getCountGroups() {
        return countGroups;
    }

    public void setCountGroups(int countGroups) {
        this.countGroups = countGroups;
    }

    @Override
    public String toString() {
        return "Facebook{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                ", posts=" + posts +
                '}';
    }

    public boolean sendFriendRequest(Facebook user){
        if(getNumberOfFriends() > 5000 && user.getNumberOfFriends() > 5000){

        }
        if(getNumberOfFriends() > 5000){
            System.out.println("You have reached the limit of friends");
            return false;
        }else if(user.getNumberOfFriends() > 5000){
            System.out.println(user.getUsername() +" can not accept any more friend request");
            return false;
        }else{
            System.out.println(" Friend request send to " + user.getUsername());
            setNumberOfFriends(getNumberOfFriends() + 1);
            user.setNumberOfFriends(user.getNumberOfFriends() + 1);
        }
        return true;
    }

    @Override
    public void joinGroup(String group) {
        System.out.println(getUsername() + " has joined " + group);
        setCountGroups(getCountGroups() + 1);
    }

    @Override
    public void leaveGroup(String group) {
        System.out.println(getUsername() + " has left " + group);
        setCountGroups(getCountGroups()-1);
    }
}
