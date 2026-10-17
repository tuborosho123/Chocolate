import java.util.Scanner;

class Chocolates {

    static int maxChocolates(int money, int price, int wrap) {
        int chocolates = money / price;
        int wrappers = chocolates;


        while (wrappers >= wrap) {
            int bonus = wrappers / wrap;
            chocolates += bonus;
            wrappers = wrappers % wrap + bonus;
        }

        return chocolates;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Сколько денег: ");
        int money = in.nextInt();
        System.out.print("Цена шоколадки: ");
        int price = in.nextInt();
        System.out.print("Сколько оберток нужно для обмена: ");
        int wrap = in.nextInt();

        System.out.println("Максимум шоколадок: " + maxChocolates(money, price, wrap));
    }
}