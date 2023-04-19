import ru.netology.services. vacantionService;

public class Main {
    public static void main(String[] args) {
        vacantionService service = new vacantionService();
        int count = service.calculate(10_000 , 3_000, 20_000 );
        System.out.println(count + " Отпуска-(ов) в год");

    }
}