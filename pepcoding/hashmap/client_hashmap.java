import java.util.ArrayList;
import java.util.HashMap;

public class client_hashmap
{
    public static void main(String args[])
    {
        ArrayList<Integer>str=new ArrayList<>();
       // String str="abc";
        //System.out.println(str.hashCode());

        //HashMap<Integer,Integer>map=new HashMap<>();
       // System.out.println(map.hashCode());
       // System.out.println(map);
        


        //map.put(10,0);
        //System.out.println(map.hashCode());

        //System.out.println(map);
        hashmap_implementation hm= new hashmap_implementation();
        hm.putKey(20,30);
        hm.putKey(40,30);
        System.out.println(hm);




    }
}