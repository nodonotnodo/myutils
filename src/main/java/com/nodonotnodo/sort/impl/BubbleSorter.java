package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;
import com.nodonotnodo.sort.Sorter;

/**
 * 冒泡排序  样例实现
 * <p>
 * Author: nodonotnodo
 * Created: 2018/10/13
 */
public class BubbleSorter implements Sorter {
    
//    @Override
//    public void sort(Element[] elements) {
//        for (int i = 0; i < elements.length - 1; i++) {
//            boolean flag = false;
//            //如果j索引处的元素大于j+1索引处的元素，进行交换
//            for (int j = 0; j < elements.length - 1 - i; j++) {
//                if (elements[j].compareTo(elements[j + 1]) > 0) {
//                    Element temp = elements[j];
//                    elements[j] = elements[j + 1];
//                    elements[j + 1] = temp;
//                    flag = true;
//                }
//            }
//            //如果某趟没有发生交换，则表明已处于有序状态
//            if (!flag) {
//                break;
//            }
//        }
//    }


    @Override
    public void sort(Element[] elements){
        for(int i = 0; i<elements.length-1; i++){
            boolean flag = false;
            for(int j = 0; j<elements.length-1-i; j++){
                //元素比较，升序排序
                if(elements[j].compareTo(elements[j+1])>0){
                    Element tmp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = tmp;
                    flag = true;
                }
            }
            //此时数组已经有序
            if(!flag){
                break;
            }
        }
    }


}
