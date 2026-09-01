import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args) throws FileNotFoundException {
        // System.out.println(System.getProperty("user.dir"));
        Set<String> dictionaryWords = readWords("Chapter 15 Class Notes\\src\\words");
        Set<String> novelWords = readWords("Chapter 15 Class Notes\\src\\war-and-peace.txt");

        for (String word : novelWords) {
            if (!dictionaryWords.contains(word)) {
                System.out.println(word);
            }
        }

        System.out.println("There are " + novelWords.size() + " unique words in the novel.");

        Iterator<String> iterator = novelWords.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() <= 3) {
                iterator.remove();
            }
        }

        System.out.println("There are " + novelWords.size() + " unique words with more than three letters in the novel.");
    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    @SuppressWarnings("ConvertToTryWithResources")
    public static Set<String> readWords(String filename) throws FileNotFoundException {
        Set<String> words = new HashSet<>();
        Scanner scanner = new Scanner(new File(filename), "UTF-8");
        scanner.useDelimiter("[^a-zA-Z]+");
        while (scanner.hasNext()) {
            words.add(scanner.next().toLowerCase());
        }
        scanner.close();
        return words;
    }
}