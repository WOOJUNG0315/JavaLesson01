package keygame;

import javax.swing.*;
import java.awt.*;

public class FallingWord extends JLabel implements Runnable {
    private final int speed;    // 떨어지는 속도값
    private final int x;    // 초기 x좌표(x좌표는 변경하지 않음)
    private int y;          // 0위치에서 시작하여 아래쪽으로 계속 증가시킬 값
    private boolean running;    // running이 true인 동안 떨어지는 Thread를 동작시킴
    private final JFrame frame;
    private final WordManager wm;

    public FallingWord(String word, int speed, JFrame parent, WordManager wm) {
        setText(word);
        setForeground(Color.WHITE);
        setSize(getPreferredSize());    // 설정된 단어의 길이만큼 넓이를 설정한다.

        this.speed = speed;
        this.frame = parent;
        int tmp = (int)((TypingGame.WINDOW_WIDTH-(getWidth()+10)) * Math.random());
        x = Math.max(tmp, 0);
        y = 0;
        running = true;

        frame.add(this);
        setLocation(x, y);  // 초기 위치를 지정한다.
        this.wm = wm;
    }

    @Override
    public void run() {
        try {
            while (running && y < TypingGame.WINDOW_HEIGHT) {
                y += speed;     // y위치를 계속 증가시킴
                setLocation(x, y);  // FallingWord 컴포넌트의 위치를 갱신함
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            // FallingWord를 제거함
            wm.addFallen();
            destroy();
        }
    }

    public void destroy() {
        running = false;
        SwingUtilities.invokeLater(()->{
            frame.remove(this);     // frame윈도우에서 해당 FallingWord 컴포넌트를 제거함
            frame.repaint();    // 윈도우 갱신
            System.out.println(getText() + "::FallingWord 객체가 제거됨");
        });
    }

    // Thread 동작 여부를 확인함
    public boolean isRunning() {
        return running;
    }
}
