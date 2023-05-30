public class Exercise_3 {
    public static void main(String[] args) {
        int[] nums = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        //while
        int i = 0;
        while (i < nums.length) {
            System.out.println(nums[i]);
            i++;
        }

        //for
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }

        //while with an odd index
        i = 1;
        while (i < nums.length) {
            System.out.println(nums[i]);
            i += 2;
        }

        //for with an even index
        for (int j = 0; j < nums.length; j += 2) {
            System.out.println(nums[j]);
        }

        //Array output in reverse order
        for (int j = nums.length - 1; j >= 0; j--) {
            System.out.println(nums[j]);
        }
    }
}
