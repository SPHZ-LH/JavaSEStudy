public class goodsTest {
    public static void main(String[] args) {
        goods g1 = new goods("001", "华为手机", 5999, 100);
        goods g2 = new goods("002", "保温杯", 22, 500);
        goods g3 = new goods("003", "枸杞", 11, 50);

        goods[] arr = new goods[3];
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            goods g=arr[i];
            System.out.println(g.getId() + g.getName() + g.getPrice() + g.getInventory());
        }
    }
}
