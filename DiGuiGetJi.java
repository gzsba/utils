import java.math.BigInteger;

//递归获取乘积，并打印结果（不用科学计数法）
public class DiGuiGetJi {
    public static void main(String[] args) {
        BigInteger ji = getJi(30);
        BigInteger j  = new BigInteger(ji.toString());
        System.out.println(BigInteger.valueOf(30).multiply(j));
    }

    public static BigInteger getJi(int i) {
        if (i==1) {
            return BigInteger.ONE;
        }
        BigInteger ji = BigInteger.valueOf(i).multiply(getJi(i-1));
        return ji;
    }
}
