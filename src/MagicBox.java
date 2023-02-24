import java.util.Random;

public class MagicBox<T> {
    protected int number;
    protected T[] box;

    public MagicBox(int number) {
        this.number = number;
        this.box = (T[]) new Object[number];
    }

    boolean add(T items) {
        for (int i = 0; i < box.length; i++) {
            if (box[i] == null) {
                box[i] = items;
                System.out.println(items + " добавлено");
                return true;
            }
        }
        System.out.println("Места нет!");
        return false;
    }

    T pick() {
        for (int i = 0; i < box.length; i++) {
            if (box[i] == null) {
                int k = box.length - i;
                System.out.println("Коробка еще не заполена! Осталось добавить: " + k + " значения");
                return box[i];
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(number);
        System.out.println("Случайное значение: " + box[randomInt]);
        return box[randomInt];
    }
}


