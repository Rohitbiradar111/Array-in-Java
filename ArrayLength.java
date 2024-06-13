//This program shows how an array is written and 
//how we can get length of an array in Java

public class ArrayLength {
    public static void main(String args[])
    {
        //Example 1 -
        int a[] = {1,2,3,4,5,6};
        System.out.println(a.length);

        //Example 2 -
        int b[] = new int[5];
        b[0] = 10;
        b[1] = 2;
        b[2] = 36;
        b[3] = 0;
        b[4] = 9;
        System.out.println(b.length);

        //Example 3 -
        int arr[];
        arr = new int[4];
        arr[0] = 2;
        arr[1] = 7;
        arr[2] = 8;
        arr[3] = 6;
        System.out.println(arr.length);

        //Example 4 -
        int c[] = new int[3];
        int x = 10;
        for(int i=0;i<c.length;i++)
        {
            a[i] = x;
            x = x+10;
        }
        System.out.println(c.length);
    }
}