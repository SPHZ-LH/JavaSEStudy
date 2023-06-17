package Entity;
public class Scene {
    private String type;//使用类型，短信，上网，通话
    private int data;//使用手机数据，通话多少分钟，发送信息多少条，消耗流量多少MB
    private String description;//使用场景

    public Scene() {
    }

    public Scene(String type, int data, String description) {
        this.type = type;
        this.data = data;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
