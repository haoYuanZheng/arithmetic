import org.junit.Test;

/**
 * @Author: HaoYuanZheng
 * @Date: 2020/3/23 10:21
 * @Description:链表的中间节点
 * 暴力法、单指针、快慢双指针
 */
public class Q876 {

    @Test
    public void getListMiddle() {
        int[]A = {1,2,3,4,5};

        //List的长度
        int length = A.length;
        //目标位置
        int aim;

        if (length>1){
            //如果是双数
            if (length%2==0){
                aim = length/2 + 1;
            }
            //如果是单数
            else {
                aim = (length+1)/2;
            }
        }else {
            aim = length;
        }
        System.out.println(A[aim-1]);
    }
}
