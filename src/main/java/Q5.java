import org.junit.Test;

/**
 * @Author: HaoYuanZheng
 * @Date: 2020/3/25 9:15
 * @Description:5.最长回文字串
 * 暴力解法
 */
public class Q5 {
    String A = "abbc";

    /**
     * 判断是否是回文
     * @return
     */
    public Boolean isBack(String s){
        Boolean flag = true;
        int sLength = s.length();
        if (sLength%2!=0){
            sLength -= 1;
        };
        for (int i = 0; i <sLength/2 ; i++) {
            if (s.charAt(i) == s.charAt(sLength-i-1)){
                continue;
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    /**
     * 生成所有字符串组合
     */
    @Test
    public void allStr(){
        String result = "";
        int max = 0;
        for (int i = 0; i <A.length() ; i++) {
            for (int j=i+1; j<A.length();j++){
                String str = A.substring(i,j);
                if (isBack(str) && str.length()>max){
                    result = str;
                    max = str.length();
                }
            }
        }
        System.out.println(result);
    }
}
