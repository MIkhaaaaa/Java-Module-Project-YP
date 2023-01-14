public class Product {
    public double price;
    public String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }


    public static void calculation(int persons, double total) {
        String text = "Итого счет на одного человека будет %.2f %s";
        String rubles = "";
        double result = total / persons;
        int rub = (int) Math.floor(result);
        if (rub < 0) {
            System.out.println("Ошибка, попробуйте снова!");
        } else {
            if ((rub % 100) >= 11 && (rub % 100) <= 19) {
                rubles = "рублей";
            } else {
                switch (rub % 10) {
                    case 1:
                        rubles = "рубль";
                        break;
                    case 2:
                    case 3:
                    case 4:
                        rubles = "рубля";
                        break;
                    default:
                        rubles = "рублей";
                }
            }
        }
        System.out.printf((text) + "%n", result, rubles);
    }
}
