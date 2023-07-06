import java.util.Arrays;

class LocalMinima {
    public static void main(String[] args) {
        int[] arr = {-4, -2, -1, 5, 3, 6, 7, 9};
        int x = findLocalMininum(arr);
        if(x!=-1){
            System.out.println("The local Minimum value is" +x);
        } else{
            System.out.println("There are no local Minimum values");
        }
    }

public static int findLocalMininum(int[] arr){
    for(int i = 1; i<arr.length-1;i++){
        if(arr[i] < arr[i-1] && arr[i] < arr[i+1]){
            return arr[i];
        }
    }
    return -1;
}
}
