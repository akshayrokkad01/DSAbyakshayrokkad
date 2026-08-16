class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> freqStringMap = new HashMap<>();
        for (String str : strs) {
            String freqString = getFreqString(str);
            // if frequency string is not created we have to create. //if freqString is already created we have to add string to taht particular freqString address
            if (freqStringMap.containsKey(freqString)) {
                freqStringMap.get(freqString).add(str);
            } else // create new List and add string to list 
            //add frequSting and string to freqStringMAp
            {
                List<String> list = new ArrayList<>();
                list.add(str);
                freqStringMap.put(freqString, list);
            }
        }
        return new ArrayList<>(freqStringMap.values());// at the end we have to return all the GROUP ANAGRAM
    }

    private String getFreqString(String str) {
        //create freq bucket
        int[] freq = new int[26];
        //itreate each charachter
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }
        //create freqstring
        StringBuilder frequ = new StringBuilder("");
        char c = 'a';
        for (int i : freq) {
            frequ.append(c);
            frequ.append(i);
            c++;
        }
        return frequ.toString();
    }
}