import javax.swing.JOptionPane;

public class ConversorUnidades {
    Double valorUnidade;
    Object unidadeEscolhida;
    Double[] unidades = {0.001, 0.01, 0.1, 1.0, 10.0, 100.0, 1000.0};  


    public ConversorUnidades(Double valorUnidade, Object unidadeEscolhida) {
        this.valorUnidade = valorUnidade;
        this.unidadeEscolhida = unidadeEscolhida;
        convertePraTodasUnidades(converteMetros(valorUnidade));
        converteMetros(valorUnidade);
        System.out.println(converteMetros(valorUnidade));
    }

    public Double converteMetros(Double num){
        System.out.println(this.unidadeEscolhida.toString());
        switch (this.unidadeEscolhida.toString()) {
            case "milimetros":
                return num * this.unidades[0];
            // "milimetros","decimetros","centimetros","metros","decametros","kilómetros" 
            case "decimetros":
                return num * this.unidades[1];
        
            case "centimetros":
                return num * this.unidades[2];

            case "metros":
                return num * this.unidades[3];

            case "decametros":
                return num * this.unidades[4];

            case "hectometros":
                return num * this.unidades[5];    

            case "kilómetros":
                return num * this.unidades[6];    

            default:
                break;
        }
        return 0.0;
    }
    
    public void convertePraTodasUnidades(Double num) {
        JOptionPane.showMessageDialog(null, 
        "milimetro: " + num * this.unidades[6] +
        "\ndecimetro: " + num * this.unidades[5] +
        "\ncentimetor: " + num * this.unidades[4] +
        "\nmetros: " + num * this.unidades[3] +
        "\ndecametros: " + num * this.unidades[2] +
        "\nhectmometro: " + num * this.unidades[1] +
        "\nkilómetor: " + num * this.unidades[0]
        );
    }
}
