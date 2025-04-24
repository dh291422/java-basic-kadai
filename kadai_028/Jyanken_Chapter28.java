package kadai_028;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, String> hands = new HashMap<>();

    public Jyanken_Chapter28() {
        hands.put("r", "グー");
        hands.put("s", "チョキ");
        hands.put("p", "パー");
    }

    public String getMyChoice() {
        String choice;
        while (true) {
            System.out.println("自分のじゃんけんの手を入力しましょう");
            System.out.println("グーはrockのrを入力しましょう");
            System.out.println("チョキはscissorsのsを入力しましょう");
            System.out.println("パーはpaperのpを入力しましょう");
            choice = scanner.nextLine().toLowerCase();

            if (hands.containsKey(choice)) {
                return choice;
            } else {
                System.out.println("");
            }
        }
    }

    public String getRandom() {
        String[] keys = {"r", "s", "p"};
        int index = (int) Math.floor(Math.random() * 3);
        return keys[index];
    }

    public void playGame(String myChoice, String opponentChoice) {
        String myHand = hands.get(myChoice);
        String opponentHand = hands.get(opponentChoice);

        System.out.printf("自分の手は%s, 対戦相手の手は%s\n", myHand, opponentHand);

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if (
                (myChoice.equals("r") && opponentChoice.equals("s")) ||
                (myChoice.equals("s") && opponentChoice.equals("p")) ||
                (myChoice.equals("p") && opponentChoice.equals("r"))
        ) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
