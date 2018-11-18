package cn.fcsca.gradle.todo;
import java.util.HashMap;
import java.util.Map;

/**
 * ToDoRepository
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 上午 0:12 2018-09-05
 */
public class ToDoRepository {
    private static Map<String, ToDoItem> itemMap = new HashMap<>();

    /**
     * 保存待办事项 
     *
     * @param item
     * @return 
     * @author Fcscanf@樊乘乘
     * @date 上午 0:15 2018-09-05 
     */
    public void save(ToDoItem item) {
        System.out.println("" + item);
        itemMap.put(item.getName(), item);
    }
}
