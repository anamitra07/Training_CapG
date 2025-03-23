package Day3_12th_March;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 12-03-2025
 Time: 10:58
 ******************************/
public class Conditional {
    public static void main(String[] args) {
        int a=10,b=20,c=5;
        int res = (a>b) && (a>c) ? a : (b>c) ? b : c;
        System.out.println(res);
    }
}
