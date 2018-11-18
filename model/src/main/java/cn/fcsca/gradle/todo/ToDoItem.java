package cn.fcsca.gradle.todo;

/**
 * ToDoItem
 *
 * @author Fcscanf@樊乘乘
 * @description
 * @date 下午 22:11 2018-09-04
 */
public class ToDoItem {

    private String name;
    private boolean hasDone;

    public ToDoItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDone() {
        return hasDone;
    }

    public void setHasDone(boolean hasDone) {
        this.hasDone = hasDone;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "name='" + name + '\'' +
                ", hasDone=" + hasDone +
                '}';
    }
}
