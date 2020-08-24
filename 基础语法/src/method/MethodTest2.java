package method;

public class MethodTest2 {
    //学生醒目组成的数组（5个），指定查找一个区间，返回此人是否存在，如果存在。返回位置否则返回-1；
    //方法参数如何编写？按需写
    public static int findNameInStudents(String[] names, int start, int end, String name) {
        int position = -1;
        for (int i = start; i <= end; i++) {
            if (names[i].equals(name)) {
                position = i;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        String[] names = {"zs", "ls", "ww", "zl", "sq"};
        int start = 0;
        int end = 4;
        String name = "zs";
        int result = findNameInStudents(names, start, end, name);
        System.out.println(names[result]);

    }

}
