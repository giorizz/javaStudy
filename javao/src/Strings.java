public class Strings {
    public static void main(String[] args) {
        String name = "Java";
        System.out.println("Primeiro caractere: " + name.charAt(0));

        String lastName = "Rules";
        System.out.println(name + ' ' + lastName);

        Integer idade = 10;
        System.out.println("Idade: " + idade);

        Double d = 103242.0;
        String strDouble = String.valueOf(d);

        String.valueOf(12f);
        System.out.println(strDouble);
    }
}
