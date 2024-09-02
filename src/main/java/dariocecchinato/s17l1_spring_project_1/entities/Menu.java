package dariocecchinato.s17l1_spring_project_1.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuData> datas;

    public Menu() {
        this.datas = new ArrayList<>();
    }

    public void addData(MenuData data){
        this.datas.add(data);
    }

    @Override
    public String toString() {
        return "Menu" + datas;
    }
}
