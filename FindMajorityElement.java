class  FindMajorityElement{
public static int majorityElement(int[] nums) {

    int maj = nums[0];
    //initialize the first element as the majority element
    int count = 1;
    
    for(int i=1; i<nums.length; i++){
        if(count == 0){  
            //if count is 0 then the current element is the new majority
            maj = nums[i];
            count++;
        }
        else if(maj == nums[i])
            //if maj and current element is same then increment count
            count++;
        else count--;
            //else decrement count
    }        
    
    return maj;
    
}
    public static void main(String[] args)
    {
        int nums[]={1,2,1,1,1,2,1};
        System.out.println(FindMajorityElement.majorityElement(nums));
    }
}