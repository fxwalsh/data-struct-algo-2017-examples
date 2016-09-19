/**
 * 
 */
package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @author Frank
 * 
 */
public class WordList implements StringSearchInterface {

	private List<String> wordList;

	public WordList(String urlString) throws IOException {
		BufferedReader in = null;
		try {
			wordList = new ArrayList<String>();

			in = new BufferedReader(new InputStreamReader(
					new URL(urlString).openStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null)
				wordList.add(inputLine);
		} finally {
			if (in != null)
				in.close();
		}
		Collections.sort(wordList);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ie.wit.bsc2.assess1.StringSearchInterface#getSubstringList(java.lang.
	 * String)
	 */
	@Override
	public List<String> getSubstringList(String subString) {
		List<String> returnList = new ArrayList<String>();
		if (subString != null) {
			for (String s : wordList) {

				if (s.toLowerCase().contains(subString.toLowerCase()))
					returnList.add(s);
			}
		}
		Collections.sort(returnList);
		return returnList;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ie.wit.bsc2.assess1.StringSearchInterface#addString(java.lang.String)
	 */
	@Override
	public void addString(String s) {

		if (s != null && s.trim().length() > 0)
			wordList.add(s.trim());

	}

}
