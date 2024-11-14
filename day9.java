// day9
// search in a 2d matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int s=0;
        int e=row*col-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            int midRow=mid/col;
            int midCol=mid%col;
            if(matrix[midRow][midCol]==target)return true;
            else if(matrix[midRow][midCol]<target)s=mid+1;
            else e=mid-1;
        }
        return false;
    }
}

// find all the numbers disappeared in array
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        List<Integer>list=new ArrayList<>();
        for(int num:nums)
        {
            set.add(num);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!set.contains(i))list.add(i);
        }
    return list;
    }
}
