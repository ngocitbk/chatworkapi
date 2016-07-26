package vn.framgia;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ngo.dinh.ngoc on 7/26/16.
 */
public class MainActivity {

    //Replace your token
    private static final String TOKEN_KEY = "2238c0751ddaef806ba25525acfc202a";


    public static void main(String[] args) {

        ChatworkClient chatworkClient = new ChatworkClient(TOKEN_KEY, "", "");
        try {

            // Get list room
            List<Room> roomList = chatworkClient.getRooms();
            for (Room r : roomList) {
                System.out.println(r.roomId + " : " + r.name);
            }

            // Send message
            String roomId = "30565861";
            chatworkClient.sendMessage(roomId, "Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
