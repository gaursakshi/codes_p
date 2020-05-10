import java.util.ArrayList;

public class Heap
{
    private boolean isMax=false;
   private  ArrayList<Integer>arr;  //array is modified always


   //constructors  //for minheap
   public Heap()
   {
       this.arr=new ArrayList<>();
   }

//maxheap constructor
   public Heap(boolean isMax)
   {
       this.isMax=isMax;
       this.arr=new ArrayList<>();
       
     

   }


   public Heap(int []ar) //heap creation from array 0(n)
   {

    //fecting the value  and adding in arraylist  0(n)
       for(int ele:arr)
       {
           this.arr.add(ele);

       }

       //calling downHeapify to make it a array for lenth to 1  0(n)

       for(int i=arr.size()-1;i>=0;i--)  //sems tobe log  but its is o(n)
       {
           downHeapify(i);  ///logn
       }


       
   }
   
   // API.==============================================

   public void push(int val) {
    arr.add(val);
    upheapify(arr.size() - 1);
}

public void pop() {
    swap(0, arr.size() - 1);
    arr.remove(arr.size() - 1);
    downHeapify(0);
}

public int top() {
    return arr.get(0);
}

public void update(int idx, int val) {
    arr.set(idx, val);
    upheapify(idx);
    downHeapify(idx);
}

   
   //log n complexity move downwards parent to chld
   public void downHeapify(int idx)
   {
       int maxidx=idx;
       int lc=(2+idx)+1;
       int rc=(2+idx)+2;

       if(lc<arr.size() && arr.get(maxidx)<arr.get(lc) )
       {
           maxidx=lc;
       }

        if(rc<arr.size() && arr.get(maxidx)<arr.get(rc))
        {
            maxidx=rc;

        }

        if(maxidx!=idx)
        {
            swap(maxidx,idx);
            downHeapify(maxidx);
        }



   }

   //child to parent logn complexity

   public void upheapify(int  cidx)
   {
       int pi=(cidx-1)/2;

       //as parent index is always reduced it can also be zero 

       if(pi>=0 && arr.get(pi)<arr.get(cidx))
       {

        swap(pi,cidx);
           upheapify(pi);
       }


   }


   void swap(int x,int y)
   {

    //arraylist m get hota h  set hota h

        int val1=arr.get(x);
        int val2=arr.get(y);


        arr.set(x,val2);
        arr.set(y,val1);

   }




}