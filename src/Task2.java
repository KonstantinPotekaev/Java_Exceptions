public class Task2 {
    public static void main(String[] args) {
        String[][] s = {{"1","F","3"}, {"2","4"}};
        System.out.println(sum2d(s));
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                try {
                    try {
                        int val = Integer.parseInt(arr[i][j]);
                        sum += val;
                    }
                    catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }

                }
                catch (ArrayIndexOutOfBoundsException ex){
                    System.out.println(ex.getMessage());

                }
            }
        }
        return sum;
    }
}
