package training.home.sockjsvue.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import training.home.sockjsvue.model.payload.PayloadMapper;

@Component
public class SocketTextHandler extends TextWebSocketHandler {

    private Gson gson = new GsonBuilder().create();

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        try{
            PayloadMapper payload = gson.fromJson(
                    message.getPayload(),
                    PayloadMapper.class
            );

            switch (payload.getType()){
                case LOGIN:
                    System.out.println("login");
                    break;
                default:
                    System.out.println("invalid Action type");
            }

        }catch (Exception e){
            session.sendMessage(new TextMessage("error"));
            session.close();
        }
    }
}
