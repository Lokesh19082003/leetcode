import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger num=new BigInteger(a,2);
        BigInteger num1=new BigInteger(b,2);
        BigInteger sum=num.add(num1);
        return sum.toString(2);
    } 
}