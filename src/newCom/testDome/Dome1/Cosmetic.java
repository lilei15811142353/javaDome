package newCom.testDome.Dome1;

public class Cosmetic {
    private  String name;//品牌
    private String type;//进口或国产
    private int price;//价格

    public Cosmetic() {
    }

    public Cosmetic(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo(){
        String msg = "name" + name + ",type=" + type + ",price=" + price;
        return msg;
    }
}
