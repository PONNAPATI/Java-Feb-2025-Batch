package StringMethods;

public class UrlSlugCreator {
    public static void main(String[] args) {
        String title = "Practicing String Methods Programs!";

        // Convert lower case
        String lower = title.toLowerCase(); // "practicing string methods programs!"

        //Remove punctuation (Remove 'i' only)
        String noPunctuation = lower.replace("!", ""); // "practicing string methods programs"

        //Replace spaces with hyphens
        String slug = noPunctuation.replace(" ", "-"); // "practicing-string-methods-programs"

        System.out.println("Original Title: " + title);
        System.out.println("Generated Slug: " + slug);
    }
}
