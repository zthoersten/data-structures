import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
        String result = "";
        Scanner scanner = new Scanner(sentence);
        
        // Complete this method. Use a Stack.
        Stack<String> phrase = new Stack<>();

        String[] words = sentence.split(" ");
        
        for (String word: words){
            word = word.toLowerCase();
            if (word.endsWith(".")) {
                String currSentence = "";
                word = word.substring(0, word.length() - 1);
                phrase.push(word);
                while (!phrase.isEmpty()) {
                    currSentence += phrase.pop();
                    if (!phrase.isEmpty()) {
                        currSentence += " ";
                    } else {
                        currSentence += ". ";
                        String first = currSentence.substring(0, 1);
                        first = first.toUpperCase();
                        currSentence = first + currSentence.substring(1);
                        result += currSentence;
                    }
                }
            } else {
                phrase.push(word);
            }
        }
        System.out.println(phrase);
        return result;
    }
}
