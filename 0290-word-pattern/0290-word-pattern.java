class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();
        String[] words = s.split(" ");
        
        if(pattern.length() != words.length) {
            return false;
        }
        
        for(int i = 0; i < pattern.length(); i++) {
            
            char c = pattern.charAt(i);
            String word = words[i];
            
            if(charToWord.containsKey(c)) {
                if(!charToWord.get(c).equals(word)){
                    return false;
                }
            } else {
                if(wordToChar.containsKey(word)) {
                    return false;
                }
                charToWord.put(c, word);
                wordToChar.put(word, c);
            }
        }
        
        return true;
    }
}