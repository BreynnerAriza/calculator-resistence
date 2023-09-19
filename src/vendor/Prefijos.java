package vendor;

public enum Prefijos {

    YOTTA("Y",1e24),
    ZETTA("Z",1e21),
    EXA("E",1e18),
    PETA("P",1e15),
    TERA("T",1e12),
    GIGA("G",1e9),
    MEGA("M",1e6),
    KILO("k",1e3),
    HECTO("H",1e2),
    DECA("D",1e1),
    NORMALIZADA("N",1),
    DECI("deci",1e-1),
    CENTI("C",1e-2),
    MILLI("m",1e-3),
    MICRO("µ",1e-6),
    NANO("n",1e-9),
    PICO("p",1e-12),
    FEMTO("f",1e-15),
    ATTO("a",1e-18),
    ZEPTO("z",1e-21),
    YOCTO("y",1e-24);
    
    
    private final String prefijo;
    private final double valor;
    
    private Prefijos(String prefijo,double valor){
        this.prefijo = prefijo;
        this.valor = valor;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public double getValor() {
        return valor;
    }
    
}
