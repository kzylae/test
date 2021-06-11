package Main;


import java.util.Scanner;

public class test3 {


    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = 3;
        //头结点不存储数据
        Node head = new Node();
        Node cur = head;
        //循环构造这个链表
        for(int i=1;i<=m;i++){
            Node node = new Node(i);
            cur.next = node;
            cur = node;
        }
        //链表有数据的部分首尾相连形成一个环。
        cur.next = head.next;
        //统计开始的时候，刨去头结点，然后从第一个有数据的结点开始报数
        Node p = head.next;
        //循环退出的条件是最后只剩一个结点，也就是这个结点的下一个结点是它本身
        while(p.next!=p){
            //正常报数的遍历逻辑
            for(int i=1;i<k-1;i++){
                p = p.next;
            }
            //当数到3的时候，出局
            p.next = p.next.next;
            p = p.next;
        }
        //最后剩下的一个结点
        System.out.println(p.data);


    }
}
class Node{
    int data;
    Node next;
    public Node(){}
    public Node(int data){this.data = data;}
}
