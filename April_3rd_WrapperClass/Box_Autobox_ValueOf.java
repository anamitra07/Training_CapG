package April_3rd_WrapperClass;

public class Box_Autobox_ValueOf {
    public static void main(String[] args) {
        int i=10;
        Integer x = new Integer(i); // boxing
        System.out.println("x: "+x);

        Integer y = i; // auto-boxing
        System.out.println("y: "+y);

        Integer z = Integer.valueOf(i); // valueOf() method
        System.out.println("z: "+z);
    }
}
