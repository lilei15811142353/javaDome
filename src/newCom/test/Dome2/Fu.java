package newCom.test.Dome2;

public class Fu {
    protected Dome[] dm = new Dome[3];
    protected int count = 0;

    public void add(Dome d){
        dm[count] = d;
        count++;
    }
}