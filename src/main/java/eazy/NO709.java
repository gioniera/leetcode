package eazy;

/**
 * @author: WYL
 * @create: 2019-11-16 17:30
 **/
public class NO709 {
    public String toLowerCase(String str) {
        byte[] bt = str.getBytes();
        for (int i=0;i<bt.length;i++){
            if (bt[i]>=65&&bt[i]<=90)
            bt[i]= (byte) (bt[i]+ 32);
        }
        return new String(bt);
    }

    public static void main(String[] args) {
        NO709 n = new NO709();
        System.out.printf("xxxx");
        System.out.printf(n.toLowerCase("HELsOW"));
    }
}
