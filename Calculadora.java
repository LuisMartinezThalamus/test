public class Calculadora {
    // Operaciones
    public  static Integer suma( Integer a, Integer b) {
        return a+b;
    }

    public  static Integer multiplicacion( Integer a, Integer b) {
        return a*b;
    }

    // Funcion principal 1  
    public static void main(String[] arg) {
        if ("suma".equals(arg[0])){
            Integer a = new Integer(arg[1]);
            Integer b = new Integer(arg[2]);
            System.out.println("La suma es "+suma(a,b));
            System.out.println("La multiplicacion es "+,multiplicacion(a,b));
        }
        
    }
    
}
