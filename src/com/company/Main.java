package com.company;


/*
class pairsum{

    void pair(int []a,int sum,int n){
        int low,high;
        low=a[0];
        high=a[n-1];
        while(low<high){
            if (low+high==sum){
                System.out.println(low+" "+high);
                low++;
                high++;

            }else if (low+high>sum){
                high--;
            }else low++;
        }

    }
    public static void main(String[] args) {

        pairsum InfoSum=new pairsum();
        int[] a={1,2,3,4,5,6,7};
        int n= a.length;
        int Sum=9;
        InfoSum.pair(a,Sum,n);


    }
}

 *//// pairsum two index value with same output

/*
public class TWO_pointer {
    public static void main(String[] args) {

        int [] a={1,5,6,7,8,2,3,4};
        int target=13;
        int i=0;
        int j=a.length-1;
       Array.sort(a);

        while (i < j){
            if (a[i] + a[j] == target)
                System.out.println(a[i]+""+a[j]+" = "+"target");

            if (a[i] + a[j] < target){

                i++;
            }
            else
                j--;
        }

    }
}

 */ //TWO_pointer

/*
class two_pointer_structured{

    // Two pointer technique based solution to find
    // if there is a pair in A[0..N-1] with a given sum.

    public static int code(int[] a, int N, int X) {

        int i = 0;
        int j = N - 1;

            // represents first pointer
        while (i < j){
            if (a[i] + a[j] == X)
                return (a[i] + a[j]);


              // If sum of elements at current
             // pointers is less, we move towards
            // higher values by doing i++

        if (a[i] + a[j] < X)
            i++;

            // If sum of elements at current
            // pointers is more, we move towards
            // lower values by doing j--
        else
            j--;
    }
        return 0;
        }

         // Driver code
    public static void main(String[] args) {
        int [] a ={ 3, 5, 9, 2, 8, 10, 11 };
        int target=17;
        int arrsize=a.length;
        System.out.println(code(a,arrsize,target));

    }
}

 */// two_pointer_structured

/*
class FindFourElements
{

    void find4Numbers(int A[], int n, int X)
    {
        int l, r;

        Arrays.sort(A);
        for (int i = 0; i < n - 3; i++)
        {
            for (int j = i + 1; j < n - 2; j++)
            {
                l = j + 1;
                r = n - 1;
                while (l < r)
                {
                    if (A[i] + A[j] + A[l] + A[r] == X)
                    {
                        System.out.println(A[i]+" "+A[j]+" "+A[l]+" "+A[r]);
                        l++;
                        r--;
                    }
                    else if (A[i] + A[j] + A[l] + A[r] < X)
                        l++;
                    else // A[i] + A[j] + A[l] + A[r] > X
                        r--;
                }
            } // end of inner for loop
        } // end of outer for loop
    }

    public static void main(String[] args)
    {
        FindFourElements findfour = new FindFourElements();
        int A[] = {1, 4, 45, 6, 10, 12};
        int n = A.length;
        int X = 21;
        findfour.find4Numbers(A, n, X);
    }
}

 */ //FindFourElements

/*
class kdiff{

    void sol(int[] a, int k, int n){


        HashMap<Integer,Integer> Uniquevalue=new HashMap();
        int count=0;
        for (int i: a){
            Uniquevalue.put(i,Uniquevalue.getOrDefault(i,0)+1);
        }
        for (int b:Uniquevalue.keySet()){
            if (k!=0){
                int d=b+k;
                if (Uniquevalue.containsKey(d))count++;
            }else
                if (Uniquevalue.get(a)>=2)count++;
        }
        System.out.println(count);

    }
    public static void main(String[] args) {

        kdiff diff=new kdiff();
        int[] a={1,3,1,4,5};
        int k=2;
        int n=a.length;
        diff.sol(a,k,n);

    }
}

 *///K Diff problem need to look once's (IMP)

/*
class Tripletes{
    private static boolean fun(int[] a,int sum) {
        for (int i=0;i<a.length;i++){
            int left=i+1,right=a.length-1;

            while (left<right){
                if (a[i]+a[left]+a[right]==sum){
                    System.out.println("found at index "+a[i]+", "+a[left]+", "+a[right]);
                    return true;
                }
                else if (a[i]+a[left]+a[right]<sum){
                    left++;
                }
                else //(a[i]+a[left]+a[right]>sum)
                    right--;
            }

        }
        return false;


    }
    public static void main(String[] args) {
        int []a={2,4,5,6,7,8,9,10,12,14,16};
        int sum=22;
        fun(a,sum);
    }


}

 *///find triplets



