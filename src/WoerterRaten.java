import javax.swing.*;

public class WoerterRaten {
    public static void main(String[] args) {
        boolean wid = true;
        while (wid == true) {
            wid = false;
            String zuerraten = JOptionPane.showInputDialog("Das zu erratende Wort eingeben");
            char[] ZuerratenC = zuerraten.toCharArray();
            char[] output = new char[ZuerratenC.length];

            for (int i = 0; i < output.length; i++) {
                output[i] = '*';
            }
            boolean erraten = false;
            int versuche = 0;

            while (erraten == false) {
                versuche++;
                outputarr(output);
                char[] input = JOptionPane.showInputDialog("Bitte das Wort Erraten!").toCharArray();

                for (int i = 0; i < ZuerratenC.length; i++) {
                    for (int j = 0; j < input.length; j++) {
                        if (ZuerratenC[i] == input[j]) {
                            output[i] = input[j];
                        }
                    }
                }
                erraten = fertig(output, ZuerratenC);
            }
            outputarr(output);
            JOptionPane.showMessageDialog(null,"Das Wort <" + zuerraten + "> wurde nach " + versuche + ". Versuchen erraten ");
            int inputms = JOptionPane.showConfirmDialog(null, "Wiederholen?");

            if(inputms == 0){
                wid = true;
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

    public static boolean fertig(char output [], char input []) {
        int count = 0;
        for (int i = 0; i < output.length; i++) {
            if (output[i] == input[i]){
                count ++;
            }
        }
        if(count == output.length){
            return true;
        }
        return false;
    }
}
//by christopher