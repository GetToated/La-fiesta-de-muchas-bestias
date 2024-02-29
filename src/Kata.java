public class Kata {
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    }
    public static void main(String[] args) {
        String[] beasts = {"great blue heron", "chickadee", "brown bear"};
        String[] dishes = {"garlic nann", "chocolate cake", "bear claw"};
        for (int i = 0; i < beasts.length; i++) {
            boolean allowed = feast(beasts[i], dishes[i]);
            System.out.println(beasts[i] + " can bring " + dishes[i] + ": " + allowed);
        }
    }
}

  