package March_12th;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 12-03-2025
 Time: 14:18
 ******************************/

public class TypeCast {
    public static void main(String[] args) {

        long a = 10;
        short b = (short) a;                 //explicit typecast
        System.out.println(b);

        float c=5;
        long d = (long) c;                   //explicit typecast
        System.out.println(d);

        float alpha = 65.7f;
        char sigma = (char) alpha;           //explicit typecast
        System.out.println(sigma);

        int beta = 40;
        char ch = (char) beta;               //explicit typecast
        System.out.println(ch);
    }
}
