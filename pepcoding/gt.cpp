#include <iostream>
#include <vector>
#include <stack>

using namespace std;

class Node
{
public:
    int data = 0;
    vector<Node *> childs;
    Node()
    {
    }

    Node(int data)
    {
        this->data = data;
    }
};

Node *createTree(vector<int> &arr)
{
    stack<Node *> st;
    for (int i = 0; i < arr.size() - 1; i++)
    {
        if (arr[i] != -1)
        {
            Node *node = new Node(arr[i]);
            st.push(node);
        }
        else
        {
            Node *node = st.top();
            st.pop();
            st.top()->childs.push_back(node);
        }
    }

    return st.top();
}

void display(Node *node)
{

    cout << node->data << " -> ";
    for (Node *child : node->childs)
    {
        cout << child->data << ", ";
    }
    cout << endl;

    for (Node *child : node->childs)
    {
        display(child);
    }
}

int size(Node *node)
{
    int sz = 0;
    for (Node *child : node->childs)
    {
        sz += size(child);
    }
    return sz + 1;
}

int height(Node *node)
{
    int h = -1;
    for (Node *child : node->childs)
    {
        h = max(h, height(child));
    }
    return h + 1;
}

int maximum(Node *node)
{
    int maxdata = node->data;
    for (Node *child : node->childs)
    {
        maxdata = max(maxdata, maximum(child));
    }
    return maxdata;
}

bool find(Node *node,int data)
{
    bool res = false;
    if (node->data == data)
        return true;

    for (Node *child : node->childs)
    {
        res = res || find(child,data);
    }
    return res;
}

Node *getTail(Node *node)
{
    if (node->childs.size() == 0)
        return node;

    return getTail(node->childs[0]);
}





void linearTree(Node *node)
{

    for (Node *child : node->childs)
    {
        linearTree(child);
    }

    for (int i = node->childs.size() - 2; i >= 0; i--)
    {
        Node *tail = getTail(node->childs[i]);
        tail->childs.push_back(node->childs[i + 1]);

        node->childs.pop_back();
    }
}


Node *linearise_02(Node *node)
{
    if(node->childs.size()==0)
    {
        return node;
    }

    Node *mytail=linearise_02(node->childs[node->childs.size()-1]);//node ->childs[node->child.back]

    for(int i=node->childs.size()-2;i>=0;i--)
    {
        Node *tail=linearise_02(node->childs[i]);
        tail->childs.push_back(node->childs.back());//for adding 
        node->childs.pop_back();
    }
    return mytail;

}

bool mirrorise_2tree(Node *node1,Node *node2)
{
    int i,j;
    if(node1->childs.size()!=node2->childs.size() || node1->data!=node2->data);
    {
    return false;
    }


    for(i =0,j=node2->childs.size()-1;i<node1->childs.size() && j>=0;i++,j--)
    {
        Node *child1=node1->childs[i];
        Node *child2=node2->childs[j];
        if(!mirrorise_2tree(child1,child2))
        {
            return false;
        }


    }
    return true;
}


void Removeleaf(Node * node)
{
    vector<Node*>newchilds;
    for(Node *child:node->childs)
    {
        newchilds.push_back(child);
        
    }

    node->childs=newchilds;
    for(Node *child:node->childs)
    {
        Removeleaf(child);
    }


}


void solve()
{
    vector<int> arr{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 100, -1, 110, -1, -1, 90, -1, -1, 40, -1, -1};
    //tree ko utla daalengevector<int> arr1{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 100, -1, 110, -1, -1, 90, -1, -1, 40,130,-1,120,-1,-1,-1};
    Node *node = createTree(arr);
    //Node *node1=createTree(arr1);
    //linearTree(node);

    //linearise_02(node);
    //mirrorise_2tree(node,node1);
    //cout<<mirrorise_2tree(node,node1);
    Removeleaf(node);
    display(node);
}

int main()
{
    solve();
    return 0;
}