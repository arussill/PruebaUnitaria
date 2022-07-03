/*
 * Anteriormente en el pom donde se colocan las dependencias, se debio colocar la dependencia de junit.
 * En este proyecto me sirvio fue la junit version 4.12*/

//Se debe importar las librerias
import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    // Se coloca la etiqueta Test para saber que esta es una prueba
    @Test
    public void moneyTest() {
        // Se ecribe el metodo que se va ha probar
        String money = MoneyUtil.format(1000);
        // Se le debe pasar el valor que se esperaba en el primer parametro y en el segundo el valor que se esta recibienso.
        Assert.assertEquals("$1000.00", money);
    }

    // Ahora probar dinero negativo
    @Test
    public void negativeMoneyTest() {
        String money = MoneyUtil.format(-1000);
        //Assert.asertEquals compara algo con otra cosa pero hay muchos otros
        Assert.assertEquals("-$1000.00", money);
    }

    //Para que reciba otro simbolo
    @Test
    public void euroMonetTest(){
        String money = MoneyUtil.format(-1000, "€");
        Assert.assertEquals("-€1000.00", money);
    }

    //Este test como parametro de entrada recibe un simbolo null por lo que debe arrojar un error como respuesta correcta, debe retornar la IllegalArgumentException
    @Test(expected = IllegalArgumentException.class)
    public void notNullExceptionMoneyTest(){
        MoneyUtil.format(-1000.0, null);
    }

}
