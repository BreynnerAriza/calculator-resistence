package vendor;

public class PrefijosConversion {
    
    public static String formato(double valor){
        Prefijos prefijos [] = Prefijos.values();
        for(Prefijos prefijo : prefijos){
            if(valor >= prefijo.getValor())
                return String.format("%.2f " + prefijo.getPrefijo(), valor / prefijo.getValor());
        }
        return null;
    }
}
