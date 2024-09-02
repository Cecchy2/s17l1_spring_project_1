package dariocecchinato.s17l1_spring_project_1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class MenuData {
    private String nome;
    private double prezzo;
    private int valoriNutrizionali;

    @Override
    public String toString() {
        return
                " nome " + nome +
                " prezzo " + prezzo +
                " valoriNutrizionali " + valoriNutrizionali;
    }
}
