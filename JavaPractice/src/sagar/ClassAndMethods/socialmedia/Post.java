package ClassAndMethods.socialmedia;

import java.util.ArrayList;
import java.util.List;

/**  This class represents a social media post. Users can like the post and add comments.  */

public class Post {
    String content;
    int likes;
    List<String> comments;

    // Constructor to initialize a new post
    public Post(String contentType){
        content = contentType;
        likes = 0;
        comments = new ArrayList<>(); // Initialize an empty list for comments
    }
    // Method to like the post
    public void likePost(){
        likes++;                        // Increase the like count by 1
        System.out.println("Post liked! Total Likes: " + likes);
    }
    // Method to add a comment to the post
    public void addComment(String comment) {
        comments.add(comment);          // Add the comment to the list
    }
    // Method to display the post details
    public void showPost(){
        System.out.println("\nPost: " + content);
        System.out.println("\nLikes: " + likes);
        System.out.println("\nComments: " + comments);
    }
}
