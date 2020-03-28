import org.junit.Test;

/**
 * @Author: HaoYuanZheng
 * @Date: 2020/3/27 8:38
 * @Description:914.卡牌分组
 */
public class Q914 {
    /**
     * 测试数组
     */
    int[]A = {0,0,0,1,1,1,2,2,2};

    /**
     * 暴力法
     * 组内都有X涨牌，每张牌的数字都相等
     */
    @Test
    public void divideCards(){
        int[]B = new int[10000];
        boolean flag = false;

        //统计每一个数的个数
        for (int i:A){
            B[i]++;
        }
        //X从2开始直到超出数组大小
        for (int j=2;j<=A.length;j++){
            boolean cur = true;
            //每个数的个数判断是否整除,必须是公约数
            for(int k:B){
                if (k>0 && k%j!=0){
                    cur = false;
                    break;
                }
            }
            if (cur){
                flag = true;
                break;
            }else {
                continue;
            }
        }
        System.out.println(flag);
    }
}
