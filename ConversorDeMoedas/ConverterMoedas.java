public class ConverterMoedas {
    private Object valorMoeda; 
    private Double valorMonetario;
    private Double valorConvertido;
    private double 
        dolar = 0.19,
        euro = 0.18,
        librasEsterlinas = 0.16,
        pesoArgentino = 36.86,
        pesoChileno = 151.18;

    public ConverterMoedas(Object valorMoeda, Double valorMonetario){
        this.valorMoeda = valorMoeda;
        this.valorMonetario = valorMonetario;
    }


    public String converteMoeda(){
       
        switch (valorMoeda.toString()) {
            case "Dólar para Real":
                this.valorConvertido = valorMonetario / dolar;
                return "U$ " + valorConvertido.toString();
                
            case "Euro para Real":
                this.valorConvertido = valorMonetario / euro;
                return "€$ " + valorConvertido.toString();

            case "Libras esterlinas para Real":
                this.valorConvertido = valorMonetario / librasEsterlinas;
                return "£$ " + valorConvertido.toString();

            case "Peso Argentino para Real":
                this.valorConvertido = valorMonetario / pesoArgentino;
                return "$ " + valorConvertido.toString();

            case "Peso Chileno para Real":
                this.valorConvertido = valorMonetario / pesoChileno;
                return "$ " + valorConvertido.toString();
            
            case "Real para Dólar":
                this.valorConvertido = valorMonetario * dolar;
                return "R$ " + valorConvertido.toString();
                
            case "Real para Euro":
                this.valorConvertido = valorMonetario * euro;
                return "R$ " + valorConvertido.toString();

            case "Real para Libras Esterlinas":
                this.valorConvertido = valorMonetario * librasEsterlinas;
                return "R$ " + valorConvertido.toString();

            case "Real para Peso Argentino":
                this.valorConvertido = valorMonetario * pesoArgentino;
                return "R$ " + valorConvertido.toString();

            case "Real para Peso Chileno":
                this.valorConvertido = valorMonetario * pesoChileno;
                return "R$ " + valorConvertido.toString();

            default:
                break;
        }

        return null;
    }
}