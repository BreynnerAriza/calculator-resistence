package vendor;

//Importaciones
/**
 *   Breynner Fabian Ariza Florez
 *   Clase para
**/
public enum Colores {
    
    //Colores
    NEGRO("0",1,"#0e0004"), //Valor, Multiplicador, Color
    CAFE("1",10,"#582f0e"),
    ROJO("2",100,"#800000"),
    NARANJA("3",1000,"#dc2f02"),
    AMARILLO("4",10000,"#ffea00"),
    VERDE("5",100000,"#006400"),
    AZUL("6",1000000,"#03045e"),
    VIOLETA("7",10000000,"#7209b7"),
    GRIS("8",100000000,"#adb5bd"),
    BLANCO("9",1000000000,"#f8f9fa");
    
    private final String valor;
    private final int multiplicador;
    private final String color;
    
    private Colores(String valor,int multiplicador,String color){
        this.valor = valor;
        this.multiplicador = multiplicador;
        this.color = color;
    }
    
    public String getValor(){
        return this.valor;
    }
    
    public int getMultiplicador(){
        return this.multiplicador;
    }
    
    public String getColor(){
        return this.color;
    }        

}
