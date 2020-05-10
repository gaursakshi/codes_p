import java.util.*;
public class huffman 
{
    private static HashMap<String,String>encode=new HashMap<>();
    private static HashMap<String,String>decode=new HashMap<>();


    public static void main(String args[])
    {
        huffman_tree("asdgvajdvmnasvcamnsvcasdaskmndbckasjbdcmanbscmsanbcmsnbcmsnbcmsnbcdmdsncmsbcmsnbcskgymnszdcvmzcvn");
        String str=encode_function("aaabcda");  
        System.out.println(str);
        System.out.println(decode_function(str));


    }
        public static  class Node implements Comparable<Node>
    {
        String data=" ";
        int freq=0;
        Node left=null;
        Node right=null;


        public Node(String data,int freq,Node left,Node right)
        {
            this.data=data;
            this.freq=freq;
            this.left=left;
            this.right=right;
        }

        @Override
        public int compareTo(Node other)//min priority queue
        {
            return this.freq-other.freq;
        }


    }

    public static void huffman_tree(String str)
    {

        //for character array 
        int []frequencyarr = new int[26];
        for(int i=0;i<str.length();i++)
        {
            frequencyarr[str.charAt(i)-'a']++;
        }



        PriorityQueue<Node>pq=new PriorityQueue<>();
        for(int i=0;i<frequencyarr.length;i++)
        {

            //if frequency is greater than zero push into PQ
            if(frequencyarr[i] > 0)
            {
                pq.add(new Node((char)(i+'a')+"", frequencyarr[i],null,null));
                
            }
        }

        //while priority queue size is 1
        while(pq.size()!=1)
        {
            Node first=pq.remove();
            Node second=pq.remove();
            //new node push 
            Node node=new Node(first.data+second.data,first.freq+second.freq,first,second); //data addinng is optional
            pq.add(node);
        
        }

        Node root=pq.poll();
        HuffmanTraversal(root,"");
    }

    private static  void HuffmanTraversal(Node root,String binarycode)
    {
        if(root.left==null && root.right==null )
        {
            encode.put(root.data,binarycode);
            decode.put(binarycode,root.data);

            return ;
        }
        HuffmanTraversal(root.left,binarycode+"0");
        HuffmanTraversal(root.right,binarycode+"1");


    }
    public static String encode_function(String str)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            
                
            String s=str.charAt(i)+"";
            sb.append(encode.get(s));  
         
        }
        return sb.toString();

    }

    public static String decode_function(String str)
    {
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(int j=1;j<=str.length();j++){
            String s=str.substring(i,j);
            if(decode.containsKey(s)){
                sb.append(decode.get(s));
                i=j;
            }
        }

        return sb.toString();



    }
}