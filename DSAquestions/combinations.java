package DSAquestions;
import java.util.*;
class combinations {


    public static void recursive(int[] can, int target,List<List<Integer>> list, ArrayList<Integer> temp,int sum, int i){

        if(i == can.length){
            return;
        }

        if(sum == target){
            list.add( new ArrayList<>(temp));
        }

        if(sum > target){

            return;
        }
        temp.add(can[i]);
        System.out.println(temp);
        recursive(can,target,list,temp, sum += can[i], i);
        System.out.println(sum);
        temp.remove(temp.size()-1);
        recursive(can,target,list,temp, sum -= can[i], i+1);
    }

    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();

        recursive(candidates,target,list,new ArrayList<>(),0,0);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};

        List<List<Integer>>  ans =  combinationSum(arr,7);
        System.out.println(ans);
    }
}
