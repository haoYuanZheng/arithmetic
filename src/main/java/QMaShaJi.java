import org.junit.Test;

/**
 * @Author: HaoYuanZheng
 * @Date: 2020/3/24 9:10
 * @Description:面试题 17.16. 按摩师
 */
public class QMaShaJi {
    //测试数组
    int[] nums = {2, 1, 1, 2};

    @Test
    public void maxTime() {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            int c = Math.max(b, a + nums[i]);
            //a变为
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
