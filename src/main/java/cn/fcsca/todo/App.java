package cn.fcsca.todo;

import java.util.Scanner;

/**
 * App
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 22:13 2018-09-04
 */
public class App {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++i > 0) {
            System.out.println(i + ".please input todo item name :");
            ToDoItem item = new ToDoItem(scanner.nextLine());
            System.out.println(item);
        }
    }
}
