package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 90};
        ArraysUtil.printArray(nums);
        ArraysUtil.printArray(new int[]{23, 45, 67, 88, 33});

        System.out.println("sum = " + ArraysUtil.sum(nums));
        System.out.println("sums = " + ArraysUtil.sum(new int[]{34, 55, 66, 1, 2}));

        int[] nums2 = {11, 7, 4, 17, 27, 37, 47, 57};

        System.out.println("7- found " + ArraysUtil.contains(nums2, 7));
        System.out.println("77- found " + ArraysUtil.contains(nums2, 77));
    }
}