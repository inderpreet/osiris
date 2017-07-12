package in.co.osiris.server;


public class Temperature {
    private int id;
    private float value;

    public Temperature(int id, float value){
        this.id = id;
        this.value = value;
    }

    public int getId(){
        return id;
    }

    public float getValue(){
        return value;
    }
}
