package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127;
        short s = 32767;
        int i = 2147483647; // (약 20억)

        long l = 43141231412343214L;

        //실수
        float f = 10.0f;
        double d = 10.0;

        /**
         * 실무에서 잘 안쓰는 변수 타입
         * byte 대신 int 사용하자
         * short 표현 길이가 너무 작다 int 사용하자
         * float 표현 길이 정밀도가 낮다 실수형은 double 을 사용하자
         * char 문자 하나를 표현하는 일은 거의 없다.
         *
         * 자주 사용하는 타입
         * 정리 int double 말곤 사용하는 일 거의 없다.
         * boolean String 이것도 자주 쓴다.
         */
    }
}
