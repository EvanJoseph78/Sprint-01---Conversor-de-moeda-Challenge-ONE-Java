public class testes {
    public static void main(String[] args) throws Exception{
        
        try {
            Double d = Double.parseDouble("100");
            System.out.println(d);
        } catch (Exception e) {
            System.out.println("Entrada inválida, digite um número");
        }
        
    }
}
