import java.io.File;

/*
 * Откуда берутся ошибки?
 * Как программа оповещает об ошибках с помощью кодов ошибок?
 * Как программа оповещает об ошибках с помощью исключений?
 * Зачем обрабатывать ошибки?
 * Пример обработки ошибок
 */
public class lesson1 {

    public static void main(String[] args) {
        System.out.println(getSizeFile(new File("123.java"))); // Берём несеществующий фаил

        // System.out.println(calkul(-2, 0)); // Передаём в метод невалидные данные, для провоцирования ошибки

        // int[] arr = new int[10]; // Обращение к элементу вне массива так же провоцирует ошибку
        //  System.out.println(arr[-1]);

        // int[] arr = {1, 2, 3, 4, 5};
        // int x = 10 / 0;  // При компиляции программы невозможно получить два сообщения об ошибках
        // System.out.println(arr[8]); // Данная ошибка обращения изначально не будет обнаружена
    }

    // public static int calkul(int a, int b) {
    //     try {
    //         return a / b;
    //     } catch (Exception e) {
    //         throw new RuntimeException("НЕЛЬЗЯ ДЕЛИТЬ НА НОЛЬ!!!"); // БРОСАЕМ своё исключение об ошибке
    //     }
    // }

    public static long getSizeFile(File file) {
    if (!file.exists()) {           // ! переворачивает значение "файл НЕ существует"
    throw new RuntimeException("File not found!"); // Сообщаем пользователю об ошибке (своё исключение)!
    }
    return file.length();
    }
}