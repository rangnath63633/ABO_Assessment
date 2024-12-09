package java_assement;

import java.util.HashMap;
import java.util.Map;

public class MessageHandler<K, V> {
    private Map<K, V> messageMap;

    public MessageHandler() {
        this.messageMap = new HashMap<>();
    }


    public void addMessage(K key, V value) {
        messageMap.put(key, value);
    }

    public Map<K, V> getMessageMap() {
        return messageMap;
    }


    public static void main(String[] args) {
        MessageHandler<Integer, String> messageHandler1 = new MessageHandler<>();
        messageHandler1.addMessage(1, "First Message");
        messageHandler1.addMessage(2, "Second Message");

        System.out.println("MessageHandler1: " + messageHandler1.getMessageMap());

        MessageHandler<String, String> messageHandler2 = new MessageHandler<>();
        messageHandler2.addMessage("INFO", "This is an informational message.");
        messageHandler2.addMessage("ERROR", "This is an error message.");

        System.out.println("MessageHandler2: " + messageHandler2.getMessageMap());
    }
}
