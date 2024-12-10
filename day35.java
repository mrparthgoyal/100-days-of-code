// day35
// search in a roteted sorted array
class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target) // target found in the middle
            {
                return mid;
            }
            if(nums[left]<=nums[mid]) // left half is sorted
            {
                if(nums[left]<=target && nums[mid]>target)// target is in the left half
                {
                    right=mid-1;
                }
                else // target is in the right half
                {
                    left=mid+1;
                }
            }
            else // right part is sorted
            {
                if(nums[mid]<target && nums[right]>=target)
                {
                    left=mid+1; // target is in the right sorted half
                }
                else
                {
                    right=mid-1;// target is in the left half
                }
            }
        }
        return -1;
    }
}

// Ransom note
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // array to count the frequency of each alphabet in the magazine
        int[]charCounts=new int[26];

        // populate the frequency array for the magazine
        for(char ch:magazine.toCharArray())
        {
            charCounts[ch-'a']++;
        }
        // check if ransom note can be constructed
        for(char ch:ransomNote.toCharArray())
        {
            if(charCounts[ch-'a']==0)
            {
                return false; // not enough of the character in the magazine
            }
            charCounts[ch-'a']--; // use the character
        }
        return true;
    }
}