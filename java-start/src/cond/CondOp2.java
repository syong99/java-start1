package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자"; //참 앞 거짓 뒤
        System.out.println("age = " + age + " status = " +status);
    }
}
