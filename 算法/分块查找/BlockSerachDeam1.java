package 分块查找;

public class BlockSerachDeam1 {
    public static void main(String[] args) {
        int[] arr = { 16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66 };

        int numSerach = 5;
        Blcok b1 = new Blcok(21, 0, 5);
        Blcok b2 = new Blcok(45, 6, 11);
        Blcok b3 = new Blcok(73, 12, 17);

        Blcok[] blcok = { b1, b2, b3 };

        int arrIndex = Search(blcok, arr, numSerach);
        System.out.println(arrIndex);
    }

    private static int Search(Blcok[] blcok, int[] arr, int numSerach) {
        int index = getIndex(blcok, numSerach);
        if (index < 0) {
            return -1;
        }
        int start = blcok[index].getStartIndex();
        int end = blcok[index].getEndIndex();
        for (int i = start; i <= end; i++) {
            if (arr[i] == numSerach) {
                return i;
            }
        }
        return -1;
    }

    private static int getIndex(Blcok[] blcok, int numSerach) {
        for (int i = 0; i < blcok.length; i++) {
            int max = blcok[i].getMax();
            if (max >= numSerach) {
                return i;
            }
        }
        return -1;
    }
}

class Blcok {
    private int max;
    private int startIndex;
    private int endIndex;

    public Blcok() {
    }

    public Blcok(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

}
