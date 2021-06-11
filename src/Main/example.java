package Main;

public class example {

    public static void main(String[] args){


        laptop l2 = new laptop("华硕 GL552VW 笔记本电脑",6000.00,"Windows 10 64位 ( DirectX 12 )","英特尔 Core i7-6700HQ @ 2.60GHz 四核",
                "华硕 GL552VW ( 100 Series/C230 Series 芯片组 Family - A14E )","8 GB ( 海力士 DDR4 2133MHz )","三星 MZNLF128HCHP-00004 ( 128 GB / 固态硬盘 )",
                "Nvidia GeForce GTX 960M ( 4 GB / 华硕 )","友达 AUO38ED ( 15.5 英寸  )","华硕电脑有限股份公司","中国");

        l2.getlaptopname("华硕电脑有限股份公司");
        l2.getlaptopname(7000.00);
    }
}
