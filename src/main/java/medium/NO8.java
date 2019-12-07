package medium;

/**
 * @author: WYL
 * @create: 2019-12-07 21:45
 * 字符串转换整数 (atoi)
 **/
public class NO8 {

    public int myAtoi(String str) {
        str = str.trim();
        if (str.length()==0){
            return 0;
        }

        long n = 0;
        int p = 1;
        char a[] = str.toCharArray();
        int j = 0;
        if (a[0] == 45){
            p = -1;
            j++;
        }
        if (a[0] == 43){
            j++;
        }

        for (int i = j ; i < a.length ; i++){
            if (a[i]>=48&& a[i]<=57){
                n = n*10 + (a[i]-48);
                if (n>Integer.MAX_VALUE){
                    n =  Integer.MAX_VALUE;
                    break;
                }
            }else{
                break;
            }
        }
        if (p==-1){
            n++;
        }
        return(int) n*p;
    }
    public static void main(String[] args) {

        char a[] = "  xx".toCharArray();
        System.out.println("   43322".trim());
        NO8 no = new NO8();
        System.out.println(no.myAtoi("   -43241341423124143322") );
    }
}
