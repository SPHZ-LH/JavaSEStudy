package Entity;
public class Scene {
    private String type;//ʹ�����ͣ����ţ�������ͨ��
    private int data;//ʹ���ֻ����ݣ�ͨ�����ٷ��ӣ�������Ϣ��������������������MB
    private String description;//ʹ�ó���

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
