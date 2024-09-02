package dariocecchinato.s17l1_spring_project_1.entities;

public class Bevande extends MenuData {

    public Bevande(String nome, double prezzo, int valoriNutrizionali) {
        super(nome, prezzo, valoriNutrizionali);
    }

    @Override
    public String toString() {
        return getNome()+ " "+ getPrezzo() + " " + getValoriNutrizionali();
    }
}
