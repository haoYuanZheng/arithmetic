import org.junit.Test;

/**
 * 945. 使数组唯一的最小增量
 */
public class Q945 {
    //测试数组
    int[] A = {1,2,2};

    @Test
    public void minIncrementForUnique() {
        //数组数字范围，循环并求得重复个数
        int[] count = new int[80000];
        for (int x : A) {
            count[x]++;
        }

        //ans:重复的值（累加取反） take：重复的个数
        int ans = 0, taken = 0;
        for (int x = 0; x < 80000; ++x) {
            //如果存在重复
            if (count[x] >= 2) {
                taken += count[x] - 1;
                ans -= x * (count[x] - 1);
            }
            //如果没被占用，则选用
            else if (taken > 0 && count[x] == 0) {
                taken--;
                ans += x;
            }
        }
        System.out.println(ans);
    }
}
