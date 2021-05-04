import java.util.Locale;

public class Funcoes {

    private void helloWorld(){
        System.out.println("Olá mundo");
    }

    private long soma(long a1, long a2){
        return a1 + a2;
    }


    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        funcoes.helloWorld();
        System.out.println(funcoes.soma(3, 4));

        String str = "Curso de Javão";

        str.charAt(3);
        System.out.println(str.equals("Curso de Javão"));
        System.out.println(str.startsWith("Curs"));

        //false
        System.out.println(str.endsWith("Jav"));

        System.out.println(str.substring(3));
        System.out.println(str.substring(3,5));

        System.out.println(str.replace("Javão", "Java"));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        //remove os espaços
        System.out.println(str.trim());

        System.out.println(str.length());

        //Exceção em funções
        String exc = "Curso de Java";

        try{
            //isso vai dar erro se tiver fora do try
//            exc.charAt(200);

            //Erro com null exception
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e){
            System.out.println("NullPointer");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Não existem tantos caracteres");
        } catch (Exception e){
            System.out.println("Não existem tantos caracteres 2");
        } finally {
            System.out.println("Sempre executo!");
        }
        System.out.println("teste");
    }
}
