class array_basics
{
    public static void main(String args[])
    {
        int n=5;
        int arr[]={1,3,2,5,3};


        //display_rec(arr,0);
        //display_reverse(arr, 0);
        //int result=max(arr,0);
        //System.out.println(result);
        //boolean result=find(arr,0,100);
       
         //int result=min(arr,0);
        
         int result=FirstIndex(arr, 0, 3);
          System.out.println(result);



    }


    public static void display_rec(int arr[],int vidx)
    {

        if(vidx==arr.length)
        {
            return ;
        }


        //exceptation
      
        System.out.println(arr[vidx]);
        //faith 
        display_rec(arr,vidx+1);

    }


    public static void display_reverse(int arr[],int vidx)
    {
        //base
        if(vidx==arr.length)
        {
            return;
        }


        display_reverse(arr, vidx+1);
        System.out.println(arr[vidx]);
     
    }
    public static int max(int arr[],int vidx)
    {

        if(vidx==arr.length-1)
        {
            return arr[vidx];

        }
        //faith
        int ele=max(arr,vidx+1);

        if(ele>arr[vidx])
        {
            return ele;
        }
        else
        {
            return arr[vidx];
        }

        
    }


    public static  boolean find(int arr[],int vidx,int ele)
    {

        
        if(arr.length==vidx) //for size last index
        {
            return false;
        }
       
            boolean result=find(arr,vidx+1,ele);
            if(result==true)
            {
                return true;
            }

            else
            {
                if(arr[vidx]==ele)
                {
                    return true;
                }
                else
                {
                    return false;

                }
            }
            
        }


        public static int min(int arr[],int vidx)
        {

            if(vidx==arr.length-1)
            {
                return arr[vidx];

            }
            //faith
            int res=min(arr,vidx+1);

            if(arr[vidx]<res)
            {
                return arr[vidx];
                
            }

            else
            {
                return res;
            }
        }

        public static int FirstIndex(int ar[],int vidx,int ele)
        {

            if(ar.length==vidx)
            {
                return -1;
            }
            //faith
            if(ele==ar[vidx])
            {
                return vidx;
            }
            else
            {
                int result=FirstIndex(ar, vidx+1, ele);
                return result;
                
                
                
            }
        }


        public static int LASTIndex(int ar[],int vidx,int ele)
        {

            if(ar.length==vidx)
            {
                return -1;
            }
            //faith
           
                int result=LASTIndex(ar, vidx+1, ele);

                if(result==-1)
                {
                    if(ar[vidx]==ele)
                    {
                       return vidx;
                    }
                    
                }

                else
                {
                     return result;
                }
                
                
                
            }
        





        
    }

    



