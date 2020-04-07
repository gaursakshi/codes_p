public  class towerOfhanoi
{
    public static void main(String args[])
    {
        String source="A";
        String destination="C";
        String helper="B";
        int no_discs=3;
        towerOfhanoi(source, destination, helper, no_discs);

    }

    public static void towerOfhanoi(String source,String destination,String helper,int no_discs)
    {

        if(no_discs==0)
        {
            return;
        }
        towerOfhanoi(source, helper, destination, no_discs-1);
        System.out.println("Move "+no_discs+  " from " + source +" to  "+destination);
        towerOfhanoi(helper,destination,source,no_discs-1);

    to

    } 
}