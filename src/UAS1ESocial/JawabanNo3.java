package UAS1ESocial;
import UAS1ESocial.Messages;
import UAS1ESocial.UAS1E;
import java.util.Scanner;
import java.util.ArrayList;

public class JawabanNo3 {
    public static void main(String[] args) {
        UAS1E social = new UAS1E();
        social.setUserId("001");
        social.setUserName("@whitehat");
        System.out.println("USER ID : " + social.getUserId());
        System.out.println("USER NAME : " + social.getUserName());
        int jum_msg=3;
        Scanner sc = new Scanner(System.in);
        ArrayList<Messages> xMsg = new ArrayList<>();
        for(int index=0;index<jum_msg;index++){
            Messages msg = new Messages();
            msg.setUserId(social.getUserId());
            msg.setUserName(social.getUserName());
            System.out.print("Post Message " + String.valueOf(index+1) + " = ");
            String _msg = sc.nextLine();
            msg.setWhatYouPost(_msg);
            xMsg.add(msg);
        }
        social.setMY_MESSAGES(xMsg);
        //TODO :
        //  BUATLAH METHOD ShowPosts untuk menampilkan
        //  pesan yang telah di posting oleh user
        social.ShowPost(social);
    }
}
