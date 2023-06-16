// given a target and an array we need to find the number that will sum up to the target number
import java.util.HashMap;

class code{
    public static void main(String[] args) {
        int[] arr = {3,5,-3,2,6,12,3};
        int target = 0;

        int[] result = twoSum(arr, target);

        if (result != null){
            System.out.println("The result is "+result[0]+ " and "+ result[1]);
        }else{
            System.out.println("Number were not found !");
        }
    }
    static int[] twoSum(int[] arr ,int target){
        HashMap<Integer,Integer> hashMap = new HashMap<>(); // creating a hash table
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i]; // we need to find y so x + y = target , y = target - x
            if (hashMap.containsKey(complement)) {
                int[] result = {arr[i], complement};
                return result;
            }
            hashMap.put(arr[i], i);
        }

        return null;
    }
}