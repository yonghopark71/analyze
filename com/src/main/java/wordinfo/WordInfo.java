package wordinfo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;




public class WordInfo {

    String text;
    TextLength textLength;
    Integer wordCount;

    ArrayList<HashMap<Character, Integer>> characterCount = new ArrayList<HashMap<Character, Integer>>();

    
    public WordInfo() {
        this("");
    }

    public WordInfo(String text) {

        if (text == null || text.isEmpty())
            text = "";

        this.text = text;
        this.textLength = new TextLength(this.text);
        this.wordCount = (this.textLength.withSpaces > 0) ? this.text.trim().split("\\s+").length : 0;
        this.characterCount = getCharacterList(this.text);

    }

    public WordInfo geWordInfoInstance() {
        return this;
    }

    public void setTextLength(final TextLength textLength) {
        this.textLength = textLength;
    }

    public TextLength getTextLength() {
        return textLength;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(final int wordCount) {
        this.wordCount = wordCount;
    }

    public ArrayList<HashMap<Character, Integer>> getCharacterCount() {
        return characterCount;
    }


    private Map<Character, Integer> getCharacter(final String str) {

        final Map<Character, Integer> map = new TreeMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {

            final char temp = str.toLowerCase().charAt(i);

            if (!Character.isLetter(temp))
                continue;

            map.put(temp, ((map.get(temp) == null) ? 0 : map.get(temp)) + 1);

        }

        return map;

    }

    private ArrayList<HashMap<Character, Integer>> getCharacterList(final String str) {

        final ArrayList<HashMap<Character, Integer>> list = new ArrayList<HashMap<Character, Integer>>();
        if (str.isEmpty()) return list;

        final Map<Character, Integer> map = getCharacter(str);
        final Iterator<Character> iteratorKey = map.keySet().iterator(); // 키값 오름차순 정렬(기본)

        while (iteratorKey.hasNext()) {
            final Character key = iteratorKey.next();

            final HashMap<Character, Integer> tmap = new HashMap<Character, Integer>();
             tmap.put(key,map.get(key));
             list.add(tmap);
         }
 
         return list;
     }

     
 }