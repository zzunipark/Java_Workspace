public class NumberType {
    public static void main(String[] args) {
        // 소리가 1시간 동안 가는 거리 계산
        double soundSpeed = 343; // 소리의 속도 (m/s)
        double time = 60 * 60; // 시간 (초)
        double distance = soundSpeed * time;

        // 반지름이 10.0인 원의 넓이 계산
        double radius = 10.0;
        double area = Math.PI * Math.pow(radius, 2);

        // 결과 출력
        System.out.println("1시간 동안 소리가 가는 거리: " + distance + " 미터");
        System.out.println("반지름이 10.0인 원의 넓이: " + area + " 제곱미터");
    }
}
