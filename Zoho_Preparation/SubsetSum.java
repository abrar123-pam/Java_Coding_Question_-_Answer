package Zoho_Preparation;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    public static void findSubsets(int[] nums,int target, int start, List<Integer> subset,List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList<>(subset));
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(nums[i] <= target){
                subset.add(nums[i]);
                findSubsets(nums,target-nums[i],i+1,subset,result);

                subset.remove(subset.size()-1);
            }
        }
    }
    public static List<List<Integer>> findSubset(int[] nums, int n){
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(nums,n,0,new ArrayList<>(),result);

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 8, 10};
        int N = 10;

        List<List<Integer>> res = findSubset(nums,N);

        for(List<Integer> sub : res){
            for(int i : sub){
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}

//                                                           (0, 6, [], {})
//                                                          /             \
//                                            (1, 5, [1], {})              (1, 6, [], {})
//                                            /             \             /             \
//                            (2, 4, [1, 2], {})  (2, 5, [1], {})  (2, 6, [], {})  (2, 6, [2], {})
//                                       /      \               |            |               |
//                        (3, 2, [1, 2, 3], {}) (3, 4, [1, 2], {}) |          (3, 6, [2, 3], {})
//                            /          |               |            |               |
//                (4, -1, [1, 2, 3, 4], {}) (4, 2, [1, 2, 4], {}) |          (4, 3, [2, 3, 4], {})
//                    |               |            |               |
//             (5, 0, [1, 2, 3, 5], {})       (5, 2, [1, 2, 5], {})   (5, 3, [2, 3, 5], {})
//                         |                             |                             |
//             (6, 0, [1, 2, 3, 4, 5], {})  (6, 2, [1, 2, 4, 5], {})   (6, 3, [2, 3, 4, 5], {})
