package com.nodonotnodo.util;

import com.nodonotnodo.sort.Element;
import com.nodonotnodo.sort.impl.QuickSorter;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.*;

/**
 * Author: nodonotnodo
 * Created: 2018/10/16
 */
public final class ArrayUtil {
    
    /**
     * 数组中元素未找到的下标，值为-1
     */
    public static final int INDEX_NOT_FOUND = -1;

    private ArrayUtil() {
    
    }
    
    
    /**
     * 数组是否为空
     *
     * @param <T>   数组元素类型
     * @param array 数组
     * @return 是否为空
     */
    @SuppressWarnings("unchecked")
    public static <T> boolean isEmpty(final T... array) {
        if(array == null || array.length == 0){
            return true;
        }
        return false;
    }
    
    /**
     * 数组是否为空<br>
     * 此方法会匹配单一对象，如果此对象为{@code null}则返回true<br>
     * 如果此对象为非数组，理解为此对象为数组的第一个元素，则返回false<br>
     * 如果此对象为数组对象，数组长度大于0情况下返回false，否则返回true
     *
     * @param array 数组
     * @return 是否为空
     */
    public static boolean isEmpty(Object array) {
        if(array == null ){
            return true;
        }

        //对象是一个数组
        if(array.getClass().isArray()){

            //对象是一个byte(1个字节)型数组
            if(array instanceof byte[]){
                if(((byte[]) array).length ==0){
                    return true;
                }
            }

            //对象是一个short(2个字节)型数据
            if(array instanceof short[]){
                if(((short[]) array).length == 0){
                    return true;
                }
            }

            //对象是一个int(4个字节)型数组
            if(array instanceof int[]){
                if(((int[]) array).length == 0){
                    return true;
                }
            }

            //对象是一个long(8个字节)型数组
            if(array instanceof long[]){
                if(((long[]) array).length == 0){
                    return true;
                }
            }
            //对象是一个char(2个字节)型数组
            if(array instanceof char[]) {
                if(((char[]) array).length == 0){
                    return true;
                }
            }


            //对象是一个float(4个字节)型数组
            if(array instanceof float[]){
                if(((float[]) array).length == 0){
                    return true;
                }
            }

            //对象是一个double(8个字节)型数组
            if(array instanceof double[]){
                if(((double[]) array).length == 0){
                    return true;
                }
            }

            //对象是一个boolean(1个比特位)型数据
            if(array instanceof boolean[]){
                if(((boolean[]) array).length == 0){
                    return true;
                }
            }

            //对象是一个String型数组
            if(array instanceof String[]){
                if(((String[]) array).length == 0){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * 数组是否为空
     *
     * @param array 数组
     * @return 是否为空
     */
    public static boolean isEmpty(final long... array) {
        if(array == null || array.length == 0){
            return true;
        }
        return false;
    }
    
    /**
     * 数组是否为空
     *
     * @param array 数组
     * @return 是否为空
     */
    public static boolean isEmpty(final int... array) {
        if(array == null || array.length == 0){
            return true;
        }
        return false;
    }
    
    /**
     * 数组是否为空
     *
     * @param array 数组
     * @return 是否为空
     */
    public static boolean isEmpty(final short... array) {
        if(array == null || array.length == 0){
            return true;
        }
        return false;
    }
    
    /**
     * 数组是否为空
     *
     * @param array 数组
     * @return 是否为空
     */
    public static boolean isEmpty(final char... array) {
        if(array == null || array.length == 0){
            return true;
        }
        return false;
    }
    
    /**
     * 数组是否为空
     *
     * @param array 数组
     * @return 是否为空
     */
    public static boolean isEmpty(final byte... array) {
        if(array == null || array.length == 0){
            return true;
        }
        return false;
    }
    
    /**
     * 数组是否为空
     *
     * @param array 数组
     * @return 是否为空
     */
    public static boolean isEmpty(final double... array) {
        if(array == null || array.length == 0){
            return true;
        }
        return false;
    }
    
    /**
     * 数组是否为空
     *
     * @param array 数组
     * @return 是否为空
     */
    public static boolean isEmpty(final float... array) {
        if(array == null || array.length == 0){
            return true;
        }
        return false;
    }
    
    /**
     * 数组是否为空
     *
     * @param array 数组
     * @return 是否为空
     */
    public static boolean isEmpty(final boolean... array) {
        if(array == null || array.length == 0){
            return true;
        }
        return false;
    }
    
    
    /**
     * 数组是否为非空
     *
     * @param <T>   数组元素类型
     * @param array 数组
     * @return 是否为非空
     */
    @SuppressWarnings("unchecked")
    public static <T> boolean isNotEmpty(final T... array) {
        if(array == null || array.length == 0){
            return false;
        }
        return true;
    }
    
    /**
     * 数组是否为非空<br>
     * 此方法会匹配单一对象，如果此对象为{@code null}则返回false<br>
     * 如果此对象为非数组，理解为此对象为数组的第一个元素，则返回true<br>
     * 如果此对象为数组对象，数组长度大于0情况下返回true，否则返回false
     *
     * @param array 数组
     * @return 是否为非空
     */
    public static boolean isNotEmpty(final Object array) {
        if(array == null ){
            return false;
        }

        //对象是一个数组
        if(array.getClass().isArray()){

            //对象是一个byte(1个字节)型数组
            if(array instanceof byte[]){
                if(((byte[]) array).length ==0){
                    return false;
                }
            }

            //对象是一个short(2个字节)型数据
            if(array instanceof short[]){
                if(((short[]) array).length == 0){
                    return false;
                }
            }

            //对象是一个int(4个字节)型数组
            if(array instanceof int[]){
                if(((int[]) array).length == 0){
                    return false;
                }
            }

            //对象是一个long(8个字节)型数组
            if(array instanceof long[]){
                if(((long[]) array).length == 0){
                    return false;
                }
            }
            //对象是一个char(2个字节)型数组
            if(array instanceof char[]) {
                if(((char[]) array).length == 0){
                    return false;
                }
            }


            //对象是一个float(4个字节)型数组
            if(array instanceof float[]){
                if(((float[]) array).length == 0){
                    return false;
                }
            }

            //对象是一个double(8个字节)型数组
            if(array instanceof double[]){
                if(((double[]) array).length == 0){
                    return false;
                }
            }

            //对象是一个boolean(1个比特位)型数据
            if(array instanceof boolean[]){
                if(((boolean[]) array).length == 0){
                    return false;
                }
            }

            //对象是一个String型数组
            if(array instanceof String[]){
                if(((String[]) array).length == 0){
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * 数组是否为非空
     *
     * @param array 数组
     * @return 是否为非空
     */
    public static boolean isNotEmpty(final long... array) {
        if(array == null || array.length == 0){
            return false;
        }
        return true;
    }
    
    /**
     * 数组是否为非空
     *
     * @param array 数组
     * @return 是否为非空
     */
    public static boolean isNotEmpty(final int... array) {
        if(array == null || array.length == 0){
            return false;
        }
        return false;
    }
    
    /**
     * 数组是否为非空
     *
     * @param array 数组
     * @return 是否为非空
     */
    public static boolean isNotEmpty(final short... array) {
        if(array == null || array.length == 0){
            return false;
        }
        return false;
    }
    
    /**
     * 数组是否为非空
     *
     * @param array 数组
     * @return 是否为非空
     */
    public static boolean isNotEmpty(final char... array) {
        if(array == null || array.length == 0){
            return false;
        }
        return false;
    }
    
    /**
     * 数组是否为非空
     *
     * @param array 数组
     * @return 是否为非空
     */
    public static boolean isNotEmpty(final byte... array) {
        if(array == null || array.length == 0){
            return false;
        }
        return false;
    }
    
    /**
     * 数组是否为非空
     *
     * @param array 数组
     * @return 是否为非空
     */
    public static boolean isNotEmpty(final double... array) {
        if(array == null || array.length == 0){
            return false;
        }
        return false;
    }
    
    /**
     * 数组是否为非空
     *
     * @param array 数组
     * @return 是否为非空
     */
    public static boolean isNotEmpty(final float... array) {
        if(array == null || array.length == 0){
            return false;
        }
        return false;
    }
    
    /**
     * 数组是否为非空
     *
     * @param array 数组
     * @return 是否为非空
     */
    public static boolean isNotEmpty(final boolean... array) {
        if(array == null || array.length == 0){
            return false;
        }
        return false;
    }
    
    /**
     * 是否包含{@code null}元素
     *
     * @param <T>   数组元素类型
     * @param array 被检查的数组
     * @return 是否包含{@code null}元素
     */
    @SuppressWarnings("unchecked")
    public static <T> boolean hasNull(T... array) {
        if(array == null){
            return false;
        }
        for(int i = 0; i<array.length; i++){
            if(array[i] == null){
                return true;
            }
        }
        return false;
    }
    
    /**
     * 返回数组中第一个非空元素
     *
     * @param <T>   数组元素类型
     * @param array 数组
     * @return 非空元素，如果不存在非空元素或数组为空，返回{@code null}
     */
    @SuppressWarnings("unchecked")
    public static <T> T firstNonNull(T... array) {
        if(array == null){
            return null;
        }
        int i = 0;
        while(i++<array.length){
            if(array[i] != null){
                return array[i];
            }
        }
        return null;
    }
    
    /**
     * 新建一个空数组
     *
     * @param <T>           数组元素类型
     * @param componentType 元素类型
     * @param newSize       大小
     * @return 空数组
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] newArray(Class<?> componentType, int newSize) {
        //Array.newInstance(Class<?> componentType, int length)--->创建一个具有指定元素类型和长度的新数组，返回值为Object型
        T[] newArray = (T[])Array.newInstance(componentType,newSize);
        return newArray;
    }
    
    /**
     * 新建一个空数组
     *
     * @param <T>     数组元素类型
     * @param newSize 大小
     * @return 空数组
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] newArray(int newSize) {
        T[] newArray = (T[]) new Object[newSize];
        return newArray;
    }
    
    /**
     * 获取数组对象的元素类型
     *
     * @param array 数组对象
     * @return 元素类型
     */
    public static Class<?> getComponentType(Object array) {
        if(array == null ){
            return null;
        }

        //对象是一个byte(1个字节)型数组
        if(array instanceof byte[]){
            return byte.class;
        }

        //对象是一个short(2个字节)型数据
        if(array instanceof short[]){
            return short.class;
        }

        //对象是一个int(4个字节)型数组
        if(array instanceof int[]){
            return int.class;
        }

        //对象是一个long(8个字节)型数组
        if(array instanceof long[]){
            return long.class;
        }
        //对象是一个char(2个字节)型数组
        if(array instanceof char[]) {
            return char.class;
        }


        //对象是一个float(4个字节)型数组
        if(array instanceof float[]){
            return float.class;
        }

        //对象是一个double(8个字节)型数组
        if(array instanceof double[]){
            return double.class;
        }

        //对象是一个boolean(1个比特位)型数据
        if(array instanceof boolean[]){
            return boolean.class;
        }

        //对象是一个String型数组
        else {
            return String.class;
        }
    }
    
    /**
     * 获取数组对象的元素类型
     *
     * @param arrayClass 数组类
     * @return 元素类型
     */
    public static Class<?> getComponentType(Class<?> arrayClass) {
        if(arrayClass == null){
            return null;
        }
        return arrayClass.getClass();
    }
    
    /**
     * 根据数组元素类型，获取数组的类型<br>
     * 方法是通过创建一个空数组从而获取其类型
     *
     * @param componentType 数组元素类型
     * @return 数组类型
     */
    //Integer.class
    public static Class<?> getArrayType(Class<?> componentType) {
        return newArray(componentType,1).getClass();
    }
    
    /**
     * 强转数组类型<br>
     * 强制转换的前提是数组元素类型可被强制转换<br>
     * 强制转换后会生成一个新数组
     *
     * @param type     数组类型或数组元素类型
     * @param arrayObj 原数组
     * @return 转换后的数组类型
     * @throws NullPointerException     提供参数为空
     * @throws IllegalArgumentException 参数arrayObj不是数组
     */
    public static Object[] cast(Class<?> type, Object arrayObj) throws NullPointerException, IllegalArgumentException {
        //TODO
        if(arrayObj == null){
            throw new NullPointerException();
        }
        if(isArray(arrayObj)){
            throw new IllegalArgumentException();
        }
        if(getComponentType(arrayObj) == type){
            Object[] objects = (Object[])arrayObj;
        }
        return null;
    }
    
    /**
     * 将新元素添加到已有数组中<br>
     * 添加新元素会生成一个新的数组，不影响原数组
     *
     * @param <T>         数组元素类型
     * @param buffer      已有数组
     * @param newElements 新元素
     * @return 新数组
     */
    @SafeVarargs
    public static <T> T[] append(T[] buffer, T... newElements) {
        T[] newBuffer = (T[]) new Object[buffer.length+newElements.length];
        for(int i = 0; i<buffer.length; i++){
            newBuffer[i] = buffer[i];
        }
        for(int i = buffer.length; i<newBuffer.length; i++){
            newBuffer[i] = newElements[i-buffer.length];
        }
        return newBuffer;
    }
    
    /**
     * 将新元素添加到已有数组中<br>
     * 添加新元素会生成一个新的数组，不影响原数组
     *
     * @param <T>         数组元素类型
     * @param array       已有数组
     * @param newElements 新元素
     * @return 新数组
     */
    @SafeVarargs
    public static <T> Object append(Object array, T... newElements) {
        if(array == null){
            return null;
        }
        Object[] objects = (Object[])array;
        Object[] newObjects = new Object[((Object[]) array).length+newElements.length];
        for(int i=0; i<objects.length; i++){
            newObjects[i] = objects[i];
        }
        for(int i=0; i<newElements.length; i++){
            newObjects[i+objects.length] = newElements[i];
        }
        return newObjects;
    }
    
    
    /**
     * 将新元素插入到到已有数组中的某个位置<br>
     * 添加新元素会生成一个新的数组，不影响原数组<br>
     * 如果插入位置为为负数，从原数组从后向前计数，若大于原数组长度，则空白处用null填充
     *
     * @param <T>         数组元素类型
     * @param buffer      已有数组
     * @param index       插入位置，此位置为对应此位置元素之前的空档
     * @param newElements 新元素
     * @return 新数组
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] insert(T[] buffer, int index, T... newElements) {
        T[] newBuffer = null;
        if(Math.abs(index)>buffer.length){
            //index绝对值大于buffer长度且大于0
            if(index>0){
                newBuffer = (T[]) new Object[index+newElements.length];
                for(int i=0; i<index; i++){
                    if(i<buffer.length){
                        newBuffer[i] = buffer[i];
                    }else{
                        newBuffer[i] = null;
                    }
                }
                for(int i=index; i<newBuffer.length; i++){
                    newBuffer[i] = newElements[i-index];
                }
            }else{            //index绝对值大于buffer长度且小于0
                newBuffer = (T[]) new Object[newElements.length-index];
                for(int i=0; i<newElements.length; i++){
                    newBuffer[i] = newElements[i];
                }
                for(int i=newBuffer.length-1; i>newBuffer.length-1+index; i--){
                    if(i>=newBuffer.length-buffer.length){
                        newBuffer[i] = buffer[i-newBuffer.length+buffer.length];
                    }else{
                        newBuffer[i] = null;
                    }
                }
            }
        }else{
            //index绝对值小于等于buffer长度且大于0
            newBuffer = (T[])new Object[buffer.length+newElements.length];
            if(index>0){
                for(int i=0; i<index; i++){
                    newBuffer[i] = buffer[i];
                }
                for(int i=index; i<index+newElements.length; i++){
                    newBuffer[i] = newElements[i-index];
                }
                for(int i=index+newElements.length; i<newBuffer.length; i++){
                    newBuffer[i] = buffer[i-newElements.length];
                }
            }else if(index<0){                //index绝对值小于buffer长度且小于0
                for(int i=0; i<buffer.length+index; i++){
                    newBuffer[i] = buffer[i];
                }
                for(int i=buffer.length+index; i<buffer.length+index+newElements.length; i++){
                    newBuffer[i] = newElements[i-buffer.length-index];
                }
                for(int i= buffer.length+index+newElements.length; i<newBuffer.length; i++){
                    newBuffer[i] = buffer[i-buffer.length-index-newElements.length+buffer.length+index];
                }
            }else{
                for(int i=0; i<newElements.length; i++){
                    newBuffer[i] = newElements[i];
                }
                for(int i=newElements.length; i<newBuffer.length; i++){
                    newBuffer[i] = buffer[i-newElements.length];
                }
            }
        }
        return newBuffer;
    }

    /**
     * 将新元素插入到到已有数组中的某个位置<br>
     * 添加新元素会生成一个新的数组，不影响原数组<br>
     * 如果插入位置为为负数，从原数组从后向前计数，若大于原数组长度，则空白处用null填充
     *
     * @param <T>         数组元素类型
     * @param array       已有数组
     * @param index       插入位置，此位置为对应此位置元素之前的空档
     * @param newElements 新元素
     * @return 新数组
     */
    @SuppressWarnings("unchecked")
    public static <T> Object insert(Object array, int index, T... newElements) {
        Object[] objects = (Object[])array;
        insert(objects,index,newElements);
        return null;
    }

    /**
     * 生成一个新的重新设置大小的数组<br>
     * 调整大小后拷贝原数组到新数组下。扩大则占位前N个位置，缩小则截断
     *
     * @param <T>           数组元素类型
     * @param buffer        原数组
     * @param newSize       新的数组大小
     * @param componentType 数组元素类型
     * @return 调整后的新数组
     */
    public static <T> T[] resize(T[] buffer, int newSize, Class<?> componentType) {
        //TODO
        T[] newBuffer = (T[]) new Object[newSize];
        if(buffer.length <= newSize){
            for(int i=0; i<buffer.length; i++){
                newBuffer[i] = buffer[i];
            }
        }else{
            for(int i=0; i<newSize; i++){
                newBuffer[i] = buffer[i];
            }
        }
        return newBuffer;
    }

    /**
     * 生成一个新的重新设置大小的数组<br>
     * 新数组的类型为原数组的类型，调整大小后拷贝原数组到新数组下。扩大则占位前N个位置，缩小则截断
     *
     * @param <T>     数组元素类型
     * @param buffer  原数组
     * @param newSize 新的数组大小
     * @return 调整后的新数组
     */
    public static <T> T[] resize(T[] buffer, int newSize) {
        T[] newBuffer = (T[]) new Object[newSize];
        if(buffer.length <= newSize){
            for(int i=0; i<buffer.length; i++){
                newBuffer[i] = buffer[i];
            }
        }else{
            for(int i=0; i<newSize; i++){
                newBuffer[i] = buffer[i];
            }
        }
        return newBuffer;
    }

    /**
     * 将多个数组合并在一起<br>
     * 忽略null的数组
     *
     * @param <T>    数组元素类型
     * @param arrays 数组集合
     * @return 合并后的数组
     */
    @SafeVarargs
    public static <T> T[] addAll(T[]... arrays) {
        if(arrays == null){
            return null;
        }
        int newSize = 0;
        for(T[] array: arrays){
            if(array != null){
                newSize+=array.length;
            }
        }
        T[] newArray = (T[]) new Object[newSize];
        int i = 0;
        for(T[] array: arrays){
            int j = 0;
            if(array != null && array.length>0){
                for(; j<array.length; j++,i++){
                    newArray[i] = array[j];
                }
            }
        }
        return newArray;
    }


    /**
     * 生成一个从0开始的数字列表<br>
     *
     * @param excludedEnd 结束的数字（不包含）
     * @return 数字列表
     */
    public static int[] range(int excludedEnd) {
        if(excludedEnd <= 0){
            return null;
        }
        int[] result = new int[excludedEnd];
        for(int i=0; i<result.length; i++){
            result[i] = i;
        }
        return result;
    }

    /**
     * 生成一个数字列表<br>
     * 自动判定正序反序
     *
     * @param includedStart 开始的数字（包含）
     * @param excludedEnd   结束的数字（不包含）
     * @return 数字列表
     */
    public static int[] range(int includedStart, int excludedEnd) {
        if(includedStart == excludedEnd){
            return null;
        }
        int[] result = new int[includedStart-excludedEnd>0 ? (includedStart-excludedEnd):(excludedEnd-includedStart)];
        if(includedStart > excludedEnd){
            for(int i=0; i<result.length; i++){
                result[i] = includedStart - i;
            }
        }else{
            for(int i=0; i<result.length; i++){
                result[i] = includedStart + i;
            }
        }
        return result;
    }

    /**
     * 生成一个数字列表<br>
     * 自动判定正序反序
     *
     * @param includedStart 开始的数字（包含）
     * @param excludedEnd   结束的数字（不包含）
     * @param step          步进
     * @return 数字列表
     */
    public static int[] range(int includedStart, int excludedEnd, int step) {
        if(includedStart == excludedEnd){
            return null;
        }
        int size = includedStart-excludedEnd>0 ? (includedStart-excludedEnd):(excludedEnd-includedStart);
        int[] result = new int[(size%step == 0)?(size/step):(size/step+1)];
        if(includedStart > excludedEnd){
            for(int i=0; i<result.length; i++){
                if(0 == i){
                    result[i] = includedStart;
                }else{
                    result[i] = includedStart - (i*step);
                }
            }
        }else{
            for(int i=0; i<result.length; i++){
                if(0 == i){
                    result[i] = includedStart + i;
                }else{
                    result[i] = includedStart + (i*step);
                }
            }
        }
        return result;
    }
    
    /**
     * 拆分byte数组为几个等份（最后一份可能小于len）
     *
     * @param array 数组
     * @param len   每个小节的长度
     * @return 拆分后的数组
     */
    public static byte[][] split(byte[] array, int len) {
        if(array == null || len == 0){
            return null;
        }
        int size = 0==array.length%len ? (array.length/len):(array.length/len+1);
        byte[][] result = new byte[size][len];
        for(int i=0; i<array.length; i++){
            for(int j=0; j<size; j++){
                for(int k=0; k<len; k++){
                    if(i<array.length){
                        result[j][k] = array[i];
                    }else{
                        result[j][k] = 0;
                    }
                    i++;
                }
            }
        }
        return result;
    }
    
    
    /**
     * 映射键值（参考Python的zip()函数）<br>
     * 例如：<br>
     * keys = [a,b,c,d]<br>
     * values = [1,2,3,4]<br>
     * 则得到的Map是 {a=1, b=2, c=3, d=4}<br>
     * 如果两个数组长度不同，则只对应最短部分
     *
     * @param <K>     Key类型
     * @param <V>     Value类型
     * @param keys    键列表
     * @param values  值列表
     * @param isOrder 是否有序
     * @return Map
     */
    public static <K, V> Map<K, V> zip(K[] keys, V[] values, boolean isOrder) {
        if(keys == null || values == null){
            return null;
        }
        int size = keys.length>values.length ? (values.length) : (keys.length);
        if(isOrder){//有序
            Map<K,V> result = new TreeMap<>();
            for(int i=0; i<size; i++){
                result.put(keys[i], values[i]);
            }
            return result;
        }else{//无序
            Map<K,V> result = new HashMap<>();
            for(int i=0; i<size; i++){
                result.put(keys[i], values[i]);
            }
            return result;
        }
    }
    
    /**
     * 映射键值（参考Python的zip()函数），返回Map无序<br>
     * 例如：<br>
     * keys = [a,b,c,d]<br>
     * values = [1,2,3,4]<br>
     * 则得到的Map是 {a=1, b=2, c=3, d=4}<br>
     * 如果两个数组长度不同，则只对应最短部分
     *
     * @param <K>    Key类型
     * @param <V>    Value类型
     * @param keys   键列表
     * @param values 值列表
     * @return Map
     */
    public static <K, V> Map<K, V> zip(K[] keys, V[] values) {
        if(keys == null || values == null){
            return null;
        }
        Map<K,V> result = new HashMap<>();
        int size = keys.length>values.length ? (values.length) : (keys.length);
        for(int i=0; i<size; i++){
            result.put(keys[i],values[i]);
        }
        return result;
    }
    
    
    /**
     * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param <T>   数组类型
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static <T> int indexOf(T[] array, Object value) {
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value.equals(array[i])){
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 返回数组中指定元素所在位置，忽略大小写，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int indexOfIgnoreCase(CharSequence[] array, CharSequence value) {
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value.toString().equalsIgnoreCase(array[i].toString())){
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 返回数组中指定元素所在最后的位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param <T>   数组类型
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static <T> int lastIndexOf(T[] array, Object value) {
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(array[array.length-1-i].equals(value)){
                return array.length-1-i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 数组中是否包含元素
     *
     * @param <T>   数组元素类型
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static <T> boolean contains(T[] array, T value) {
        if(array == null || value == null){
            return false;
        }
        if(value instanceof String){
            for(int i=0; i<array.length; i++){
                if(value.equals(array[i])){
                    return true;
                }
            }
        }else{
            for(int i=0; i<array.length; i++){
                if(value == array[i]){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * 数组中是否包含元素，忽略大小写
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static boolean containsIgnoreCase(CharSequence[] array, CharSequence value) {
        if(array == null || value == null){
            return false;
        }
        String s = value.toString();
        for(int i=0; i<array.length; i++){
            if(s.equalsIgnoreCase(array[i].toString())){
                return true;
            }
        }
        return false;
    }
    
    /**
     * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int indexOf(long[] array, long value) {
        //与上面的indexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[i]){
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 返回数组中指定元素所在最后的位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int lastIndexOf(long[] array, long value) {
        //与上面的lastIndexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[array.length-1-i]){
                return array.length-1-i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 数组中是否包含元素
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static boolean contains(long[] array, long value) {
        //与上面的contains实现思路一致，所以不再测试
        if(array == null){
            return false;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[i]){
                return true;
            }
        }
        return false;
    }
    
    /**
     * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int indexOf(int[] array, int value) {
        //与上面的indexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[i]){
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 返回数组中指定元素所在最后的位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int lastIndexOf(int[] array, int value) {
        //与上面的lastIndexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[array.length-1-i]){
                return array.length-1-i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 数组中是否包含元素
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static boolean contains(int[] array, int value) {
        //与上面的contains实现思路一致，所以不再测试
        if(array == null){
            return false;
        }
        for (int anArray : array) {
            if (value == anArray) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int indexOf(short[] array, short value) {
        //与上面的indexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[i]){
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 返回数组中指定元素所在最后的位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int lastIndexOf(short[] array, short value) {
        //与上面的lastIndexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[array.length-1-i]){
                return array.length-1-i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 数组中是否包含元素
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static boolean contains(short[] array, short value) {
        //与上面的contains实现思路一致，所以不再测试
        if(array == null){
            return false;
        }
        for (short anArray : array) {
            if (value == anArray) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int indexOf(char[] array, char value) {
        //与上面的indexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[i]){
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 返回数组中指定元素所在最后的位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int lastIndexOf(char[] array, char value) {
        //与上面的lastIndexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[array.length-1-i]){
                return array.length-1-i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 数组中是否包含元素
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static boolean contains(char[] array, char value) {
        //与上面的contains实现思路一致，所以不再测试
        if(array == null){
            return false;
        }
        for (char anArray : array) {
            if (value == anArray) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int indexOf(byte[] array, byte value) {
        //与上面的indexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[i]){
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 返回数组中指定元素所在最后的位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int lastIndexOf(byte[] array, byte value) {
        //与上面的lastIndexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[array.length-1-i]){
                return array.length-1-i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 数组中是否包含元素
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static boolean contains(byte[] array, byte value) {
        //与上面的contains实现思路一致，所以不再测试
        if(array == null){
            return false;
        }
        for (byte anArray : array) {
            if (value == anArray) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int indexOf(double[] array, double value) {
        //与上面的indexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[i]){
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    /**
     * 返回数组中指定元素所在最后的位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int lastIndexOf(double[] array, double value) {
        //与上面的lastIndexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[array.length-1-i]){
                return array.length-1-i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 数组中是否包含元素
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static boolean contains(double[] array, double value) {
        //与上面的contains实现思路一致，所以不再测试
        if(array == null){
            return false;
        }
        for (double anArray : array) {
            if (value == anArray) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int indexOf(float[] array, float value) {
        //与上面的indexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[i]){
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 返回数组中指定元素所在最后的位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int lastIndexOf(float[] array, float value) {
        //与上面的lastIndexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[array.length-1-i]){
                return array.length-1-i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 数组中是否包含元素
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static boolean contains(float[] array, float value) {
        //与上面的contains实现思路一致，所以不再测试
        if(array == null){
            return false;
        }
        for (float anArray : array) {
            if (value == anArray) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int indexOf(boolean[] array, boolean value) {
        //与上面的indexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[i]){
                return i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 返回数组中指定元素所在最后的位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static int lastIndexOf(boolean[] array, boolean value) {
        //与上面的lastIndexOf实现思路一致，所以不再测试
        if(array == null){
            return INDEX_NOT_FOUND;
        }
        for(int i=0; i<array.length; i++){
            if(value == array[array.length-1-i]){
                return array.length-1-i;
            }
        }
        return INDEX_NOT_FOUND;
    }
    
    /**
     * 数组中是否包含元素
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static boolean contains(boolean[] array, boolean value) {
        //与上面的contains实现思路一致，所以不再测试
        if(array == null){
            return false;
        }
        for (boolean anArray : array) {
            if (value == anArray) {
                return true;
            }
        }
        return false;
    }
    
    // ------------------------------------------------------------------- Wrap and unwrap
    
    /**
     * 将原始类型数组包装为包装类型
     *
     * @param values 原始类型数组
     * @return 包装类型数组
     */
    public static Integer[] wrap(int... values) {
        if(values == null){
            return null;
        }
        Integer[] result = new Integer[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 包装类数组转为原始类型数组
     *
     * @param values 包装类型数组
     * @return 原始类型数组
     */
    public static int[] unWrap(Integer... values) {
        if(values == null){
            return null;
        }
        int[] result = new int[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 将原始类型数组包装为包装类型
     *
     * @param values 原始类型数组
     * @return 包装类型数组
     */
    public static Long[] wrap(long... values) {
        if(values == null){
            return null;
        }
        Long[] result = new Long[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 包装类数组转为原始类型数组
     *
     * @param values 包装类型数组
     * @return 原始类型数组
     */
    public static long[] unWrap(Long... values) {
        if(values == null){
            return null;
        }
        long[] result = new long[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return null;
    }
    
    /**
     * 将原始类型数组包装为包装类型
     *
     * @param values 原始类型数组
     * @return 包装类型数组
     */
    public static Character[] wrap(char... values) {
        if(values == null){
            return null;
        }
        Character[] result = new Character[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 包装类数组转为原始类型数组
     *
     * @param values 包装类型数组
     * @return 原始类型数组
     */
    public static char[] unWrap(Character... values) {
        if(values == null){
            return null;
        }
        char[] result = new char[values.length];
        for(int i=0; i<values.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 将原始类型数组包装为包装类型
     *
     * @param values 原始类型数组
     * @return 包装类型数组
     */
    public static Byte[] wrap(byte... values) {
        if(values == null){
            return null;
        }
        Byte[] result = new Byte[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 包装类数组转为原始类型数组
     *
     * @param values 包装类型数组
     * @return 原始类型数组
     */
    public static byte[] unWrap(Byte... values) {
        if(values == null){
            return null;
        }
        byte[] result = new byte[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 将原始类型数组包装为包装类型
     *
     * @param values 原始类型数组
     * @return 包装类型数组
     */
    public static Short[] wrap(short... values) {
        if(values == null){
            return null;
        }
        Short[] result = new Short[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 包装类数组转为原始类型数组
     *
     * @param values 包装类型数组
     * @return 原始类型数组
     */
    public static short[] unWrap(Short... values) {
        if(values == null){
            return null;
        }
        short[] result = new short[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 将原始类型数组包装为包装类型
     *
     * @param values 原始类型数组
     * @return 包装类型数组
     */
    public static Float[] wrap(float... values) {
        if(values == null){
            return null;
        }
        Float[] result = new Float[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 包装类数组转为原始类型数组
     *
     * @param values 包装类型数组
     * @return 原始类型数组
     */
    public static float[] unWrap(Float... values) {
        if(values == null){
            return null;
        }
        float[] result = new float[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 将原始类型数组包装为包装类型
     *
     * @param values 原始类型数组
     * @return 包装类型数组
     */
    public static Double[] wrap(double... values) {
        if(values == null){
            return null;
        }
        Double[] result = new Double[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 包装类数组转为原始类型数组
     *
     * @param values 包装类型数组
     * @return 原始类型数组
     */
    public static double[] unWrap(Double... values) {
        if(values == null){
            return null;
        }
        double[] result = new double[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 将原始类型数组包装为包装类型
     *
     * @param values 原始类型数组
     * @return 包装类型数组
     */
    public static Boolean[] wrap(boolean... values) {
        if(values == null){
            return null;
        }
        Boolean[] result = new Boolean[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 包装类数组转为原始类型数组
     *
     * @param values 包装类型数组
     * @return 原始类型数组
     */
    public static boolean[] unWrap(Boolean... values) {
        if(values == null){
            return null;
        }
        boolean[] result = new boolean[values.length];
        for(int i=0; i<result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
    
    /**
     * 包装数组对象
     *
     * @param obj 对象，可以是对象数组或者基本类型数组
     * @return 包装类型数组或对象数组
     */
    public static Object[] wrap(Object obj) {
        //TODO
        return null;
    }
    
    /**
     * 对象是否为数组对象
     *
     * @param obj 对象
     * @return 是否为数组对象，如果为{@code null} 返回false
     */
    public static boolean isArray(Object obj) {
        //TODO
        return false;
    }
    
    /**
     * 获取数组对象中指定index的值，支持负数，例如-1表示倒数第一个值
     *
     * @param <T>   数组元素类型
     * @param array 数组对象
     * @param index 下标，支持负数
     * @return 值
     */
    @SuppressWarnings("unchecked")
    public static <T> T get(Object array, int index) {
        T[] arr = (T[])array;
        if(array == null || Math.abs(index) > arr.length){
            return null;
        }
        if(index >= 0){
            return arr[index];
        }else{
            return arr[arr.length + index];
        }
    }
    
    /**
     * 获取数组中指定多个下标元素值，组成新数组
     *
     * @param <T>     数组元素类型
     * @param array   数组
     * @param indexes 下标列表
     * @return 结果
     */
    public static <T> T[] getAny(Object array, int... indexes) {
        if(array == null || indexes.length == 0){
            return null;
        }
        T[] arr = (T[]) array;
        T[] result = arr;
        for(int i = 0; i < indexes.length; i++){
            if(indexes[i] > arr.length){
                return null;
            }
            result[i] = arr[indexes[i]];
        }
        return Arrays.copyOfRange(arr,0,indexes.length);
    }
    
    /**
     * 获取子数组
     *
     * @param array 数组
     * @param start 开始位置（包括）
     * @param end   结束位置（不包括）
     * @return 新的数组
     */
    public static Object[] sub(Object array, int start, int end) {
        if(array == null || start >= end){
            return null;
        }
        Object[] arr = (Object[]) array;
        if(start < 0 || start >= arr.length || end > arr.length + 1){
            return null;
        }
        Object[] result = new Object[end-start];
        for(int i = 0; i < result.length; i++){
            result[i] = arr[i+start];
        }
        return result;
    }
    
    /**
     * 获取子数组
     *
     * @param array 数组
     * @param start 开始位置（包括）
     * @param end   结束位置（不包括）
     * @param step  步进
     * @return 新的数组
     */
    public static Object[] sub(Object array, int start, int end, int step) {
        if(array == null || start >= end){
            return null;
        }
        Object[] arr = (Object[]) array;
        if(start < 0 || start >= arr.length || end > arr.length + 1){
            return null;
        }
        Object[] result = new Object[(end-start)/step];
        for(int i=0; i<result.length; i++){
            result[i] = arr[start + (step * i)];
        }
        return result;
    }
    
    /**
     * 数组或集合转String
     *
     * @param obj 集合或数组对象
     * @return 数组字符串，与集合转字符串格式相同
     */
    public static String toString(Object obj) {
        //TODO
        return null;
    }
    
    /**
     * 获取数组长度<br>
     * 如果参数为{@code null}，返回0
     *
     * <pre>
     * ArrayUtil.length(null)            = 0
     * ArrayUtil.length([])              = 0
     * ArrayUtil.length([null])          = 1
     * ArrayUtil.length([true, false])   = 2
     * ArrayUtil.length([1, 2, 3])       = 3
     * ArrayUtil.length(["a", "b", "c"]) = 3
     * </pre>
     *
     * @param array 数组对象
     * @return 数组长度
     * @throws IllegalArgumentException 如果参数不为数组，抛出此异常
     * @see Array#getLength(Object)
     */
    public static int length(Object array) throws IllegalArgumentException {
        //TODO
        return -1;
    }
    
    
    /**
     * 以 conjunction 为分隔符将数组转换为字符串
     *
     * @param array       数组
     * @param conjunction 分隔符
     * @return 连接后的字符串
     */
    public static String join(long[] array, CharSequence conjunction) {
        //TODO
        return null;
    }
    
    /**
     * 以 conjunction 为分隔符将数组转换为字符串
     *
     * @param array       数组
     * @param conjunction 分隔符
     * @return 连接后的字符串
     */
    public static String join(int[] array, CharSequence conjunction) {
        //TODO
        return null;
    }
    
    /**
     * 以 conjunction 为分隔符将数组转换为字符串
     *
     * @param array       数组
     * @param conjunction 分隔符
     * @return 连接后的字符串
     */
    public static String join(short[] array, CharSequence conjunction) {
        //TODO
        return null;
    }
    
    /**
     * 以 conjunction 为分隔符将数组转换为字符串
     *
     * @param array       数组
     * @param conjunction 分隔符
     * @return 连接后的字符串
     */
    public static String join(char[] array, CharSequence conjunction) {
        //TODO
        return null;
    }
    
    /**
     * 以 conjunction 为分隔符将数组转换为字符串
     *
     * @param array       数组
     * @param conjunction 分隔符
     * @return 连接后的字符串
     */
    public static String join(byte[] array, CharSequence conjunction) {
        //TODO
        return null;
    }
    
    /**
     * 以 conjunction 为分隔符将数组转换为字符串
     *
     * @param array       数组
     * @param conjunction 分隔符
     * @return 连接后的字符串
     */
    public static String join(boolean[] array, CharSequence conjunction) {
        //TODO
        return null;
    }
    
    /**
     * 以 conjunction 为分隔符将数组转换为字符串
     *
     * @param array       数组
     * @param conjunction 分隔符
     * @return 连接后的字符串
     */
    public static String join(float[] array, CharSequence conjunction) {
        //TODO
        return null;
    }
    
    /**
     * 以 conjunction 为分隔符将数组转换为字符串
     *
     * @param array       数组
     * @param conjunction 分隔符
     * @return 连接后的字符串
     */
    public static String join(double[] array, CharSequence conjunction) {
        //TODO
        return null;
    }
    
    /**
     * 以 conjunction 为分隔符将数组转换为字符串
     *
     * @param array       数组
     * @param conjunction 分隔符
     * @return 连接后的字符串
     */
    public static String join(Object array, CharSequence conjunction) {
        //TODO
        return null;
    }
    
    /**
     * {@link ByteBuffer} 转byte数组
     *
     * @param bytebuffer {@link ByteBuffer}
     * @return byte数组
     */
    public static byte[] toArray(ByteBuffer bytebuffer) {
        //TODO
        return null;
    }
    
    /**
     * 将集合转为数组
     *
     * @param <T>           数组元素类型
     * @param collection    集合
     * @param componentType 集合元素类型
     * @return 数组
     */
    public static <T> T[] toArray(Collection<T> collection, Class<T> componentType) {
        //TODO
        return null;
    }
    
    // ---------------------------------------------------------------------- remove
    
    /**
     * 移除数组中对应位置的元素<br>
     * copy from commons-lang
     *
     * @param <T>   数组元素类型
     * @param array 数组对象，可以是对象数组，也可以原始类型数组
     * @param index 位置，如果位置小于0或者大于长度，返回原数组
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] remove(T[] array, int index) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中对应位置的元素<br>
     * copy from commons-lang
     *
     * @param array 数组对象，可以是对象数组，也可以原始类型数组
     * @param index 位置，如果位置小于0或者大于长度，返回原数组
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static long[] remove(long[] array, int index) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中对应位置的元素<br>
     * copy from commons-lang
     *
     * @param array 数组对象，可以是对象数组，也可以原始类型数组
     * @param index 位置，如果位置小于0或者大于长度，返回原数组
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static int[] remove(int[] array, int index) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中对应位置的元素<br>
     * copy from commons-lang
     *
     * @param array 数组对象，可以是对象数组，也可以原始类型数组
     * @param index 位置，如果位置小于0或者大于长度，返回原数组
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static short[] remove(short[] array, int index) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中对应位置的元素<br>
     * copy from commons-lang
     *
     * @param array 数组对象，可以是对象数组，也可以原始类型数组
     * @param index 位置，如果位置小于0或者大于长度，返回原数组
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static char[] remove(char[] array, int index) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中对应位置的元素<br>
     * copy from commons-lang
     *
     * @param array 数组对象，可以是对象数组，也可以原始类型数组
     * @param index 位置，如果位置小于0或者大于长度，返回原数组
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static byte[] remove(byte[] array, int index) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中对应位置的元素<br>
     * copy from commons-lang
     *
     * @param array 数组对象，可以是对象数组，也可以原始类型数组
     * @param index 位置，如果位置小于0或者大于长度，返回原数组
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static double[] remove(double[] array, int index) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中对应位置的元素<br>
     * copy from commons-lang
     *
     * @param array 数组对象，可以是对象数组，也可以原始类型数组
     * @param index 位置，如果位置小于0或者大于长度，返回原数组
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static float[] remove(float[] array, int index) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中对应位置的元素<br>
     * copy from commons-lang
     *
     * @param array 数组对象，可以是对象数组，也可以原始类型数组
     * @param index 位置，如果位置小于0或者大于长度，返回原数组
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static boolean[] remove(boolean[] array, int index) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中对应位置的元素<br>
     * copy from commons-lang
     *
     * @param array 数组对象，可以是对象数组，也可以原始类型数组
     * @param index 位置，如果位置小于0或者大于长度，返回原数组
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static Object remove(Object array, int index) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    // ---------------------------------------------------------------------- remove
    
    /**
     * 移除数组中指定的元素<br>
     * 只会移除匹配到的第一个元素 copy from commons-lang
     *
     * @param <T>     数组元素类型
     * @param array   数组对象，可以是对象数组，也可以原始类型数组
     * @param element 要移除的元素
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static <T> T[] removeEle(T[] array, T element) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中指定的元素<br>
     * 只会移除匹配到的第一个元素 copy from commons-lang
     *
     * @param array   数组对象，可以是对象数组，也可以原始类型数组
     * @param element 要移除的元素
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static long[] removeEle(long[] array, long element) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中指定的元素<br>
     * 只会移除匹配到的第一个元素 copy from commons-lang
     *
     * @param array   数组对象，可以是对象数组，也可以原始类型数组
     * @param element 要移除的元素
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static int[] removeEle(int[] array, int element) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中指定的元素<br>
     * 只会移除匹配到的第一个元素 copy from commons-lang
     *
     * @param array   数组对象，可以是对象数组，也可以原始类型数组
     * @param element 要移除的元素
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static short[] removeEle(short[] array, short element) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中指定的元素<br>
     * 只会移除匹配到的第一个元素 copy from commons-lang
     *
     * @param array   数组对象，可以是对象数组，也可以原始类型数组
     * @param element 要移除的元素
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static char[] removeEle(char[] array, char element) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中指定的元素<br>
     * 只会移除匹配到的第一个元素 copy from commons-lang
     *
     * @param array   数组对象，可以是对象数组，也可以原始类型数组
     * @param element 要移除的元素
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static byte[] removeEle(byte[] array, byte element) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中指定的元素<br>
     * 只会移除匹配到的第一个元素 copy from commons-lang
     *
     * @param array   数组对象，可以是对象数组，也可以原始类型数组
     * @param element 要移除的元素
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static double[] removeEle(double[] array, double element) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中指定的元素<br>
     * 只会移除匹配到的第一个元素 copy from commons-lang
     *
     * @param array   数组对象，可以是对象数组，也可以原始类型数组
     * @param element 要移除的元素
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static float[] removeEle(float[] array, float element) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 移除数组中指定的元素<br>
     * 只会移除匹配到的第一个元素 copy from commons-lang
     *
     * @param array   数组对象，可以是对象数组，也可以原始类型数组
     * @param element 要移除的元素
     * @return 去掉指定元素后的新数组或原数组
     * @throws IllegalArgumentException 参数对象不为数组对象
     */
    public static boolean[] removeEle(boolean[] array, boolean element) throws IllegalArgumentException {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param <T>                 数组元素类型
     * @param array               数组，会变更
     * @param startIndexInclusive 其实位置（包含）
     * @param endIndexExclusive   结束位置（不包含）
     * @return 变更后的原数组
     */
    public static <T> T[] reverse(final T[] array, final int startIndexInclusive, final int endIndexExclusive) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param <T>   数组元素类型
     * @param array 数组，会变更
     * @return 变更后的原数组
     */
    public static <T> T[] reverse(final T[] array) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array               数组，会变更
     * @param startIndexInclusive 其实位置（包含）
     * @param endIndexExclusive   结束位置（不包含）
     * @return 变更后的原数组
     */
    public static long[] reverse(final long[] array, final int startIndexInclusive, final int endIndexExclusive) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array 数组，会变更
     * @return 变更后的原数组
     */
    public static long[] reverse(final long[] array) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array               数组，会变更
     * @param startIndexInclusive 其实位置（包含）
     * @param endIndexExclusive   结束位置（不包含）
     * @return 变更后的原数组
     */
    public static int[] reverse(final int[] array, final int startIndexInclusive, final int endIndexExclusive) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array 数组，会变更
     * @return 变更后的原数组
     */
    public static int[] reverse(final int[] array) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array               数组，会变更
     * @param startIndexInclusive 其实位置（包含）
     * @param endIndexExclusive   结束位置（不包含）
     * @return 变更后的原数组
     */
    public static short[] reverse(final short[] array, final int startIndexInclusive, final int endIndexExclusive) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array 数组，会变更
     * @return 变更后的原数组
     */
    public static short[] reverse(final short[] array) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array               数组，会变更
     * @param startIndexInclusive 其实位置（包含）
     * @param endIndexExclusive   结束位置（不包含）
     * @return 变更后的原数组
     */
    public static char[] reverse(final char[] array, final int startIndexInclusive, final int endIndexExclusive) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array 数组，会变更
     * @return 变更后的原数组
     */
    public static char[] reverse(final char[] array) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array               数组，会变更
     * @param startIndexInclusive 其实位置（包含）
     * @param endIndexExclusive   结束位置（不包含）
     * @return 变更后的原数组
     */
    public static byte[] reverse(final byte[] array, final int startIndexInclusive, final int endIndexExclusive) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array 数组，会变更
     * @return 变更后的原数组
     */
    public static byte[] reverse(final byte[] array) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array               数组，会变更
     * @param startIndexInclusive 其实位置（包含）
     * @param endIndexExclusive   结束位置（不包含）
     * @return 变更后的原数组
     */
    public static double[] reverse(final double[] array, final int startIndexInclusive, final int endIndexExclusive) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array 数组，会变更
     * @return 变更后的原数组
     */
    public static double[] reverse(final double[] array) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array               数组，会变更
     * @param startIndexInclusive 其实位置（包含）
     * @param endIndexExclusive   结束位置（不包含）
     * @return 变更后的原数组
     */
    public static float[] reverse(final float[] array, final int startIndexInclusive, final int endIndexExclusive) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array 数组，会变更
     * @return 变更后的原数组
     */
    public static float[] reverse(final float[] array) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array               数组，会变更
     * @param startIndexInclusive 其实位置（包含）
     * @param endIndexExclusive   结束位置（不包含）
     * @return 变更后的原数组
     */
    public static boolean[] reverse(final boolean[] array, final int startIndexInclusive, final int endIndexExclusive) {
        //TODO
        return null;
    }
    
    /**
     * 反转数组，会变更原数组
     *
     * @param array 数组，会变更
     * @return 变更后的原数组
     */
    public static boolean[] reverse(final boolean[] array) {
        //TODO
        return null;
    }
    
    /**
     * 取最小值
     *
     * @param <T>         元素类型
     * @param numberArray 数字数组
     * @return 最小值
     */
    public static <T extends Comparable<? super T>> T min(T[] numberArray) {
        //TODO
        return null;
    }
    
    /**
     * 取最小值
     *
     * @param numberArray 数字数组
     * @return 最小值
     */
    public static long min(long... numberArray) {
        //TODO
        return -1L;
    }
    
    /**
     * 取最小值
     *
     * @param numberArray 数字数组
     * @return 最小值
     */
    public static int min(int... numberArray) {
        //TODO
        return -1;
    }
    
    /**
     * 取最小值
     *
     * @param numberArray 数字数组
     * @return 最小值
     */
    public static short min(short... numberArray) {
        //TODO
        return -1;
    }
    
    /**
     * 取最小值
     *
     * @param numberArray 数字数组
     * @return 最小值
     */
    public static char min(char... numberArray) {
        //TODO
        return '0';
    }
    
    /**
     * 取最小值
     *
     * @param numberArray 数字数组
     * @return 最小值
     */
    public static byte min(byte... numberArray) {
        //TODO
        return -1;
    }
    
    /**
     * 取最小值
     *
     * @param numberArray 数字数组
     * @return 最小值
     */
    public static double min(double... numberArray) {
        //TODO
        return -1D;
    }
    
    /**
     * 取最小值
     *
     * @param numberArray 数字数组
     * @return 最小值
     */
    public static float min(float... numberArray) {
        //TODO
        return -1F;
    }
    
    /**
     * 取最大值
     *
     * @param <T>         元素类型
     * @param numberArray 数字数组
     * @return 最大值
     */
    public static <T extends Comparable<? super T>> T max(T[] numberArray) {
        //TODO
        return null;
    }
    
    /**
     * 取最大值
     *
     * @param numberArray 数字数组
     * @return 最大值
     */
    public static long max(long... numberArray) {
        //TODO
        return -1L;
    }
    
    /**
     * 取最大值
     *
     * @param numberArray 数字数组
     * @return 最大值
     */
    public static int max(int... numberArray) {
        //TODO
        return -1;
    }
    
    /**
     * 取最大值
     *
     * @param numberArray 数字数组
     * @return 最大值
     */
    public static short max(short... numberArray) {
        //TODO
        return -1;
    }
    
    /**
     * 取最大值
     *
     * @param numberArray 数字数组
     * @return 最大值
     */
    public static char max(char... numberArray) {
        //TODO
        return '0';
    }
    
    /**
     * 取最大值
     *
     * @param numberArray 数字数组
     * @return 最大值
     */
    public static byte max(byte... numberArray) {
        //TODO
        return -1;
    }
    
    /**
     * 取最大值
     *
     * @param numberArray 数字数组
     * @return 最大值
     */
    public static double max(double... numberArray) {
        //TODO
        return -1D;
    }
    
    /**
     * 取最大值
     *
     * @param numberArray 数字数组
     * @return 最大值
     */
    public static float max(float... numberArray) {
        //TODO
        return -1F;
    }
    
    /**
     * 交换数组中两个位置的值
     *
     * @param array  数组
     * @param index1 位置1
     * @param index2 位置2
     * @return 交换后的数组，与传入数组为同一对象
     */
    public static int[] swap(int[] array, int index1, int index2) {
        //TODO
        return null;
    }
    
    /**
     * 交换数组中两个位置的值
     *
     * @param array  数组
     * @param index1 位置1
     * @param index2 位置2
     * @return 交换后的数组，与传入数组为同一对象
     */
    public static long[] swap(long[] array, int index1, int index2) {
        //TODO
        return null;
    }
    
    /**
     * 交换数组中两个位置的值
     *
     * @param array  数组
     * @param index1 位置1
     * @param index2 位置2
     * @return 交换后的数组，与传入数组为同一对象
     */
    public static double[] swap(double[] array, int index1, int index2) {
        //TODO
        return null;
    }
    
    /**
     * 交换数组中两个位置的值
     *
     * @param array  数组
     * @param index1 位置1
     * @param index2 位置2
     * @return 交换后的数组，与传入数组为同一对象
     */
    public static float[] swap(float[] array, int index1, int index2) {
        //TODO
        return null;
    }
    
    /**
     * 交换数组中两个位置的值
     *
     * @param array  数组
     * @param index1 位置1
     * @param index2 位置2
     * @return 交换后的数组，与传入数组为同一对象
     */
    public static boolean[] swap(boolean[] array, int index1, int index2) {
        //TODO
        return null;
    }
    
    /**
     * 交换数组中两个位置的值
     *
     * @param array  数组
     * @param index1 位置1
     * @param index2 位置2
     * @return 交换后的数组，与传入数组为同一对象
     */
    public static byte[] swap(byte[] array, int index1, int index2) {
        //TODO
        return null;
    }
    
    /**
     * 交换数组中两个位置的值
     *
     * @param array  数组
     * @param index1 位置1
     * @param index2 位置2
     * @return 交换后的数组，与传入数组为同一对象
     */
    public static char[] swap(char[] array, int index1, int index2) {
        //TODO
        return null;
    }
    
    /**
     * 交换数组中两个位置的值
     *
     * @param array  数组
     * @param index1 位置1
     * @param index2 位置2
     * @return 交换后的数组，与传入数组为同一对象
     */
    public static short[] swap(short[] array, int index1, int index2) {
        //TODO
        return null;
    }
    
    /**
     * 交换数组中两个位置的值
     *
     * @param <T>    元素类型
     * @param array  数组
     * @param index1 位置1
     * @param index2 位置2
     * @return 交换后的数组，与传入数组为同一对象
     */
    public static <T> T[] swap(T[] array, int index1, int index2) {
        //TODO
        return null;
    }
    
    /**
     * 交换数组中两个位置的值
     *
     * @param array  数组对象
     * @param index1 位置1
     * @param index2 位置2
     * @return 交换后的数组，与传入数组为同一对象
     */
    public static Object swap(Object array, int index1, int index2) {
        //TODO
        return null;
    }
}
