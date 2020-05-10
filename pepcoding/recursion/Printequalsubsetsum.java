import java.util.ArrayList;
public class Printequalsubsetsum {
    public static void main(String args[])
    {
        //int arr[]={1, 5, 11, 5};
        int arr[]={1,2};
        int vidx=0;
        String set1="";
        String set2="";
        int sum1=0,sum2=0;

        //Printequalsubsetsum(arr,vidx,set1,sum1,set2,sum2);

        //ArrayList<Integer>s1=new ArrayList<>();

        Printequalsubsetsum_02(arr,vidx,new ArrayList<>(),sum1,new ArrayList<>(),sum2);

    }


    public static void Printequalsubsetsum(int arr[],int vidx,String set1,int sum1,String set2,int sum2)
    {
        //every element in the set has 2 choices 
        //either come in First set or int the second set

        if(vidx==arr.length)
        {
            if(sum1==sum2)
            {
                System.out.println(set1 +" & "+set2);
            }
            return;
        }
        Printequalsubsetsum(arr, vidx+1, set1+" "+arr[vidx], sum1+arr[vidx], set2, sum2);


        Printequalsubsetsum(arr, vidx+1, set1, sum1, set2+" "+arr[vidx], sum2+arr[vidx]);
    } 



    ////////////////////using arrayList


    public static void Printequalsubsetsum_02(int arr[],int vidx,ArrayList<Integer> set1,int sum1,ArrayList<Integer> set2,int sum2)
    {
        //every element in the set has 2 choices 
        //either come in First set or int the second set

        if(vidx==arr.length)
        {
            if(sum1==sum2)
            {
                System.out.println(set1 +" & "+set2);
            }
            return;
        }
        set1.add(arr[vidx]);
        Printequalsubsetsum_02(arr, vidx+1, set1, sum1+arr[vidx], set2, sum2);
        set1.remove(set1.size()-1);

        set2.add(arr[vidx]);
        Printequalsubsetsum_02(arr, vidx+1, set1, sum1, set2, sum2+arr[vidx]);
        set2.remove(set2.size()-1);
    } 



}