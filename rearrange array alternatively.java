
class Solution {

    // temp: input array
    // n: size of array
    // Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[]) {

        Arrays.sort(arr);
        int[] a=new int[arr.length];
        int k=0;
        int l=0;
        int r=arr.length-1;
        while(k<arr.length&&l<=r){
            a[k++]=arr[r--];
            if(l<=r){
            a[k++]=arr[l++];
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=a[i];
        }
    }
}