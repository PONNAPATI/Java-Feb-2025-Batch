package ClassAndMethods.socialmedia;

public class Message {
    /** This class represents a simple message between two users. */
    String sender;
    String receiver;
    String messageText;

    // Constructor to create a message
    public Message(String sender, String receiver, String messageText) {
        this.sender = sender;
        this.receiver = receiver;
        this.messageText = messageText;
    }
    // Method to display the message details
    public void showMessage(){
        System.out.println("\nMessage from " + sender + " to " + receiver + ": " + messageText);
    }

}
