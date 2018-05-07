public class TemperaturMittelwert {
    public static void main(String[] args) {
        int[] temp = new int[1000];
        //0 - 40 C°

        for (int i = 0; i < temp.length; i++) {

            temp[i] = (int) ((Math.random()*41));
            System.out.println(temp[i]);
        }

        int unter10 = 0;
        int unter20 = 0;
        int unter30 = 0;
        int unter40 = 0;

        for (int i = 0; i < temp.length; i++) {
            if(temp[i] <= 10){
                unter10++;
            }else if(temp[i]<= 20 && temp[i] > 10){
                unter20++;
            }else if(temp[i]<= 30 && temp[i] > 20){
                unter30++;
            }else if(temp[i]<= 40 && temp[i] > 30){
                unter40++;
            }
        }
        System.out.println("_____");
        System.out.println(unter10);
        System.out.println(unter20);
        System.out.println(unter30);
        System.out.println(unter40);
        System.out.println("_____");
        System.out.println(unter10+unter20+unter30+unter40);
    }
}