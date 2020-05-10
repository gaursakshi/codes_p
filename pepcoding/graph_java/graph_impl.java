import java.util.ArrayList;
import java.util.LinkedList;

public class graph_impl
{
   public  static class Edge
    {
        //int  u;
        int v;
        int w;
        
        Edge(int v,int w)
        {
            this.w=w;
            this.v=v;
        }
    }

   public static  ArrayList<ArrayList<Edge>>graph=new ArrayList<>();

    public  static  void addEdge(int u,int v,int w)
    { 
        //u is the index v arraylist k array

        //v denotes kr rha h arrayListt k andar  dono hi same h
        if(u<0 ||v<0 || u>=graph.size() || v>=graph.size())
        {
            return ;
        }

        // graph.get(u).add(new Edge(v,w));
        // graph.get(v).add(new Edge(u,w));

        //in case of directed graph comment  graph.get(v).add(new Edge(u,w));)

        graph.get(u).add(new Edge(v,w));

    }

    public static  void ConstructGraph()
    {

        //creating a new arraylist of size 8

        int n = 6;
		for (int i = 0; i < n; i++) {
			graph.add(new ArrayList<>());
		}

        // addEdge(0, 1, 10);
        // addEdge(0, 3, 10);
        // addEdge(1, 2, 10);
        // addEdge(2, 3, 40);
        // addEdge(3, 4, 2);
        // addEdge(4, 5, 2);
        // addEdge(4, 6, 3);
        // addEdge(5,6, 8);
        // addEdge(2,7,10); //for bfs
        // addEdge(2,8,10);//for bfs
        // addEdge(7,8,1);//for bfs
        //addEdge(7,3,0);
        // addEdge(2,5,8);
        // addEdge(0,6,2);

        ////////////////////////////////////////directed graph
        addEdge(1,0,10);
        addEdge(5,0,10);
        addEdge(5,3,10);
        addEdge(3,2,10);
        addEdge(2,4,10);
        addEdge(1,4,10);
        

    display();
    }


    public static void display() {

		for (int i = 0; i < graph.size(); i++) {

			System.out.print(i + "->" + " ");
			for (Edge e : graph.get(i)) {
				System.out.print("(" + e.v + "," + e.w + ")");
			}
			System.out.println();
		}
    }
    

    ///////////////DFS

    public static void DFS(int src,boolean[]visited)
    {

        //marking the source as visited
        visited[src]=true;

        //isme ek loop 

        for(Edge e:graph.get(src))
        {
            //if source neighbours are not visited
            if(!visited[e.v])
            {
                DFS(e.v, visited);
            }
        }
    }

    public static boolean ans=false;


    public static boolean HasPath(int src,int dest,boolean[]visited)
    {
        if(src==dest)
        {
            ans=true;
            return ans;
        }
        visited[src]=true;

        for(Edge e:graph.get(src))
        {
            if(!visited[e.v])
            {
                HasPath(e.v,dest, visited);
            }
        }
        return ans;
    }


    public static void AllPath(int src,int dest,boolean[]visited,String  ans,int weight)
    {

        if(src==dest)
        {
            System.out.println("path "+ ans +"   "+"@" +weight);
            return;
        }

        visited[src]=true;
        for(Edge e:graph.get(src))
        {
            if(!visited[e.v])
            {
                AllPath(e.v, dest, visited, ans+ " "+e.v,weight+e.w);
            }   
        }

        visited[src]=false;
    }

    //class for implementation of all solutions minimum wieght,maximum weight,ceil,and log 
    public static class Pair
    {
        int minweight;
        int maxweight;
        Pair()
        {
            this.minweight=Integer.MAX_VALUE;
            this.maxweight=Integer.MIN_VALUE;
        }

    }

    public static void allSolution(int src,int dest,int weight,String psf,boolean visited[], Pair p)
    {
        if(src==dest)
        {
            //finding the minimum weight
            if(p.minweight>weight)
            {
                p.minweight=weight;
                  
            }

            if(p.maxweight<weight)
            {
                p.maxweight=weight;
            }

            return ;

        }
        //similar to all Path
        visited[src]=true;
        for(Edge e:graph.get(src))
        {
            if(!visited[e.v])
            {
                allSolution(e.v, dest, weight+e.w, ans+ " "+e.v, visited, p);
            }
        }

        visited[src]=false;

    }

//////////////////////////PREORDER
public static void PREORDER(int src,boolean visited[],String ans)//similar to DFs
    { 
        visited[src]=true;
        System.out.println(ans);
        for(Edge e:graph.get(src))
        {
            if(!visited[e.v])
            {
                PREORDER(e.v, visited, ans+" "+e.v);
            }
        }
        visited[src]=false;

    }

    
    //////////////////////Hamiltonian Cycle and path

    public static void HamiltonianPath(int src,int orsrc,boolean []visited,int count,String ans)
    {

        if (count == graph.size() - 1) {
			boolean flag = false;
			for (Edge e : graph.get(src)) { // for detecting cycle
				if (e.v == orsrc) {
					System.out.println("Cycle: " + ans);
					flag = true;
				}
			}

			if (!flag) { // if not cycle then there is a path
				System.out.println("Path: " + ans);
			}
			return;
		}

        visited[src]=true;
        for(Edge e:graph.get(src))
        {
            if(!visited[e.v])
            {
                HamiltonianPath(e.v, orsrc, visited, count+1, ans+ " "+e.v );
            }
        }
        visited[src]=false;
    }


    //connected components
    public static int gcc() {
		int comp = 0;
		boolean[] visited = new boolean[graph.size()];
		for (int i = 0; i < graph.size(); i++) {
			if (!visited[i]) {
				comp++;
				DFS(i, visited);
			}
		}
		return comp;
    }


    //////////BFS

    public static  class pair1
    {
        int vtx;
        String psf;
        int level;
        
        pair1(int vtx,String psf,int level)
        {
            this.vtx=vtx;
            this.psf=psf;
            this.level=level;
        }
        

        pair1(int vtx,String psf)
        {
            this.vtx=vtx;
            this.psf=psf;
            
        }
        
    }

    //using null approach for cycle

    public static void  BFS01(int src,boolean []vis)
    {
        int level=0;
        int cycle=0;
        int destination=6;
        //queue in java is represented in LinkedList
        LinkedList<pair1>pq=new LinkedList<pair1>();

        pq.addLast(new pair1(src,"0"));
        pq.addLast(null);

        while(pq.size()!=1)
        {
           pair1 removeVertex=pq.removeFirst();
           if(vis[removeVertex.vtx]==true)
            {
                cycle++;
                System.out.println(cycle+"cycle found"+ removeVertex.vtx);
                continue;
                
            }

           if(destination==removeVertex.vtx)
           
            {  
                 System.out.println(level+"Destination "+removeVertex.psf);
               //continue;
           }

            
          
           vis[removeVertex.vtx]=true;

           for(Edge e:graph.get(removeVertex.vtx))
           {
               if(!vis[e.v]) //check neighbours of remove vertex
               {

                 pq.addLast(new pair1(e.v,removeVertex.psf+e.v));
               }
           }
           if(pq.getFirst()==null)
           {
               level++;
               pq.removeFirst();
               pq.addLast(null);
               
           }
   
        }


    }


    //level order traversal()
    public static void BFSLevelOrder(int src,boolean []visited)
    { 
        int level=0;
        int dest=6;
        int cycle=0;
        LinkedList<pair1>pq=new LinkedList<pair1>();

        pq.push(new pair1(src,""+0));
        
        while(pq.size()!=0)
        {
            int size=pq.size();
            while(size-- >0)
            {
                pair1 removevtx=pq.removeFirst();

                //cycle
                if(visited[removevtx.vtx]==true)
                {
                    System.out.println("cycle found at "+removevtx.psf);
                    continue;
                }

                if(dest==removevtx.vtx)
                {
                    System.out.println("destination found at"+removevtx.psf);
                }
                
                visited[removevtx.vtx]=true;

                 for(Edge e:graph.get(removevtx.vtx))
                {
                    if(!visited[e.v]) //check neighbours of remove vertex
                    {

                        pq.addLast(new pair1(e.v,removevtx.psf+e.v));
                    }
                }
           }
 
            level++;
        }
    }

    /////////////////////////////////////////////////////topological sort
    //topological sort helperfunction
   

    public static void topologicalsort(int src,boolean[]visited,ArrayList<Integer>ans)
    {
        //now similar to dfs
        visited[src]=true;

        for(Edge e:graph.get(src))
        {
            if(!visited[e.v])
            {
                topologicalsort(e.v, visited,ans);
            }

        }

        ans.add(src);
    }
    
public static void topological_sortHelper()
{
        boolean []visited=new boolean[graph.size()];
        ArrayList<Integer>ans=new ArrayList<>();

        for(int i=0;i<graph.size();i++)
        {
            if(!visited[i])
            {
                topologicalsort(i,visited,ans);
            }

        }

    
        for(int i=ans.size()-1;i>=0;i--)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
  /////////////////////////////kahn algorithm

  public static void kahnAlgo()
{
    //creating indegree array()
      int []indegree=new int[graph.size()];
      for(int i=0;i<graph.size();i++)
      {
        for(Edge e:graph.get(i))
          {
              indegree[e.v]++;
          }
      }
      LinkedList<Integer>que=new LinkedList<>();
      for(int i=0;i<indegree.length;i++)
      {
          if(indegree[i]==0)
          {
            System.out.println(i);
              que.addLast(i);
          }
      }

      ArrayList<Integer>ans=new ArrayList<>();
      while(que.size()!=0)
      {
          int size=que.size();
          while(size-->0)
          {
              int removevtx=que.removeFirst();
              ans.add(removevtx);
              for(Edge e:graph.get(removevtx))
              {
                  //predecrement
                indegree[e.v]--;
                  if(indegree[e.v]==0)
                  {
                  que.add(e.v);
                  }
                 
              }
          }
      }
      if(ans.size()!=graph.size())
      {
        System.out.println("Cycle"+ans);
      }
      else
      { 
          System.out.println(ans);
      }
}

public static void solve()
    {
        ConstructGraph();
        boolean visited[]=new boolean[graph.size()];

        //boolean result=HasPath(0, 6, visited);
        //System.out.println("path is  "+ result);

        //System.out.println("ALL PATH FUNCTION");
        String ans="";
        //AllPath(0, 6, visited, ans, 0);

    //     Pair p=new Pair();
    //     allSolution(0, 6, 0, "", visited, p);
    // System.out.println("The minimum weight path graph is "+p.minweight);
    // System.out.println("The maximum weight path graph is "+p.maxweight);

    //  String ans="";
    // PREORDER(0, visited, ans);

    //HamiltonianPath(0, 0, visited, 0, ans);


    int src=0;
    //BFS01(src,visited);
    //BFSLevelOrder(0,visited);

    //topological_sortHelper();

    kahnAlgo();


    }


//     public static int findEdge(int v1, int v2)
//     {
//         int vertex = 0;
//         for(Edge e:graph.get(v1))
//         {
            
//             if (e.v == v2)
//             {
//                 vertex=v;
//                 break;
//             }
//         }

//     return i;
// }



    public static void main(String args[])
    {
        solve();
    }
}