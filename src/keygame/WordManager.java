package keygame;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class WordManager {
    private final ArrayList<FallingWord> fallingWords;
    private final ArrayList<String> words;
    private final JFrame frame;
    private int fallen;

    public WordManager(JFrame parent) {
        frame = parent;
        fallingWords = new ArrayList<>();
        words = new ArrayList<>();

    }

    public void initWords(String text) {
        String[] arrWords = text.split(" ");
        words.addAll(Arrays.asList(arrWords));
    }

    // FallingWord 객체를 ArrayList에서 관리할 수 있도록 추가시킴
    public void addWord(String word) {
        // 라벨 컴포넌트 생성
        Random rand = new Random();
        int speed = rand.nextInt(1, 10);
        int index = rand.nextInt(0, words.size()-1);
        FallingWord fw = new FallingWord(words.get(index), speed, frame,this);
        fallingWords.add(fw);
        Thread th = new Thread(fw);
        th.start();
    }

    // word(매개변수)와 일치하는 FallingWord 객체를 화면과 ArrayList에서 제거함
    public void removeWord(String word) {
        Iterator<FallingWord> iterator = fallingWords.iterator();

        while(iterator.hasNext()) {
            FallingWord fw = iterator.next();
            if (fw.getText().equals(word)) {
                fw.destroy();    // word와 일치하는 FallingWord 객체를 제거한다.
                iterator.remove();  // ArrayList에서 제거함
                break;  // while문을 탈출함
            }
        }
    }

    // 주기마다 화면 갱신과 ArrayList 갱신
    public void cleanup() {
        Iterator<FallingWord> iterator = fallingWords.iterator();
        while(iterator.hasNext()) {
            FallingWord fw = iterator.next();
            if(!fw.isRunning()) {
                frame.remove(fw);
                iterator.remove();  // ArrayList에서도 제거
                fw = null;      // gc(Garbage Collector)가 메모리 관리를 함
            }
        }
        frame.repaint();
    }

    public synchronized void addFallen() {
        fallen++;   // 스스로 떨어진 갯수
    }

    public int getFallen() {
        return fallen;
    }
}
