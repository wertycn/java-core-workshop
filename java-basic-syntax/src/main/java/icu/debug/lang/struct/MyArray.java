package icu.debug.lang.struct;

/**
 * 数组
 *
 * @author hanjinxiang@debug.icu
 * @date 2024-03-03 12:48
 */
public class MyArray {

    /**
     * 声明
     */
    Object[] array;


    public MyArray(int size) {
        // 实例化
        array = new Object[size];
    }

    public MyArray() {
        array = new Object[]{"a", "b", 1, 1.1};
        int[] intArr = {12, 23, 34};
    }

    public void set(int index, Object element) {
        // 数组越界检查
        if (index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("array length " + array.length + " index " + index + " out bounds");
        }
        array[index] = element;
    }


}
