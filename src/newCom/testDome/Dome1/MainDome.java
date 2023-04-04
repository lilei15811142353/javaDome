package newCom.testDome.Dome1;


public class MainDome {
    public static void main(String[] args) {
        ImportCosmeticManager cm = new ImportCosmeticManager();
//        Cosmetic one = new Cosmetic("香奈儿","进口",'599');
        cm.add(new Cosmetic("香奈儿","进口",599));
        cm.add(new Cosmetic("圣罗兰","进口",499));
        cm.add(new Cosmetic("万紫千红","国产",15));
        cm.printInfo();
    }
}
