/*
 * Разберём виды исключений в Java, какую иерархию они образуют и в чём её смысл
 * Узнаем, чем исключения отличаются от ошибок
 * Поймём, как не дать исключениям «ронять» приложение
 * Узнаем, почему некоторые исключения компилятор заставляет обрабатывать, а некоторые нет
 */

// import java.io.File;

public class lesson2 {
    public static void main(String[] args) {
        // String name = null;
        // System.out.println(name.length());

        // Object object = new String("12w3");
        // File file = (File) object;
        // System.out.println(file);
    
        // String str = new String("12jdj");
        // int res = Integer.parseInt(str);
        // System.out.println(res);
    
        int num = 10;
        String str = "hgfd ttrv";
        try {
            num = 10 / 2;
            //str = null;
            System.out.println("Длина строки " + str.length() + " символов");
        } catch (ArithmeticException e) {
            System.out.println("ДЕЛЕНИЕ НА НОЛЬ!");
        } catch (NullPointerException e) {
            System.out.println("Строка НУЛЕВАЯ!");
        }
        System.out.println("num = " + num);
        // System.out.println(str);
        
    }



}
