import org.example.App;
public class Main {
    public static void main(String[] args) {

        int [] arr={88,99,22,44,66};

     QuickSort (arr,0,arr.length-1);

        for (int num :arr){
            System.out.println(num+"");
        }
    }
   public static void QuickSort(int[] arr, int start, int end) {
        if (end>start);


        int pivate= partition(arr,start,end);
    }

    public static int  partition(int[] arr, int start, int end){
        return start;

    }

}





