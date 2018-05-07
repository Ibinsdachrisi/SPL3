public class Unterprogramme {
    public static void main(String[] args) {
        String text = "Heute ist ein schöner Tag.";

        System.out.println("Es gibt " + Suchen(text, 'e') + " e's");
        System.out.println("Es gibt " + Suchen(text, 'i') + " i's");
        System.out.println("Es gibt " + Suchen(text, 'a') + " a's");
        System.out.println("Es gibt " + Suchen(text, 'ä') + " ä's");

    }
    public static int Suchen(String text, char suche){
        char [] textC = text.toCharArray();
        int ret = 0;
        for (int i = 0; i < textC.length; i++) {
            if(textC[i] == suche){
                ret++;
            }
        }

        return ret;
    }
}
