import java.util.*;
class graphFirst
{
    public static void main(String args[])
    {
        public static ArrayList<ArrayList<Edge>>graph=new ArrayList<>();

        public static class Edge
        {
            int v=0;
            int w=0;
        }

         public static void constructGraph() {
        int n = 7;
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(0, 1, 10);
        addEdge(0, 3, 10);
        addEdge(1, 2, 10);
        addEdge(2, 3, 40);
        addEdge(3, 4, 2);
        addEdge(4, 5, 2);
        addEdge(4, 6, 3);
        addEdge(5, 6, 8);

        display();
        System.out.println();

    }



          public static void addEdge(int u,int v,int w)
          {
            if(u<0 || v< 0 || u>=graph.length || v>=graph.length){

            
            return;
            }
            graph.get(u).addEdge(new Edge(u,v));
             graph.get(v).addEdge(new Edge(v,u));
          }

           public static void display()
           {
                for(int i=0;i<graph.length;i++)
                {
                    System.out.print(i + " =>" );
                    for(int j=0;j<graph[i].size();j++)
                    {
                        System.out.print("("+graph[i].get(j).v + ", " + graph[i].get(j).w + "), ");
                    }   
                System.out.println();
            }
    }
    }
}