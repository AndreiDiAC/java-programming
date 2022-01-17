package $OOP.SocialMediaTask;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia implements hasPictures{

    private String username;
    private String password;
    private String numberOfFollowers;
    private String numberOfFollowing;
    private ArrayList<String> posts;

    public Instagram(String username, String password){
        this.username = username;
        this.password = password;
        personalUrl = "Instagram.com/" + username;

    }

    static {
        Platform = "Instagram";
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
        this.password = password;
    }

    public String getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(String numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public String getNumberOfFollowing() {
        return numberOfFollowing;
    }

    public void setNumberOfFollowing(String numberOfFollowing) {
        this.numberOfFollowing = numberOfFollowing;
    }

    public ArrayList<String> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<String> posts) {
        this.posts = posts;
    }

    @Override
    public void likePicture() {

    }

    @Override
    public void unLikePicture() {

    }

    @Override
    public void sharePicture() {

    }
}
