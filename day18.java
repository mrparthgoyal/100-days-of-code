// reverse vowels of a string
class Solution {
    public String reverseVowels(String s) {
        char[]sArray=s.toCharArray();
        String vowels="aeiouAEIOU";
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            while(left<right && vowels.indexOf(sArray[left])==-1)left++;
            while(left<right && vowels.indexOf(sArray[right])==-1)right--;
            char temp=sArray[left];
            sArray[left]=sArray[right];
            sArray[right]=temp;
            left++;
            right--;
        }
        return new String(sArray);
    }
}

// most common word
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String>bannedSet=new HashSet<>(Arrays.asList(banned));
        HashMap<String,Integer>wordCount=new HashMap<>();
        String[]words=paragraph.toLowerCase().replaceAll("[^a-z]"," ").split("\\s+");

        for(String word:words)
        {
            if(!bannedSet.contains(word))
            {
                wordCount.put(word,wordCount.getOrDefault(word,0)+1);
            }
        }

        String mostCommon="";
        int maxCount=0;
        for(Map.Entry<String,Integer>entry:wordCount.entrySet())
        {
            if(entry.getValue()>maxCount)
            {
                mostCommon=entry.getKey();
                maxCount=entry.getValue();
            }
        }
        return mostCommon;
    }
}