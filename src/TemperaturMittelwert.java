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
        int zw;
        for (int i = 0; i < temp.length; i++) {
            zw = TemperaturWert(temp[i]);
            if(zw == 1){
                unter10++;
            }else if(zw == 2){
                unter20++;
            }else if(zw == 3){
                unter30++;
            }else if(zw == 4){
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
    public static int TemperaturWert(int temp){
        int unter = 0;

            if(temp <= 10){
                unter = 1;
            }else if(temp<= 20 && temp > 10){
                unter = 2;
            }else if(temp<= 30 && temp > 20){
                unter = 3;
            }else if(temp<= 40 && temp > 30){
                unter = 4;
            }
        return unter;
    }
}