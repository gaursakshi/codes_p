import java.util.Stack;

public class nextgreater
{
    public static void nextgreaterElementRight(int []arr)
    {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            //stack size is empty for continue
            if(st.size()==0)
            {
                st.push(arr[i]);
                continue;
            }

            while(st.size()!=0 && st.peek()<arr[i])
            {
                System.out.println(st.pop()+" ->"+arr[i]);

            }

            st.push(arr[i]);
        }

            while(st.size()!=0)
            {
                System.out.println(st.pop()+" not element ");
            }

    
    }



    public static void nextgreaterElementLEft(int []arr)
    {
        Stack<Integer>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            //stack size is empty for continue
            if(st.size()==0)
            {
                st.push(arr[i]);
                continue;
            }

            while(st.size()!=0 && st.peek()<arr[i])
            {
                System.out.println(st.pop()+" ->"+arr[i]);

            }

            st.push(arr[i]);
        }

            while(st.size()!=0)
            {
                System.out.println(st.pop()+" not element ");
            }

    
    }




    public static void main(String args[])
    {
        int arr[]={4,5,2,25};
        nextgreaterElementRight(arr);
        nextgreaterElementLEft(arr);
    }


}