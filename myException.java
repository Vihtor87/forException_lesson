import java.io.IOException;
import java.sql.Date;

public class myException extends IOException {    // наследование моего исключения от исключения IO (ввод/вывод)
    private Date startDate;
    public myException(String message, Date starDate, Exception e) {       // принимаем текст и предыдущую ошибку
        super("my text exception " + message, e);
        this.startDate = starDate;
    }

    public Date getStarDate() {
        return startDate;
    }
}
