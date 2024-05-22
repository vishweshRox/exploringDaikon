public class BinarySearchOp {
    public BinarySearchOp() {}

    public static void loop_dummy1(int l, int r, int arr_length, int x){}
    public static void loop_dummy2(int l, int m, int r, int arr_length, int x){}

    public static int search(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {


            loop_dummy1(l, r, arr.length, x);


           int m = l + (r - l) / 2;


            loop_dummy2(l, m, r, arr.length, x);

            // Check if x is present at mid
         if (arr[m] == x) {

             loop_dummy2(l, m, r, arr.length, x);
             return m;}

            loop_dummy2(l, m, r, arr.length, x);
            // If x greater, ignore left half
            if (arr[m] < x) {

                loop_dummy2(l, m, r, arr.length, x);
                l = m + 1;

                loop_dummy2(l, m, r, arr.length, x);
            }

                // If x is smaller, ignore right half
            else {

                loop_dummy2(l, m, r, arr.length, x);
                r = m - 1;

                loop_dummy2(l, m, r, arr.length, x);
            }


            loop_dummy2(l, m, r, arr.length, x);
        }


        loop_dummy1(l, r, arr.length, x);


        // If we reach here, then element was
        // not present
       return -1;
    }

   // static int search(int arr[], int x){
       // return rSearch(arr,0, arr.length - 1, x);
  //  }
    //static int rSearch(int arr[], int l, int r, int x)
    //{
        // Restrict the boundary of right index
        // and the left index to prevent
        // overflow of indices
      //  if (r >= l && l <= arr.length - 1) {

        //    int mid = l + (r - l) / 2;

            // If the element is present
            // at the middle itself
          //  if (arr[mid] == x)
            //    return mid;

            // If element is smaller than mid, then it can
            // only be present in left subarray
           // if (arr[mid] > x)
             //   return rSearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
           // return rSearch(arr, mid + 1, r, x);
      //  }

        // We reach here when element is not present in
        // array
    //    return -1;
    //}

}
