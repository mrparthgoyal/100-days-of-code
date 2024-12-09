// day34
// 4 sum
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>list=new ArrayList<>();
        if(nums==null || nums.length<4)return list;

        Arrays.sort(nums); // sort the arrays to make the 2 pointer approach possible
        int n=nums.length;
        for(int i=0;i<n-3;i++)
        {
            // skip duplicates for the first number
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<n-2;j++)
            {
                // skip duplicates for the second number
                if(j>i+1 && nums[j]==nums[j-1])continue;
                int left=j+1,right=n-1;
                while(left<right)
                {
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target)
                    {
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        // skip duplicates for third and fourth number
                        while(left<right && nums[left]==nums[left-1])left++;
                        while(left<right && nums[left]==nums[right+1])right--;
                    }
                    else if(sum<target)left++;
                    else if(sum>target)right--;
                }
            }

        }
        return list;
    }
}

// zigzag conversion
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows)return s;

        StringBuilder[]rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            rows[i]=new StringBuilder();
        }
        int currentRow=0;
        boolean goingDown=false;
        for(char ch:s.toCharArray())
        {
            rows[currentRow].append(ch);
            // change direction when hitting top or bottom row
            if(currentRow==0 || currentRow==numRows-1)
            {
                goingDown=!goingDown;
            }
            currentRow+=goingDown?1:-1;
        }

        // cmobine all rows into a stringbuilder
        StringBuilder sb=new StringBuilder();
        for(StringBuilder row:rows)
        {
            sb.append(row);
        }
        return sb.toString();
    }
}