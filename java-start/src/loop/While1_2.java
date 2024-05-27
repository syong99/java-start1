package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        //count = 1 count = 2 count = 3  참일경우 코드 재실행 거짓일경우 코드가 종료된다.
        while (count < 3){
            count = count + 1;
            System.out.println("현재 숫자는" + count);
        }
    }
}
