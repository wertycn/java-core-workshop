package icu.debug.lang.struct;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author hanjinxiang@debug.icu
 * @date 2024-03-03 20:42
 */
@DisplayName("基本数据类型测试")
public class TestBasicDataStruct {

    static byte defaultByteStatic;

    byte defaultByteProp;

    boolean defaultBoolProp;
    static boolean defaultBoolStatic;

    char defaultCharProp;

    @Test
    @DisplayName("byte类型")
    void testByte() {
        byte b1 = 1;
        byte b2 = 2;
        byte bDefault; // 无法被使用
        int i1 = b1 + b2;

        assertEquals(1, b1);
        assertEquals(2, b1);
        assertEquals(0, defaultByteProp);
        assertEquals(0, defaultByteStatic);
    }

    @Test
    @DisplayName("short类型")
    void testShort() {
        short short1 = 0;
        short shortMax = Short.MAX_VALUE;  // 2^15-1;
        short shortMin = Short.MIN_VALUE;

        assertEquals(0, short1);
        assertEquals(32767, shortMax);
        assertEquals(-32768, shortMin);
    }

    @Test
    @DisplayName("int long")
    void testIntAndLong() {
        int i = 0;
        long l = 0;
        long long1 = 1L;
        long long2 = 1l;
        long long3 = 2;
        assertEquals(1, long1);
        assertEquals(1, long2);
        assertEquals(1L, long1);
        assertEquals(1L, long2);
        assertEquals(2, long3);
        assertEquals(2L, long3);


    }


    @Test
    @DisplayName("float double 类型")
    void testFloatAndDouble() {
        float f1 = 1.0f;
        float f2 = 1.0F;
        float f3 = 1.F;
        double d0 = 1.0d;
        double d1 = 1.0D;
        double d2 = 1.;
        double d3 = 1.d;

        assertEquals(1.0, f1);
        assertEquals(1.0, f2);
        assertEquals(1.0, f3);
        assertEquals(1.0, d0);
        assertEquals(1.0, d1);
        assertEquals(1.0, d2);
        assertEquals(1.0, d3);
    }

    @Test
    @DisplayName("boolean 类型")
    void testBoolean() {
        boolean bool = true;
        assertFalse(defaultBoolProp);
        assertFalse(defaultBoolStatic);
        assertTrue(bool);
    }

    @Test
    @DisplayName("char 类型")
    void testChar() {
        char c1 = '1';
        char c2 = 0;
        char c3 = '\u0000';
        assertEquals(0, defaultCharProp);
        assertEquals(0, c2);
        assertEquals(0, c3);
        assertEquals(c2, defaultCharProp);
        assertEquals(c3, defaultCharProp);
        assertEquals(1, c1 - 48);
    }

    @Test
    @DisplayName("Number类")
    void testNumber() {
        Integer i = 0;
        Long l = 0L;

        assertEquals(0, i);
        assertEquals(0, l);
    }

    @Test
    @DisplayName("Math 类")
    void testMath() {
        assertEquals(3.141592653589793, Math.PI);
        assertEquals(10,Math.abs(-10));
        assertEquals(1,Math.sin(Math.PI/2));
        //assertEquals(1,Math.);
    }

}
