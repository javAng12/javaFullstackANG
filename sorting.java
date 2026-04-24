public class sorting {
    // public static void bubble(int arr[]){
    //     for(int i =0;i<arr.length-1;i++){
    //         for(int j=0;j<arr.length-1-i;j++){
    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=arr[j];
    //             }
    //         }
    //     }
    // }
    public static void printarr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si<=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]= new int[ei-si+1];
        int i = si;
        int j = mid +1;
        int k =0;
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k++]=arr[i++];
        }
        while(j<=ei){
            arr[k++]=arr[j++];
        }
        for(k =0,i=si;k<=temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int arr[]={23,4,54,32,22};
        mergesort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
