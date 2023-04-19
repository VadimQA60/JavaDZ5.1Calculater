import ru.netology.services. vacantionservice;

public class Main {
    public static void main(String[] args) {
        vacantionservice service = new vacantionservice();
        int count = service.calculate(10_000 , 3_000, 20_000 );
        System.out.println(count + " Отпуска-(ов) в год");

    }
}