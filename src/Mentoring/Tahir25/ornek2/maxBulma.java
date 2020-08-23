package Mentoring.Tahir25.ornek2;

public class maxBulma {
    public int MaxNumberArray(int[] arr){
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
}
