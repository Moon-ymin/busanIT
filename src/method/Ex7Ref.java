package method;

import java.util.Scanner;

public class Ex7Ref {
    public static void main(String[] args) {
        // 단어 목록에서 무작위로 선택될 단어들
        String[] words = {"java", "computer", "program", "kotlin", "game"};
        // 선택된 단어
        String selectedWord = words[(int) (Math.random() * words.length)];
        // 플레이어에게 보여줄 단어의 형태 ('_'로 가려진 형태)
        char[] displayArray = new char[selectedWord.length()];
        for (int i = 0; i < displayArray.length; i++) {
            displayArray[i] = '_';  // 기본값으로 '_' 가 주어진다.
        }

        int tries = 0; // 사용자가 시도한 횟수
        final int MAX_TRIES = 7; // 최대 시도 횟수
        Scanner scanner = new Scanner(System.in);
        boolean wordCompleted = false;


        while (tries < MAX_TRIES) {
            System.out.print("단어 추측: ");
            printDisplayArray(displayArray); // 현재까지 맞춘 단어의 상태 출력하는 메서드
            String guess = scanner.nextLine();  // 사용자로부터 글자 추측 받기
            if (guess.length() != 1) {
                System.out.println("한 글자만 입력해주세요.");
                continue;
            }
            char guessLetter = guess.charAt(0);  // 추측한 글자
            boolean isCorrectGuess = false; // 글자가 정답에 포함되어 있는지 여부

            // 추측한 글자 처리 로직 구현
            // 선택된 단어를 순회하며 추측한 글자가 있는지 확인
            for (int i = 0; i < selectedWord.length(); i++) {
                if (selectedWord.charAt(i) == guessLetter) {
                    displayArray[i] = guessLetter;
                    isCorrectGuess = true;
                }
            }

            // 틀렸을 경우
            if (!isCorrectGuess) {
                tries++; //  시도회수를 증가시킨다.
                System.out.println("없는 글자입니다. 남은시도는 " + (MAX_TRIES - tries));
            }

            // 게임 종료 조건 검사 및 게임 결과 출력
            wordCompleted = isWordCompleted(displayArray);
        }

        // 게임 종료 후 정답 단어와 승리 또는 패배 메시지 출력
        if (wordCompleted) {
            System.out.println("축하합니다");
        } else  {
            System.out.println("틀렸습니다. 정답은"+ selectedWord);
        }
    }


    // 현재까지 맞춘 단어의 상태를 출력하는 메서드
    private static void printDisplayArray(char[] displayArray) {
        // {'j', '_', '_', '_'}
        for (char c : displayArray) {
            System.out.print(c + " "); // j _ _ _
        }
        System.out.println();   // 행 변경
    }

    // 단어가 모두 맞춰졌는지 확인하는 메서드
    private static boolean isWordCompleted(char[] displayArray) {
        for (char c : displayArray) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
