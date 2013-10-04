/**
 * 
 */
package holdingYourObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import staticPack.TextFile;

/**
 * @author orecto
 * 
 */
/*
 * Modify the previous exercise so that it uses a class containing a String and
 * a count field to store each different word, and a Set of these objects to
 * maintain the list of words
 */

class Word {
	private static int totalWords = 0;
	private String s;
	private int count;

	Word() {
		totalWords++;
	}

	Word(String s, int count) {
		this.s = s;
		this.count = count;
		totalWords++;
	}

	/**
	 * @return the totalWords
	 */
	public static int getTotalWords() {
		return totalWords;
	}

	/**
	 * @param totalWords
	 *            the totalWords to set
	 */
	public static void setTotalWords(int totalWords) {
		Word.totalWords = totalWords;
	}

	/**
	 * @return the s
	 */
	public String getS() {
		return s;
	}

	/**
	 * @param s
	 *            the s to set
	 */
	public void setS(String s) {
		this.s = s;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	public void newAppearance() {
		this.count++;
	}

	public String toString() {
		return s + ": " + count;
	}
}

public class Exercise22 {
	public static void main(String[] args) {
		List<String> listOfWords = new ArrayList<String>(new TextFile(
				"Superpuper.txt", "\\W+"));
		Collections.sort(listOfWords, String.CASE_INSENSITIVE_ORDER);
		System.out.println("Sorted words for counting: " + listOfWords);
		Iterator<String> it = listOfWords.iterator();
		// Set<Word> wordObjects = new HashSet<Word>();
		// while(it.hasNext()) {
		// String s = it.next();
		// int count = 0;
		// for(int i = 0; i < listOfWords.size(); i++) {
		// if(s.equals(listOfWords.get(i))) count++;
		// }
		// wordObjects.add(new Word(s, count));
		// }

		List<Word> wordArrList = new ArrayList<Word>();
		while (it.hasNext()) {
			String s = it.next();
			if (wordArrList.contains(s))
				wordArrList.get(wordArrList.lastIndexOf(s)).newAppearance();
			else
				wordArrList.add(new Word(s, 1));
		}
		Set<Word> wordObjects = new LinkedHashSet<Word>(wordArrList);

		System.out.println("Word count: " + wordObjects);
		System.out.println("Total words: " + Word.getTotalWords());
	}

}