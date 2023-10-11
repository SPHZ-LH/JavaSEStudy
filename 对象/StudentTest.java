public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "张三", 17);
        Student stu2 = new Student(2, "李四", 18);

        arr[0] = stu1;
        arr[1] = stu2;

        Student stu4 = new Student(4, "莉莉", 18);
        boolean flag = judgment(arr, stu4.getId());
        if (flag) {
            System.out.println("该id已经存在，请重新输入");
        } else {
            int digit = number(arr);
            if (digit == arr.length) {
                Student[] newArr = setNewArr(arr);
                newArr[digit] = stu4;
                printArr(newArr);
            } else {
                arr[digit] = stu4;
                printArr(arr);
            }
        }
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getAge());
            }
        }
    }

    public static Student[] setNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int number(Student[] arr) {
        int digit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                digit++;
            }
        }
        return digit;
    }

    public static boolean judgment(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }
}