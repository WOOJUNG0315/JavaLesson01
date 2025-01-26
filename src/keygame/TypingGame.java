package keygame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TypingGame {
    public static final int TEXT_FIELD_HEIGHT = 30;
    public static final int WINDOW_WIDTH = 640;
    public static final int WINDOW_HEIGHT = 480;
    public static final int CREATION_DELAY = 3000;

    public static void main(String[] args) {
        // 윈도우 프레임 생성
        JFrame frame = new JFrame("타자 연습기");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // x버튼을 클릭했을 때 Application을 종료시킴
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);    // 윈도우의 기본 넓이와 높이를 초기 지정함
        frame.setResizable(false);  // 윈도우의 크기를 고정시킴 true->크기 변환 가능
        frame.setLayout(null);  // swing library 에서 제공하는 레이아웃 규칙을 사용하지 않음
//        frame.getContentPane().setBackground(Color.WHITE);
        frame.getContentPane().setBackground(new Color(3, 6, 33));

        // 텍스트 입력창 생성 및 배치(가장 아래쪽에 넓이만큼 꽉 채워서...)
        JTextField textField = new JTextField();
        frame.add(textField);   // frame(부모 윈도우)에 텍스트 입력창을 추가시킴

        // WordManager 객체를 생성함
        WordManager wordManager = new WordManager(frame);
        wordManager.initWords("세종대왕 한글 영어 아무거나 자바 프로그램 어플리케이션 우리집 학원 공부");

        // 텍스트 입력창 키 입력 이벤트 처리하기
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 키입력 이벤트가 발생되었을 때...
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // 엔터키가 눌렸을 때만 처리함
                    wordManager.removeWord(textField.getText());

                    System.out.println("KeyAdapter.keyPressed :: " + textField.getText());
                    textField.setText("");  // 텍스트 입력창 클리어(지우기)
                }
            }
        });

        // 프레임의 크기 조정이 완료되면 텍스트 입력창 등 내부 컴포넌트들의 위치를 재조정함
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Insets insets = frame.getInsets();
                textField.setBounds(0, frame.getHeight()-TEXT_FIELD_HEIGHT-insets.top, frame.getWidth(), TEXT_FIELD_HEIGHT);
                textField.requestFocusInWindow();   // 텍스트 입력창에 포커싱을 설정함
//                System.out.println("ComponentAdapter.componentResized :: 텍스트 입력창 위치 조정");
            }
        });

        // Timer를 생성하여 주기적으로 FallingWord 객체를 생성시킨다.
        Timer timer = new Timer(CREATION_DELAY, (event)-> {
            // 문자열을 생성한다(나중에 추가하기로 함)
            wordManager.addWord("Hello");
        });
        timer.start();


        // 주기적인 정리 작업
        Timer cleanupTimer = new Timer(1000, (event)->{
            wordManager.cleanup();
        });
        cleanupTimer.start();

        // 게임 종료를 체크하는 타이머를 생성
        Timer timerGameCheck = new Timer(1000, (event)->{
            if(wordManager.getFallen() >= 10) {
                timer.stop();
                // 게임 종료에 관한 처리들...
                // ...
            }
        });
        // timerGameCheck.start();

        // 윈도우를 보여준다.
        frame.setVisible(true);
    }

    public void gameStop() {

    }
}
