package main;

/**
 * @author summer
 * @create 2022-08-19 10:38
 * @Description
 */
public class _1109_corpFlightBookings {


    /**
     * 暴力循环解决
     * @param bookings
     * @param n
     * @return
     */
    public static  int[] corpFlightBookings(int[][] bookings, int n) {
        // 定义结果
        int[] result = new int[n];
        // 遍历
        for (int[] booking : bookings) {
            add(result,booking[0],booking[1],booking[2]);
        }
        return result;
    }

    private static void add(int[] result,int startIndex,int enbIndex,int num){
        for (int i = startIndex -1; i < enbIndex; i++) {
            result[i] += num;
        }
    }


    /**
     * 差分解决
     * @param bookings
     * @param n
     * @return
     */
    public static  int[] corpFlightBookings_2(int[][] bookings, int n) {
        int[] nums = new int[n];
        for (int[] booking : bookings) {
            nums[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                nums[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }


    public static void main(String[] args) {
        // bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
        int[][] bookings = new int[][]{{1,2,10},{2,3,20},{2,5,25}};
        //int[] result = corpFlightBookings(bookings,5);
        int[] result = corpFlightBookings_2(bookings,5);
        for (int i = 0; i < result.length; i++) {
            System.out.println("i = " + i + ",seats = " + result[i]);
        }
        System.out.println("==============================:");
        bookings = new int[][]{{1,2,10},{2,2,15}};
        //result = corpFlightBookings(bookings,2);
        result = corpFlightBookings_2(bookings,2);
        for (int i = 0; i < result.length; i++) {
            System.out.println("i = " + i + ",seats = " + result[i]);
        }
    }
}
