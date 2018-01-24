import java.util.*;

public class Test_1 {



    public static void main(String[] args) {
        long cookies, c = 0;
        Scanner ob = new Scanner(System.in);
        int T=ob.nextInt();
        while (T!=0)
        {
            cookies = ob.nextLong();

        String s = Long.toBinaryString(cookies);
        for (int i = 0; i <s.length();i++) {
            if (s.charAt(i)=='1'){
                c++;
            }

        }
        System.out.println(c);
        T--;c=0;
        }

    }
}