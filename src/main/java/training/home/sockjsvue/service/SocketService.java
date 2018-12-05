package training.home.sockjsvue.service;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketSession;

import java.util.ArrayList;

@Service
public class SocketService {
    private ArrayList<WebSocketSession> sockets = new ArrayList<>();

}
