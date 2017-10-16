class BinarySearch 
{
    static int search(int[] a, int l, int r, int x)
    {
        int mid  = l + (r-l)/2;
        while(l<=r)
        {
            if(a[mid] == x)
                return x;

            else if(a[mid] < x)
                return search(a, mid+1, r, x);
            
            return search(a, l, mid-1, x);
        }
        // element not found
        return -1;
    }

    public static void main(String agrs []){
        int[] test = {1,2,3,4,5,6};
        int l = 0;
        int r = test.length - 1;
        System.out.print(search(test,l,r,3));
    }
}