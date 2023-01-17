package UAS1ESocial;

import java.util.ArrayList;

public class UAS1E {
    private String UAS1E;
    private String UserId;
    private String UserName;
    private ArrayList<Messages>MY_MESSAGES;

    public String getUAS1E() {
        return UAS1E;
    }

    public void setUAS1E(String UAS1E) {
        this.UAS1E = UAS1E;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public ArrayList<Messages> getMY_MESSAGES() {
        return MY_MESSAGES;
    }

    public void setMY_MESSAGES(ArrayList<Messages> MY_MESSAGES) {
        this.MY_MESSAGES = MY_MESSAGES;
    }

    public UAS1E() {

    }

    public UAS1E(String UAS1E, String userId, String userName, ArrayList<Messages> MY_MESSAGES) {
        this.UAS1E = UAS1E;
        this.UserId = userId;
        this.UserName = userName;
        this.MY_MESSAGES = MY_MESSAGES;

    }
    public void ShowPost(UAS1E uas1E){
        for (Messages messages : uas1E.getMY_MESSAGES()){
            System.out.print(messages.getWhatYouPost());
        }

    }

}
