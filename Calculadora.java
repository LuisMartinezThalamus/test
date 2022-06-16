public class Calculadora {
    // Operaciones
    public  static Integer suma( Integer a, Integer b) {
        return a+b;
    }

    public  static Integer resta( Integer a, Integer b) {
        return a-b;
    }

    public  static Integer incremento( Integer a) {
        return a++;
    }

    // Funcion principal 1  
    public static void main(String[] arg) {
        if ("suma".equals(arg[0])){
            Integer a = new Integer(arg[1]);
            Integer b = new Integer(arg[2]);
            System.out.println("La suma es "+suma(a,b));
        }

        if ("resta".equals(arg[0])){
            Integer a = new Integer(arg[1]);
            Integer b = new Integer(arg[2]);
            System.out.println("La resta es "+resta(a,b));
        }

        if ("incremento".equals(arg[0])){
            Integer a = new Integer(arg[1]);
            System.out.println("El incremento es "+incremento(a));
        }
        
    }
    
}
