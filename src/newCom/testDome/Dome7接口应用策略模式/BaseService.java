package newCom.testDome.Dome7接口应用策略模式;

abstract class BaseService {
    private ISave iSave;

    public ISave getiSave() {
        return iSave;
    }

    public void setiSave(ISave iSave) {
        this.iSave = iSave;
    }

    public void add(String data){
        System.out.println("检查数据合法性");
        iSave.save(data);
        System.out.println("数据保存完毕");
    }
}
