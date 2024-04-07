import java.util.HashMap;

public class TestSum{
    public static void main(String[] args) {
    
        int[] arr ={11,3,7,9,14,2};
        int[] output = new int[2];
        int target =17;
        HashMap<Integer, Integer> hashMap= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int sno =target-arr[1];
                if(hashMap.containsKey(sno)){
                    output[0]=hashMap.get(sno);
                    output[1]=i;
                    break;
                }
            hashMap.put(arr[i], i);
        }

        System.out.println(output[0]+" "+output[1]);
    }
}