package controller;

public class DemoController {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoController{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public DemoController(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
