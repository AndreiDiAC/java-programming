package $OOP.SocialMediaTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PostClass {
    private String body;
    final String DATA_TIME;

    public PostClass(String body,String dataTime ){
        this.body = body;
        DATA_TIME = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public String getDataTime(){
        return DATA_TIME;
    }
}
