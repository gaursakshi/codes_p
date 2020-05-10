import java.util.LinkedList;
public class hashmap_implementation<K,V>
{
    hashmap_implementation()
    {
        for(int i=0;i<buckets.length;i++)
        {
            buckets[i]=new LinkedList<Node>();
        }
    }

    public class Node
    {
        int key;
        int value;

        public Node(K key,V value)
        {
            this.key=key;
            this.value=value;


        }

        @Override
        public String toString() {
            return this.key + "=" + this.value;
        }
    }


       int size=0;
        private LinkedList<Node>[]buckets=new LinkedList[10]; 



        @Override
        public String toString() 
        {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for (int i = 0; i < buckets.length; i++) 
            {
                if (buckets[i].size() > 0)
                 {
                    int size = buckets[i].size();
                    LinkedList<Node> group = buckets[i];
                    while (size-- > 0)
                     {
                        Node node = group.getFirst();
                        sb.append(node.toString() + ", ");
                        group.addLast(group.removeFirst());
                    }
                }
                
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("}");
            return sb.toString();
        }
        //specify  gp h
        public int MyGroup(K key)
        {
           
            return MyHashCode(key)%buckets.length;

        }



        public int MyHashCode(K key)
        {
            Integer val=key.hashCode();
            return Math.abs(val);
        }



         private  Integer get(K key) {
            int code = MyGroup(key);
            LinkedList<Node> group = buckets[code];
    
            Node rn = foundInGroup(group, key);
            return rn == null?null:rn.value;
    
        }
        private Node foundInGroup(LinkedList<Node> group,K key)
         {
            Node rn = null;
            int size = group.size();
            while (size-- > 0) {
{
                Node tnode = group.getFirst();
                if (tnode.key == key) {
                    rn = tnode;
                    break;
                }
    
                group.addLast(group.removeFirst());
            }
            return rn;
        }


        public Node remove(K key)throws Exception
        {
            int code = MyGroup(key);
            LinkedList<Node> group = buckets[code];
            Node rn = foundInGroup(group, key);

            if(rn!=null)
            {
                this.size--;
                return group.removeFirst();
            }
            else
            {
                throw new Exception("ElementNotFound: -1");
            }
        }



        void putKey(K key,V value)
        {
            int code = MyGroup(key);
            LinkedList<Node> group = buckets[code];

            Node rn = foundInGroup(group, key);
            if(rn!=null)
            {
                rn.value=value;
            }
            else
            {
                Node newnode=new Node(key,value);
                group.addFirst(newnode);
                this.size++;

            }

            //ek groop m kitne log aayenge
            double lambda=group.size()*1.0/buckets.length;
            if(lambda>0.3)
            {
                rehash();
            }
        


        }

        
    public boolean containsKey(K key)
     {
        int code = MyHashCode(key);
        LinkedList<Node> group = buckets[code];

        Node rn = foundInGroup(group, key);
        return rn != null ? true : false;

    }


    public void rehash()
     {
        LinkedList<Node>[] oldBuckets = buckets;
        buckets = new LinkedList[buckets.length * 2];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }

        for (int i = 0; i < oldBuckets.length; i++) {
            if (oldBuckets[i].size() > 0) {
                int size = oldBuckets[i].size();
                LinkedList<Node> group = oldBuckets[i];
                while (size-- > 0) {
                    Node tnode = group.removeFirst();
                    put(tnode.key, tnode.val);
                }
            }
        }
    }
    public  ArrayList<Integer>keySet()
    {
        ArrayList<Integer>keys=new ArrayList<>();


        for(int i=0;i<buckets.length;i++)
        {
            if(buckets[i].size()>0)
            {
                int size=buckets[i].size();

                LinkedList<Node>group=buckets[i];
                while(size-->0)
                {
                    Node tempnode=group.getFirst();
                    keys.add(tempnode.key);
                    group.addLast(group.removeFirst());
                }

            }

        }
        return keys;

    }






}
        

    

