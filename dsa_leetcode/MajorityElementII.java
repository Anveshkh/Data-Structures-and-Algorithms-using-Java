package dsa_leetcode;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {5, 7, 4, 7, 4, 4, 5, 4, 4, 7, 4, 4};
        int ans = findMajorityElement(arr, arr.length);
        System.out.println(ans);
    }

    static int findMajorityElement(int[] arr, int size){
        int candidate = arr[0];
        int count = 1;

        for(int i = 1; i<size; i++){
            if(arr[i] == candidate){
                count++;
            }
            else{
                count = count - 1;
            }

            if(count == 0){
                candidate = arr[i];
                count = 1;
            }
        }

        // verify if candidate is our answer or not
        count = 0;
        for(int i = 0; i<size; i++){
            if(arr[i] == candidate){
                count++;
            }
        }
        if(count > size/2){
            return candidate;
        }else{
            return -1;
        }
    }
}
