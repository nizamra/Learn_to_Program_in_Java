public class test2 {
        /* public static void mystery(String foo, String bar, String zazz) {
            System.out.println(zazz + " and " + foo + " like " + bar);
        }
        public static void main(String[] args) {
            String foo = "peanuts";
            String bar = "foo";
            mystery(bar, foo, "John");
        }

    public static void main(String[] args) {
        int x = 3;
        doubleMe(x);
        System.out.println("x doubled is " + x);
    }
    public static void doubleMe(int x) {
        x = x * 2;
    }
        public static String makeFancy(String s) {
            if (s.length() == 0) {
                return "*";
            }
            return "*" + s.substring(0,1) + makeFancy(s.substring(0, s.length()-1));
        }*/
    public static void main(String[] args) {
        //puzzle(22, 11);
        //System.out.println(makeFancy("JAVA"));
        System.out.println(puzzle(22, 11));
    }
    public static int puzzle(int i, int j) {
        if (i == j) {
            return 0;
        } else {
            return 1 + puzzle(i - 2, j - 1);
        }
    }
}
