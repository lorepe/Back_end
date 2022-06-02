public class FiguraGeometrica {
    private Double medida;
    //private String figura;

    public FiguraGeometrica (Double medida) throws Exception{
        if (medida >0.0) {
            this.medida = medida;
        }throw new Exception("El valor del radio o lado debe ser mayor que cero");
    }

    /*public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }*/

    public String calcularArea(String figura ){
        Double resultado=0.0;
        if (figura.equals("CIRCULO")){
           resultado= Math.PI * Math.pow(medida,2.0);
        }
        if (figura.equals("CUADRADO")){
            resultado = Math.pow(medida,2.0);
        }

        return "El área del "+figura+" es "+resultado +" unidades";
    }

}
