package vendor;

public enum Tolerancias {
    
    ROJO(0.02,"#800000"), //Valor, multiplicador, color
    DORADO(0.05,"#cca000"),
    PLATA(0.1,"#d8e2dc");    
    
    private final double tolerancia;
    private final String color;
    
    private Tolerancias(double tolerancia,String color){
        this.tolerancia = tolerancia;
        this.color = color;
    }
    
    public double getTolerancia(){
        return this.tolerancia;
    }
    public String getColor(){
        return this.color;
    }
}
