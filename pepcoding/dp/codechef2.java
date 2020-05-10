import java.util.Collections;
import java.util.PriorityQueue;

public class codechef2
{
    public static void main(String args[])
    {
        int arr[]={6,6,6};
        //int arr[]={0,1,0};
        System.out.println(solve(arr));
    }

    public  static int solve(int arr[])
    {
        int profit=0,counter=0;
        PriorityQueue <Integer>pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }

        while(pq.size()>0)
        {
            if(pq.peek()!=0)
            {
                int x=pq.poll();
                
                profit+=x-counter;
                counter++;
            }
            else
            {
                break;
            }

        }
        return profit;

    }
}