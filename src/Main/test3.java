package Main;


import java.util.Scanner;

public class test3 {


    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = 3;
        //ͷ��㲻�洢����
        Node head = new Node();
        Node cur = head;
        //ѭ�������������
        for(int i=1;i<=m;i++){
            Node node = new Node(i);
            cur.next = node;
            cur = node;
        }
        //���������ݵĲ�����β�����γ�һ������
        cur.next = head.next;
        //ͳ�ƿ�ʼ��ʱ����ȥͷ��㣬Ȼ��ӵ�һ�������ݵĽ�㿪ʼ����
        Node p = head.next;
        //ѭ���˳������������ֻʣһ����㣬Ҳ�������������һ�������������
        while(p.next!=p){
            //���������ı����߼�
            for(int i=1;i<k-1;i++){
                p = p.next;
            }
            //������3��ʱ�򣬳���
            p.next = p.next.next;
            p = p.next;
        }
        //���ʣ�µ�һ�����
        System.out.println(p.data);


    }
}
class Node{
    int data;
    Node next;
    public Node(){}
    public Node(int data){this.data = data;}
}
