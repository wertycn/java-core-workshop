package icu.debug.lang.struct;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hanjinxiang@debug.icu
 * @date 2024-03-03 13:11
 */
class MyArrayTest {

    @Test
    @DisplayName("数组实例化-指定初始大小")
    void testArrayInstance() {
        String[] stringArr = new String[10];
        for (int i = 0; i < 10; i++) {
            stringArr[i] = "value:" + i;
        }
        System.out.println(String.join(",", stringArr));
        assertEquals("value:0", stringArr[0]);
    }

    @Test
    @DisplayName("数组初始化--指定元素")
    void testArrayInstanceInitValue() {
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 78};
        for (int i : intArr) {
            System.out.println(i);
        }
        assertEquals(3, intArr[2]);
    }

    @Test
    @DisplayName("Arrays封装类--二分查找")
    void testArraysUtils() {
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 78};
        // 二分查找元素(排序好的数组)
        int i = Arrays.binarySearch(intArr, 4);
        assertEquals(3, i);
        // 未排好序
        int[] intArr2 = {5, 2, 4, 3, 5, 6, 7, 78};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int id = Arrays.binarySearch(intArr2, 4);
            assertEquals(4, intArr2[id]);
        });

    }

    @Test
    @DisplayName("Arrays fill 方法")
    void testArraysFill(){
        int[] intArr = {5, 2, 4, 3, 5, 6, 7, 78};
        Arrays.fill(intArr,5);
        for (int v :                intArr) {
            System.out.println(v);

        }
    }
}