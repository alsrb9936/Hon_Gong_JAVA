package sec04.exam04;

import java.io.IOException;

public class QStopExample {
    public static void main(String[] args) throws IOException {
        int KeyCode;

        while(true){
            KeyCode = System.in.read();
            System.out.println("KeyCode: " + KeyCode);
            if(KeyCode == 113){
                break;
            }
        }
    }
}
