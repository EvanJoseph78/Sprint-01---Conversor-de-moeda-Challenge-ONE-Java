public class ConverterMoedas {
    private Object valorMoeda; 
    private Double valorMonetario;
    private double dolar = 5.15;

    public ConverterMoedas(Object valorMoeda, Double valorMonetario){
        this.valorMoeda = valorMoeda;
        this.valorMonetario = valorMonetario;
    }


    public Double converteMoeda(){
        if (valorMoeda.toString().equals("Real para Dólar")){
            return valorMonetario * dolar;
        }
        if (valorMoeda.toString().equals("Dólar para Real")){
            return valorMonetario / dolar;
        }
        return null;
    }
}