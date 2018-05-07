

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            FizzerBuzzer(i);
        }
    }
    public static void FizzerBuzzer(int i){
        if(i % 4 == 0 && i % 7 == 0){
            System.out.println("FizzerBuzzer");
        }else if (i % 4 == 0) {
            System.out.println("Fizzer");
        }else if (i % 7 == 0){
            System.out.println("Buzzer");
        }else{
            System.out.println(i);
        }
    }
}

