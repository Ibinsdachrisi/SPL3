import javax.swing.*;

public class Schaltjahr {
    public static void main(String[] args) {
        int jahr = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie ein Jahr ein"));
        System.out.println(tester(jahr));
        if(tester(jahr) == true){
            JOptionPane.showMessageDialog(null, jahr + " war/ist/wird ein Schaltjahr");
        }else{
            JOptionPane.showMessageDialog(null, jahr + " war/ist/wird kein Schaltjahr");
        }
    }
    public static boolean tester(int jahr){
        boolean SchalJ = false;
        if(jahr % 4 == 0) {
            if(jahr % 100 != 0){
                return true;
            }else if(jahr % 400 == 0){
                return true;
            }else{
                return false;
            }
        }
        return false;

    }
}
