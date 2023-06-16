package newCom.testDome.Dome14_链表1;

public class NodeManager {
    private Node root;//根节点
    private int currentIndex = 0; //节点的需要，每次操作从0开始


    public void add(int data){
        if (root==null){
            root = new Node(data);
        }else {
            root.addNode(data);
        }
    }
    public void del(int data){
        if (root == null)return;
        if(root.getData()==data){
            root = root.next;
        }else {
            root.delNode(data);
        }
    }
    public void print(){
        if(root!=null){
            System.out.print(root.getData()+"->");
            root.printNode();
            System.out.println("-----------");
        }
    }
    public boolean find(int data){
        if(root == null)return false;
        if (root.getData() == data){
            return true;
        }else {
            return root.findNode(data);
        }
    }
    public  boolean updata(int oldData,int newData){
        if (root == null)return false;
        if (root.getData() == oldData){
            root.setData(newData);
            return true;
        }else {
            return root.updataNode(oldData,newData);
        }
    }
    //向索引之前插入
    public void insert(int index,int data){
        if (index<0)return;
        currentIndex = 0;
        if (index == currentIndex){
            Node newNode = new Node(data);
            newNode.next = root;
            root = newNode;
        }else {
            root.insertNode(index,data);
        }
    }

    private class Node{
        private int data;
        private Node next;//把当前类型作为属性

        public Node(int data){
            this.data = data;
        }

        public void setData(int data){
            this.data = data;
        }
        public int getData(){
            return data;
        }
        //添加节点
        public void addNode(int data){
            if (this.next==null){
                this.next = new Node(data);
            }else {
                this.next.addNode(data);
            }
        }
        //删除节点
        public void delNode(int data){
            if(this.next != null){
                if (this.next.data == data){
                    this.next = this.next.next;
                }else {
                    this.next.delNode(data);
                }
            }
        }

        //输出所有节点
        public void printNode(){
            if (this.next!=null){
                System.out.print(this.next.data+"->");
                this.next.printNode();
            }
        }

        //查找节点是否存在
        public boolean findNode(int data){
            if (this.next == null){
                return false;
            }else {
                if (this.next.data == data){
                    return true;
                }else {
                    return this.findNode(data);
                }
            }

        }

        //修改节点
        public boolean updataNode(int olddData,int newData){
            if(this.next == null){
                return false;
            }
            if (this.next.data == olddData){
                this.next.data = newData;
                return true;
            }else {
                this.next.updataNode(olddData,newData);
            }
            return false;
        }

        //插入节点
        public void insertNode(int index,int data){
            currentIndex++;
            if (index == currentIndex){
                Node newNode = new Node(data);
                newNode.next = this.next;
                this.next = newNode;
            }else {
                this.next.insertNode(index,data);
            }
        }
    }
}
