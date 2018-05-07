

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            FizzerBuzzer(i , true);
        }
        System.out.println("_______________");
        for (int i = 0; i < 100; i += 4) {
            FizzerBuzzer(i , false);
        }
    }
    public static void FizzerBuzzer(int i, boolean showFB){
        if(i % 4 == 0 && i % 7 == 0 && showFB == true){
            System.out.println("FizzerBuzzer(" + i +")");
        }else if (i % 4 == 0) {
            System.out.println("Fizzer (" + i +")");
        }else if (i % 7 == 0){
            System.out.println("Buzzer (" + i +")");
        }else{
            System.out.println(i);
        }
    }
}

