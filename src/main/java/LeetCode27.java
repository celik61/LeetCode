import java.util.*;

public class LeetCode27 {
    //https://leetcode.com/problems/remove-element/
    public int removeElement(int[] nums, int val) {

        List<Integer> list= new ArrayList<>();

        for(int i=0; i<nums.length;i++){
            list.add(nums[i]);
        }


        Iterator<Integer> it= list.iterator();

        while(it.hasNext()){
            if(it.next()==val){
                it.remove();
            }
        }
        for(int i=0; i<list.size();i++){
            nums[i]=list.get(i);
        }
        return list.size();
    }

}
