import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/6/7 10:37
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe 统计同成绩学生人数
 */
public class 统计同成绩学生人数 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            int n = input.nextInt();
            if (n == 0) {
                break;
            }
            Map<Integer,Integer> map = new  HashMap<>();
            for (int i = 0; i < n; i++) {
                int curScore = input.nextInt();
                if (!map.containsKey(curScore)) {
                    map.put(curScore,1);
                } else {
                    map.put(curScore,map.get(curScore) + 1);
                }
            }
            int score = input.nextInt();
            if (map.get(score) == null) {
                System.out.println(0);
            } else {
                System.out.println(map.get(score));
            }
        }
    }
}
