import java.text.DecimalFormat;

public class Exercicio1 {
    public static void main(String[] args) {
        Exercicio1 exercicio1 = new Exercicio1();

        exercicio1.helloWorld("Hello World");

        System.out.println(exercicio1.soma(4, 6));

        System.out.println(exercicio1.calcula(5,8,25.4f));

    }

    private void helloWorld(String value) {
        Integer x = value.length();
        System.out.println("A palavra possui " + x + " caracteres");
    }

    private Integer soma(Integer a, Integer b) {
        return a + b;
    }

    private float calcula(float a1, float a2, float a3) {
        float calc = ((a1 + a2) * a1) / a3;
//        DecimalFormat formatador = new DecimalFormat("0.00");
        return calc;
    }


}
