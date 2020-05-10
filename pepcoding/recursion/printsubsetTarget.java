import java.util.ArrayList;

public class printsubsetTarget {
    public static void main(String args[]) 
    {
        int arr[]={10,20,30,40,50,60,70};
        int target=70;
        int vidx=0;
        String set="";
        int sum=0;
        ArrayList<Integer>ans = new ArrayList<>();
        //printsubsetTarget(arr, target, vidx, set, sum);
        subsettargetArrayList(arr,target,vidx,ans,sum);

    }

    public static void printsubsetTarget(int arr[],int target,int vidx,String set,int sum)
    {
        //base case

        if(vidx==arr.length)
        {
            if(sum==target)
            {
                System.out.println(set);
               

            }
            return;
        }

        //similar to subeuqunces
        //when the element will not occur

        printsubsetTarget(arr, target, vidx+1, set, sum);

        //when the element will come

        printsubsetTarget(arr, target, vidx+1, set+" "+arr[vidx], sum+arr[vidx]);


    }

    ////////////////////with array list approach
    //string is inmmutable


    public static  void  subsettargetArrayList(int arr[],int tagret,int vidx,ArrayList<Integer>set,int sum)
    {

        //base case
        if(vidx==arr.length)
        {
            if(tagret==sum)
            {
                System.out.println(set);
            }
            return ;
        }
        //wihtout the occurence
        subsettargetArrayList(arr, tagret, vidx+1, set, sum);

        //inluciding

        set.add(arr[vidx]);
        subsettargetArrayList(arr, tagret, vidx+1, set, sum+arr[tagret]);
        set.remove(set.size()-1);



    }

}