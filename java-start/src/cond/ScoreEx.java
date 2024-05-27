package cond;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 90;

        if(score >= 90) {
            System.out.println("학점은 a입니다");
        } else if (score >= 80) {
            System.out.println("학점은 b입니다");
        }else if (score >= 70) {
            System.out.println("학점은 c입니다");
        }else if (score >= 60) {
            System.out.println("학점은 d입니다");
        }else if (score >= 50) {
            System.out.println("학점은 e입니다");
        }

    }
}
