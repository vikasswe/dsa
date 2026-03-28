package gfg;

public class SortZero {
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 0, 0, 3, 12};

        SortZero obj = new SortZero();
        int [] newArr = obj.pushZerosToEnd(arr);

        for (int i : newArr) {
            System.out.println(i + " ");
        }
    }

    int[] pushZerosToEnd(int[] arr) {
        int j= 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}


