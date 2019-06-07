import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author wangchong
 * @date 2019/6/7 10:36
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe 洗牌
 */

public class 洗牌 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int times = input.nextInt();
            ArrayList<Integer> current = new ArrayList<>();
            for (int j = 0; j < 2 * n; j++) {
                current.add(input.nextInt());
            }
            for (int j = 0; j < times; j++) {
                current = change(current);
            }
            res.addAll(current);
            for (int j = 0; j < res.size(); j++) {
                if (j < res.size() - 1) {
                    System.out.print(res.get(j) + " ");
                } else {
                    System.out.println(res.get(j));
                }
            }
            res.clear();
        }

    }
    public static ArrayList<Integer> change(ArrayList<Integer> arrayList) {
        int n = arrayList.size();
        ArrayList<Integer> before = new ArrayList<>(n / 2);
        ArrayList<Integer> behind = new ArrayList<>(n / 2);
        for (int i = 0; i < n / 2; i++) {
            before.add(arrayList.get(i));
        }
        for (int i = n / 2; i < n; i++) {
            behind.add(arrayList.get(i));
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n / 2; i++) {
            res.add(before.get(i));
            res.add(behind.get(i));
        }
        return res;
    }
}