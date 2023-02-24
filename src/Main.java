public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox = new MagicBox<>(3);
        magicBox.add(1);
        magicBox.add(2);
        magicBox.add(5);
        magicBox.pick();
        MagicBox<String> magicBox1 = new MagicBox<>(5);
        magicBox1.add("Oleg");
        magicBox1.add("Tanya");
        magicBox1.add("Anton");
        magicBox1.pick();


    }
}
