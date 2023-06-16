package newCom.testDome.Dome14_链表1;

public class MainDome {
    public static void main(String[] args) {
        NodeManager nodeManager = new NodeManager();
        System.out.println("----------add----------");
        nodeManager.add(5);
        nodeManager.add(4);
        nodeManager.add(3);
        nodeManager.print();

        System.out.println("---------del----------");
        nodeManager.del(3);
        nodeManager.print();


        System.out.println("---------find----------");
        System.out.println(nodeManager.find(5));


        System.out.println("---------updata----------");
        nodeManager.updata(4,10);
        nodeManager.print();

        System.out.println("---------insert----------");
        nodeManager.insert(1,9);
        nodeManager.print();
    }
}
