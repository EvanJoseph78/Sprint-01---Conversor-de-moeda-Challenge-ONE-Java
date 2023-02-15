import javax.swing.JOptionPane;

public class InterfaceGrafica {

    public void iniciaApp(){
        caixaDialogo();
        int saida = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        System.out.println(saida);
        if (saida == 0) {
            iniciaApp();
        }
    }

    public void caixaDialogo(){
        
        Object[] opcoes = { "Conversor de Moeda", "Conversor de Unidades" };
        Object valor = JOptionPane.showInputDialog(null, "Escolha uma opção","Menu-Conversor", JOptionPane.INFORMATION_MESSAGE, null,opcoes, opcoes[0]);
        if (valor != null) {
          System.out.println(valor.toString());
        }

        if (valor.equals(opcoes[0])) {
            caixaConversorMoedas();
        }

        if (valor.equals(opcoes[1])) {
            caixaConversorUnidades();
        }
        

    }

    public void caixaConversorMoedas(){
        Object[] opcoes = { 
            "Real para Dólar",
            "Real para Euro",    
            "Real para Libras Esterlinas",
            "Real para Peso Argentino",
            "Real para Peso Chileno",
            "Dólar para Real",
            "Euro para Real",
            "Libras esterlinas para Real",
            "Peso Argentino para Real",
            "Peso Chileno para Real" 
        };

        Object valor = JOptionPane.showInputDialog(
            null, 
            "Escolha uma opção", 
            "Conversor de Moedas", 
            JOptionPane.INFORMATION_MESSAGE, 
            null, 
            opcoes, 
            opcoes[0]
        );
        
        if (valor != null) {
            System.out.println(valor.toString());
        }
        
        Double valorMonetario = inputUsuario();
        System.out.println(valorMonetario);
        ConverterMoedas c = new ConverterMoedas(valor, valorMonetario);
        JOptionPane.showMessageDialog(null, "O valor da conversão é: " + c.converteMoeda());
        System.out.println(c.converteMoeda());
        
    }

    public void caixaConversorUnidades(){
        Object[] opcoes = { "milimetros","decimetros","centimetros","metros","decametros","hectometros","kilómetros" };
        Object valor = JOptionPane.showInputDialog(null, "Escolha uma opção", "Conversor de Unidades", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
        if (valor != null) {
            System.out.println(valor.toString());
        }

        Double valorUnidade = inputUsuario();
        ConversorUnidades c = new ConversorUnidades(valorUnidade, valor);
    }

    public Double inputUsuario() {
        try {
            String valorMonetario = JOptionPane.showInputDialog(null, "Entre com o valor");    
            Double d = Double.parseDouble(valorMonetario);
            return d;
        } catch (Exception e) {
            System.out.println("Entrada inválida, entre com um valor numérico");
            JOptionPane.showMessageDialog(null, "Entrada inválida, entre com um valor numérico");
            return inputUsuario();
        }
    }

}
