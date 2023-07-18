package 分块查找;

public class BlockSerachDeam2 {
    public static void main(String[] args) {
        int[] arr = { 27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48 };

        int number = 27;
        Block b1 = new Block(22, 40, 0, 4);
        Block b2 = new Block(13, 20, 5, 8);
        Block b3 = new Block(7, 10, 9, 10);
        Block b4 = new Block(43, 50, 11, 13);

        Block[] blocks = { b1, b2, b3, b4 };
        int arrindex = getIndex(blocks, arr, number);
        System.out.println(arrindex);
    }

    private static int getIndex(Block[] blocks, int[] arr, int number) {
        int index = getBlocksIndex(blocks, number);
        if (index < 0) {
            return -1;
        }
        int startIndex = blocks[index].getStartIndex();
        int endIndex = blocks[index].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    private static int getBlocksIndex(Block[] blocks, int number) {
        for (int i = 0; i < blocks.length; i++) {
            int min = blocks[i].getMin();
            int max = blocks[i].getMax();
            if (min <= number && number <= max) {
                return i;
            }
        }
        return -1;
    }
}

class Block {
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
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
