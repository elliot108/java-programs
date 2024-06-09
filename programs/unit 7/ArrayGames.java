import java.util.*;
class ArrayGames {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        for (int i = 1; i < a.length; i++) a[i] = a[i-1];
        System.out.println(Arrays.toString(a));

        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);

        // double b = .01;
        // System.out.println(b);

        // Double b = new Double(0.1);
        Double c = Double.valueOf(0.1);
        Double d = Double.valueOf(0.1);
        
        System.out.println(d);

        System.out.println(c);
        System.out.println(d == c);

        String g = new String("lee");
        String e = String.valueOf("leee bal");
        String f = "lee";
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(g);
    }
}