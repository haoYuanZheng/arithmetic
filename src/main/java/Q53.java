import org.junit.Test;

/**
 * @Author: HaoYuanZheng
 * @Date: 2020/3/26 9:03
 * @Description:最大子序和
 */
public class Q53 {
    /**
     * 测试数组
     */
    int[] A = {-2,1,-3,4,-1,2,1,-5,4};

    /**
     * 求最大和子数组
     * 1.暴力法
     */
    @Test
    public void getMaxSumArray() {
        int max = 0;
        int nums;
        for (int i = 0; i < A.length; i++) {
            nums = A[i];
            for (int j = i + 1; j < A.length; j++) {
                nums += A[j];
                max = Math.max(max, nums);
            }
            max = Math.max(max,A[i]);
        }
        System.out.println(max);
    }


    /**
     * 贪心算法
     */
    @Test
    public void tanxin(){
        //假设result为最大值
        int result = 0;
        int numsSize = A.length;
        int sum = 0;
        for (int i = 0; i < numsSize; i++)
        {
            sum += A[i];
            result = Math.max(result, sum);
            //如果sum < 0，重新开始找子序串
            if (sum < 0)
            {
                sum = 0;
            }
        }
        System.out.println(result);
    }
}
