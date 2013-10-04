/**
 * 
 */
package holdingYourObjects_10;

import java.util.Set;
import java.util.TreeSet;

import holdingYourObjects_10.util.TextFile;


/**
 * @author Богдан
 * 
 */
public class Exercise16 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	int allVowels=0;
	Set<String> words = new TreeSet<String>(
		new TextFile("d:\\SDevel\\1_JAVA\\1_workspace\\ITAcademy\\eclipse\\EkkelTasks\\src\\holdingYourObjects_10\\SetOperations.java", "\\W+"));
	for(String s:words){
	    System.out.println("in word { "+ s+" } is " + vowelsInWord(s) + " vowels.");
	    allVowels += vowelsInWord(s);
	}
	System.out.println("In all file is "+ allVowels + " volves.");

    }

    public static int vowelsInWord(String word) {
	int count = 0;
	char[] vowels = new char[] { 'E', 'Y', 'U', 'I', 'O', 'A', 'e', 'y',
		'u', 'i', 'o', 'a' };
	char[] wordAr = word.toCharArray();
	for (int i = 0; i < wordAr.length; i++) {
	    for (int j = 0; j < vowels.length; j++) {
		if (wordAr[i] == vowels[j]) {
		    count++;
		}
	    }

	}
	return count;
    }

}
