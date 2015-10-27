package com.solution;

/**
 * 题意：从数组中去除某个值，返回新数组的长度；
 * 注意在去除完毕后数组中的元素应该变化了，
 * 即出现value的位置都被替换掉了，最后一句的意思是
 * 新长度后面的元素值任意，也就是说，新数组的总长度可以保持不变，
 * 但是新长度之前的元素要正确，后面的无所谓。
 */
public class Question27 {
	public static int removeElement(int[] nums, int val) {
	    //{1,1,2,1,2,3,2,3,1}  
        int newIndex = 0;  
        for (int oldIndex = 0; oldIndex < nums.length; ++oldIndex) {  
            if (nums[oldIndex] != val) {  
                nums[newIndex++] = nums[oldIndex];  
            }   
        }  
        return newIndex;  
	}

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6};
		System.out.println(removeElement(nums, 7));
	}
}
