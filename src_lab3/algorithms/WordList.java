package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class WordList implements StringSearchInterface{

	private ArrayList<String> wordList;

	public WordList(String urlString) throws IOException {

		BufferedReader in = null;
		try {
			wordList = new ArrayList<String>();
			in = new BufferedReader(new InputStreamReader(new URL(urlString).openStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null)
				wordList.add(inputLine);
		}
		finally {
			if (in != null)
				in.close();
		}
	}

	@Override
  public List<String> getSubstringList(String subString) {
	  // TODO Auto-generated method stub
	  return null;
  }

	@Override
  public void addString(String s) {
	  // TODO Auto-generated method stub
	  
  }
}
