package sec04.exam02;

import javax.sound.midi.SysexMessage;

public class KeyCodeExample {
    public static void main(String[] args) throws Exception{
        int KeyCode;

        KeyCode = System.in.read();
        System.out.println("KeyCode: " + KeyCode);

        KeyCode = System.in.read();
        System.out.println("KeyCode: " + KeyCode);

        KeyCode = System.in.read();
        System.out.println("KeyCode: " + KeyCode);
    }
}
