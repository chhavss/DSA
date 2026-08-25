class Solution {
public:
    int maxSubArray(vector<int>&nums) {
        int maxsum=INT_MIN;
        int cursum=0;
        for(int st=0;st<nums.size();st++){
            cursum+=nums[st];
            maxsum=max(cursum,maxsum);
            if(cursum<0){
                cursum=0;
            }
            
            

           
            
        }
        return maxsum;
    }
    
};