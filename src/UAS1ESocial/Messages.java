package UAS1ESocial;

public class Messages {
    private String UserId;
    private String UserName;
    private String WhatYouPost;

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

    public String getWhatYouPost() {
        return WhatYouPost;
    }

    public void setWhatYouPost(String whatYouPost) {
        WhatYouPost = whatYouPost;
    }

    public Messages(String userId, String userName, String whatYouPost) {
        this.UserId = userId;
        this.UserName = userName;
        this.WhatYouPost = whatYouPost;
    }
    public Messages() {

    }
}
