package org.slashschool;

import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println("Benvenuto nella classe Main del Corso Java!");

        //VARIABILI
        int qta = 5;                    //int(32764) come 5 -> double(1200000) come 5.5 -> float(30000000) 10.5
        double prezzo = 49.99;          //double => intero + decimale
        double totale = prezzo * qta;   //operazione matematica => * / + - ( )

        DecimalFormat decForm = new DecimalFormat("0.00");      //fa 2 cose => 1a -> formatta con 2 decimali, 2a la virgola x decimali e punto per migliaia
        String totale_str = decForm.format(totale);        //249,95
        String prezzo_str = decForm.format(prezzo);        //49,99

        IO.println("qta: " + qta);
        IO.println("prezzo: " + prezzo_str + " €");
        IO.println("totale: " + totale_str + " €");

        boolean haVotato = false;       //true/false -> 1/0 -> on/off ->
    }
}
