package edu.berkeley;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName ListTest
 * @Description
 * @Author DaHuangGo
 * @Date 2023/11/11 14:30
 * @Version 0.0.1
 **/
public class ListTest {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = Arrays.stream(data).boxed().collect(Collectors.toList());
        System.out.println(list.subList(0, 3));
        System.out.println(list.subList(3, list.size()));
    }
}
