public class potencia {
    public int resultado (int base, int potencia){
        if (potencia == 0) {
            return 1;
        } 
        if (potencia % 2 == 0) {
            int val = resultado(base, potencia / 2);
            return val * val;
        } 
        else {
            return base * resultado(base, potencia - 1);
        }
    }

    public void imprimir(){
        System.out.println("El resultado de la potencia es "+resultado(2,5));
    }
}
