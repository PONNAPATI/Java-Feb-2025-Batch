package tharun.conditionstatements;

public class VowelConsonant {
    public static void main(String[] args) {
        char letter = 'a';
        switch(letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("the letter is Vowel");
                break;
            default:
                System.out.println("The letter is Consonant");
        }
    }
}
