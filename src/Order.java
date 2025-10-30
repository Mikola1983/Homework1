import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return customer + " " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        boolean sravn = true;
        int i = 0;
        //Проверка длин массивов
        if (basket.length != order.basket.length) {
            return false;
        } else { //Поэлементное сравнение массивов
            for (int element = 0; element < basket.length; element++) {
                if (Objects.equals(basket[element], order.basket[element]) == false) {
                    sravn = false;
                    break;
                }
            }
        }
        return Objects.equals(customer, order.customer) && sravn;
    }

}
