package com.sky.web.socket;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/webSocket")
public class WebSocket {
    
    private static int onlineCount = 0;
    
    private static final CopyOnWriteArraySet<WebSocket> webSocketSet = new CopyOnWriteArraySet<WebSocket>();
    
    private Session session;
    
    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        webSocketSet.add(this);
        addOnlineCount();
    }
    
    @OnClose
    public void onClose() {
        webSocketSet.remove(this);
        subOnlineCount();
    }
    
    @OnError
    public void onError(Session session, Throwable error) {
        //TODO
        System.out.println(error.getMessage());
    }
    
    @OnMessage
    public void onMessage(String message, Session session) {
        for (WebSocket webSocket : webSocketSet) {
            try {
                webSocket.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void sendMessage(String message) throws IOException {
        session.getBasicRemote().sendText(message);
        //session.getAsyncRemote().sendText(message);
    }
    
    public void sendMessage(String message, Session session) {
        
    }
    
    private static synchronized void addOnlineCount() {
        WebSocket.onlineCount++;
    }
    
    private static synchronized void subOnlineCount() {
        WebSocket.onlineCount--;
    }

    public static int getOnlineCount() {
        return onlineCount;
    }
}