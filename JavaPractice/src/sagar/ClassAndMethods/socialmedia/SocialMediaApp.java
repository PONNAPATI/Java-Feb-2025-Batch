package ClassAndMethods.socialmedia;

public class SocialMediaApp {
    public static void main(String[] args) {
        //Create new Post
        Post myPost = new Post("Hi ! This is my first post.");
        myPost.likePost();
        myPost.addComment("Nice Post");
        myPost.showPost();

        // Create and show a message
        Message message = new Message("Vijay", "Sagar", "Hey Vijay, how are you doing");
        message.showMessage();
    }
}
