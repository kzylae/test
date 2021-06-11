package Main;

public class laptop {

    private String name;                //电脑型号
    private double price;               //价格
    private String operatingsystem;     //操作系统
    private String processor;           //处理器
    private String mainbord;            //主板
    private String memory;              //内存
    private String harddisk;            //硬盘
    private String graphicscard;        //显卡
    private String displayer;           //显示器
    private String producer;            //生产商
    private String country;             //产地

    public laptop() {
    }

    public laptop(String name, double price, String operatingsystem, String processor, String mainbord, String memory,
                  String harddisk, String graphicscard, String displayer, String producer, String country) {
        this.name = name;
        this.price = price;
        this.operatingsystem = operatingsystem;
        this.processor = processor;
        this.mainbord = mainbord;
        this.memory = memory;
        this.harddisk = harddisk;
        this.graphicscard = graphicscard;
        this.displayer = displayer;
        this.producer = producer;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOperatingsystem() {
        return operatingsystem;
    }

    public void setOperatingsystem(String operatingsystem) {
        this.operatingsystem = operatingsystem;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMainbord() {
        return mainbord;
    }

    public void setMainbord(String mainbord) {
        this.mainbord = mainbord;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }

    public String getGraphicscard() {
        return graphicscard;
    }

    public void setGraphicscard(String graphicscard) {
        this.graphicscard = graphicscard;
    }

    public String getDisplayer() {
        return displayer;
    }

    public void setDisplayer(String displayer) {
        this.displayer = displayer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return "laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", operatingsystem='" + operatingsystem + '\'' +
                ", processor='" + processor + '\'' +
                ", mainbord='" + mainbord + '\'' +
                ", memory='" + memory + '\'' +
                ", harddisk='" + harddisk + '\'' +
                ", graphicscard='" + graphicscard + '\'' +
                ", displayer='" + displayer + '\'' +
                ", producer='" + producer + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public void getlaptopname(String producer1) {

        if (producer.equals(producer1)) {
            System.out.println(this.name);
        } else {
            System.out.println("否");
        }
    }

    public void getlaptopname(double price1) {
        if (price < price1) {
            System.out.println(this.name);
        } else {
            System.out.println("否");
        }
    }

}
