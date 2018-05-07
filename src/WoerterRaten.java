import javax.swing.*;

public class WoerterRaten {
    public static void main(String[] args) {
        String zuerraten = JOptionPane.showInputDialog("Das zu erratende Wort eingeben");
        char[] ZuerratenC = zuerraten.toCharArray();
        char[] output = new char[ZuerratenC.length];

        for (int i = 0; i < output.length; i++) {
            output[i] = '*';
        }
        boolean erraten = false;

        while(erraten == false){
            outputarr(output);
            char[] input = JOptionPane.showInputDialog("Bitte das Wort Erraten!").toCharArray();

            for (int i = 0; i < ZuerratenC.length; i++) {
                for (int j = 0; j < input.length; j++) {
                    if(ZuerratenC[i] == input[j]){
                        output[i] = input[j];
                    }
                }
            }
            
        }


    }

    //

    public static void outputarr(char [] output) {
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();
    }
}
