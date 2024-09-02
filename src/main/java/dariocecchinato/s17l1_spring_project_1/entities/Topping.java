package dariocecchinato.s17l1_spring_project_1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
public class Topping {
    private String nome;
    private double price;
    private int valoriNutrizionali;

    @Override
    public String toString() {
        return
                nome +
                " - price=" + price + "Eur"+
                " - valoriNutrizionali " + valoriNutrizionali + " cal "
                ;
    }
}
