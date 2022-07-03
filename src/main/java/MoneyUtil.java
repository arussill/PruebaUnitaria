import java.math.BigDecimal;

public class MoneyUtil {

    // metodo que retorna el valor positivo con simbolo de dollar
    public static String format(double money) {
        return format(money, "$");
    }

    public static String format(double money, String symbol){

        // Saber si el symbol es null
        if (symbol == null){
            throw new IllegalArgumentException();
        }

        // Retorna dinero negativo
        if (money < 0) {
            symbol = "-" + symbol;
            money = money * (-1);
        }
        // Le coloaca al numero dos cifras decimales
        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_UP);
        return symbol + rounded;
    }
}
