package Main;

public class laptop {

    private String name;                //�����ͺ�
    private double price;               //�۸�
    private String operatingsystem;     //����ϵͳ
    private String processor;           //������
    private String mainbord;            //����
    private String memory;              //�ڴ�
    private String harddisk;            //Ӳ��
    private String graphicscard;        //�Կ�
    private String displayer;           //��ʾ��
    private String producer;            //������
    private String country;             //����

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
            System.out.println("��");
        }
    }

    public void getlaptopname(double price1) {
        if (price < price1) {
            System.out.println(this.name);
        } else {
            System.out.println("��");
        }
    }

}
