/**
 * @author wangchong
 * @date 2019/6/7 12:49
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Test_05 {
    public static void main(String[] args) {
        int i = 5;
        int s = (i++) + (++i) + (i--) + (--i);
        System.out.println(s);
    }
}
