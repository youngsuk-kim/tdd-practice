package racingcar;

import java.util.Scanner;

public class RacingCarGame {
    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        Scanner in = new Scanner(System.in);
        Cars cars = Cars.createCarWith(NameParser.parse(in.next()));

        System.out.println("시도할 회수는 몇회인가요?");
        int count = in.nextInt();

        System.out.println("실행 결과");
        System.out.print(String.join(", ", Winner.find(cars.moveMultiple(count))));
        System.out.println("가 최종 우승 했습니다.");
    }
}
