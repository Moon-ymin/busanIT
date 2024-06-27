package method;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        // 단어 목록에서 무작위로 선택될 단어들
        String[] words = {"java", "computer", "program", "kotlin", "game"};
        // 선택된 단어, 랜덤함수 사용
        String selectedWord = words[(int) (Math.random() * words.length)];
        // 플레이어에게 보여줄 단어의 형태 ('_'로 가려진 형태)
        char[] displayArray = new char[selectedWord.length()];
        System.out.println("행맨 게임을 시작합니다!");
        for (int i = 0; i < displayArray.length; i++) {
//            System.out.println(selectedWord);
            displayArray[i] = '_';

            int tries = 0; // 사용자가 시도한 횟수
            final int MAX_TRIES = 7; // 최대 시도 횟수
            Scanner scanner = new Scanner(System.in);

            while (tries < MAX_TRIES) {
                System.out.print("단어 추측: ");
                printDisplayArray(displayArray); // 현재까지 맞춘 단어의 상태 출력하는 메서드
                String guess = scanner.nextLine();  // 사용자로부터 글자 추측 받기
                if (guess.length() != 1) {
                    System.out.println("한 글자만 입력해주세요.");
                    continue;
                }
                char guessLetter = guess.charAt(0);  // 추측한 글자
//                System.out.println(guessLetter);
                boolean isCorrectGuess = false; // 글자가 정답에 포함되어 있는지 여부

                // 추측한 글자 처리 로직 구현
                // 선택된 단어를 순회하며 추측한 글자가 있는지 확인
                for( int j=0; j<selectedWord.length(); j++ ) {
                    if ( selectedWord.charAt(j) == guessLetter ) {
                        isCorrectGuess = true;
                        displayArray[j] = guessLetter;
                    }
                }

                if(isCorrectGuess == true) {
                    System.out.println(guessLetter);
                } else {
                    System.out.print(guessLetter+"는 없는 글자입니다.");
                    tries++;
                    System.out.println("남은 시도: "+ (MAX_TRIES-tries));
                }


                // 게임 종료 조건 검사 및 게임 결과 출력
                boolean isFinish = isWordCompleted( displayArray, selectedWord);
                if (isFinish == true) {
                    break;
                }
            }

            // 게임 종료 후 정답 단어와 승리 또는 패배 메시지 출력
            if ( tries >= MAX_TRIES ) {
                System.out.println("아쉽습니다. 정답은 '"+selectedWord+"'였습니다.");
                break;
            } else {
                System.out.println("정답입니다!!!");
                break;
            }
        }


    }

    // 현재까지 맞춘 단어의 상태를 출력하는 메서드
    private static void printDisplayArray(char[] displayArray) {
        for( char c : displayArray ){
            System.out.print(c+" ");
        }
    }

    // 단어가 모두 맞춰졌는지 확인하는 메서드
    private static boolean isWordCompleted(char[] displayArray, String selectedWord) {
        String s = "";
        for( int i=0; i<displayArray.length; i++)  {
            s = s + displayArray[i];
        }
        boolean isFinish = ( s.equals(selectedWord) ? true : false);
        return isFinish;
    }

}