import java.util.ArrayList;
import java.util.HashMap;
public class hash
{
    public static void main(String args[])
    {
        String str="jshfklkdhlgkjsalkhj";
        //hashMap_indexDisplay(str);
        //basic_duplicate_check();
        //frequency_alphabet(str);
        int[] a = { 3, 10, 3, 11, 4,  
            5, 6, 7, 8, 12 }; 
        LongestContinous_Length(a);

    }
    //index ka of the character in string
   

    public static void hashMap_indexDisplay(String str)
    {
        HashMap<Character,ArrayList<Integer>>map=new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            //first time character comes
            if(!map.containsKey(ch))
            {
                map.put(ch,new ArrayList<>());
                map.get(ch).add(i);

            }
            else
            {
                map.get(ch).add(i);
                
            }
        }


        for(Character ch:map.keySet())
        {
            System.out.println(ch +"->"+ map.get(ch));
        }

    }


    public static void basic_duplicate_check()
    {

        //ordering is not preserved and updation takes place
        HashMap<String,Integer>map=new HashMap<>();
        map.put("India",100);
        map.put("usa",200);

        map.put("Nepal",300);

        map.put("Austrailia",400);

        map.put("Nepal",500);
        map.put("INdia",100);

        System.out.println(map);


    }


    public static void frequency_alphabet(String str)
    {
        HashMap<Character,Integer>map=new HashMap<>();

//////////////////////using contains function
        /*(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else
            {
                map.put(ch,map.get(ch)+1);
            }
        
    
        }*/
        ////////////////////////////////////////

        //using getdeault function
       
        for(int i=0;i<str.length();i++)
        {
            char ch;
            ch=str.charAt(i);
         
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }




        for(Character ch:map.keySet())
        {
            System.out.println(ch+"->"+ map.get(ch));
        }
    }


    public static void LongestContinous_Length(int[] arr)
    {

        HashMap<Integer,Boolean>map=new HashMap<>();

        //1.marking all the elements at perfect start
        for(Integer ele:arr)
        {
            map.put(ele,true);

        }

        //2.check for the perfect start
        int size=-1;
        int number=-1;

        for(Integer key:map.keySet())
        {
            if(map.containsKey(key-1))
            {
                map.put(key,false);
            }
        }
        int smallsize=0;
        int num=0;
        //3.only for the elements which are true

        for(Integer keys:map.keySet())
        {
            //if it is true
                if(map.get(keys))
                {
                     smallsize=1;
                     num=keys+1;
                     while(map.containsKey(num))
                {
                    num++;
                    smallsize++;
                }
                if(smallsize>size)
                {
                    size=smallsize;
                    number=keys;
                }


                }

                

               
        }

        for( int i=number;i<size;i++)
        {
            System.out.println(number);
            number++;
            //num++;
        }

    
    }


}