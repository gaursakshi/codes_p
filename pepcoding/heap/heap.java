import java.util.ArrayList;
public class heap {
    private ArrayList<Integer> arr;
    boolean isMax = false;

    public heap() 
    {
        this.arr = new ArrayList<>();
    }

    public heap (boolean isMax)
    {
        this.arr=new ArrayList<>();
        this.isMax=isMax;
    }

    public int size()
    {
        return arr.size();
    }


    public void createHeap(int[]ar)
    {
        this.arr = new ArrayList<>();
        for (int ele : ar)
            this.arr.add(ele);
       
        for (int i = arr.size() - 1; i >= 0; i--) { // seen to be nlogn, but it is o(n)
            downheapify(i);   //logn
        }
    }

    public heap(int[] ar,boolean isMax) 
    { // heap creation from array O(n)

        this.isMax=isMax;
        createHeap(ar);
       
    }


    public heap(int[]ar)
    {
        
        createHeap(ar);
    }

    // API.==============================================

    public void push(int val) {
        arr.add(val);
        upheapify(arr.size() - 1);
    }

    public void pop() {
        swap(0, arr.size() - 1);
        arr.remove(arr.size() - 1);
        downheapify(0);
    }

    public int top() {
        return arr.get(0);
    }

    public void update(int idx, int val) {
        arr.set(idx, val);
        upheapify(idx);
        downheapify(idx);
    }

    // util.==============================================

    public void upheapify(int cidx) { // logn
        int pi = (cidx - 1) / 2;
        if (pi >= 0 && compare((pi), (cidx))>0) {
            swap(pi, cidx);
            upheapify(pi);
        }
    }

    public void downheapify(int idx) 
    { // logn
        int maxidx = idx;
        int lci = 2 * idx + 1;
        int rci = 2 * idx + 2;

        if (lci < arr.size() && compare(lci, (maxidx))>0) {
            maxidx = lci;
        }

        if (rci < arr.size() && compare(rci, maxidx)>0) {
            maxidx = rci;
        }

        if (maxidx != idx) {
            swap(maxidx, idx);
            downheapify(maxidx);
        }

    }

    


    public int compare(int child, int parent)
     {
        if (isMax) {
            return (arr.get(child )- arr.get(parent));
        } else {
            return (arr.get(parent )- arr.get(child));
        }
    }


    public void swap(int i, int j) {
        int val1 = arr.get(i);
        int val2 = arr.get(j);

        arr.set(i, val2);
        arr.set(j, val1);
    }

    

}