import javax.swing.*;
import java.awt.Font;

public class OddEvenCheck {
    public static void main(String[] args) {
        // ตั้งค่าฟอนต์ให้ แสดงภาษาไทยได้
        UIManager.put("OptionPane.messageFont", new Font("Tahoma", Font.PLAIN, 16));
        UIManager.put("OptionPane.buttonFont", new Font("Tahoma", Font.PLAIN, 14));

        // แสดงกล่องให้ผู้ใช้พิมพ์ตัวเลข
        String input = JOptionPane.showInputDialog("กรอกตัวเลขที่ต้องการตรวจสอบ:");

        try {
            // แปลงข้อความเป็นตัวเลข
            int number = Integer.parseInt(input);

            // ตรวจสอบเลขคู่หรือคี่
            String message;
            if (number % 2 == 0) {
                message = number + " เป็นเลขคู่";
            } else {
                message = number + " เป็นเลขคี่";
            }

            // แสดงผลลัพธ์
            JOptionPane.showMessageDialog(null, message);

        } catch (NumberFormatException e) {
            // ถ้าพิมพ์ไม่ใช่ตัวเลข จะแสดงข้อความเตือน
            JOptionPane.showMessageDialog(null, "กรุณาพิมพ์เฉพาะตัวเลขเท่านั้น");
        }
    }
}
