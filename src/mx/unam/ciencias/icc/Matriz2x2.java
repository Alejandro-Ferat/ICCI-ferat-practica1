package mx.unam.ciencias.icc;

/**
 * <p>Clase para matrices de 2×2.</p>
 *
 * <p>Las matrices de 2×2 pueden sumarse, multiplicarse y sacar su
 * determinante.</p>
 *
 * <p>Las matrices se crean con cuatro dobles a, b, c y d, tales que representan
 * a la matriz:</p>
 *
<pre>
 ⎛ a  b ⎞ 
 ⎝ c  d ⎠
</pre>
 */
public class Matriz2x2 {

    /* La primera entrada de la matriz. */
    private double a; // las variables utilizadas para definir los atributos de una clase se conocen como variables de instancia
    /* La segunda entrada de la matriz. */
    private double b;
    /* La tercera entrada de la matriz. */
    private double c;
    /* La cuarta entrada de la matriz. */
    private double d;

    /**
     * Constructor único. Dado que no proveemos <em>setters</em>, nuestras
     * matrices de 2×2 son <em>inmutables</em>; no podemos cambiar sus valores.
     * @param a la primera entrada de la matriz.
     * @param b la segunda entrada de la matriz.
     * @param c la tercera entrada de la matriz.
     * @param d la cuarta entrada de la matriz.
     */
    public Matriz2x2(double a, double b,
		     double c, double d){
		    //Aquí estamos definiendo el método constructor (formalmente hablando no es un método ya que no tiene return
                    // el objetivo del constructor es asignar valor inicial a cada atributo de un objeto recien instanciado
  	            //con esto se garantiza que el objeto se cree con un estado válido.
                   //Podemos asegurar que este es el constructor de la clase ya que el "método" se llama igual que la clase y no tiene especificado
                   //ningun return, otra cosa importante por decir, es que este "método" solo puede ser llamado por el operador new
        this.a = a; // aquí se hace uso de la palabra reservada "this" para hacer distinción entre los parámetros del constructor y la correspondiente                       variable de instancia, en este caso estamos igualando el valor del parámero a del constructor con la variable de instancia a. 
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * Regresa el elemento <tt>a</tt> de la matriz de 2×2.
     * @return El elemento <tt>a</tt> de la matriz de 2×2.
     */
    public double getA() {
	return a;


	/** los métodos de acceso son el medio para conocer el valor de los atributos privados de los objetos, no reciben
	parámetros, pues su objetivo es obtener el valor de un atributo y por la misma razón el valor que devuelven
	es del tipo definido en el atributo. Si se especifica que un método va a devolver un valor, se debe usar en el cuerpo
	del mismo la instrucción "return" pues con ella se devuelve el valor y se termina la ejecución del método.
	*/ 
        
    }

    /**
     * Regresa el eleme>nto <tt>b</tt> de la matriz de 2×2.
     * @return El elemento <tt>b</tt> de la matriz de 2×2.
     */
    public double getB() {
        return b;
    }

    /**
     * Regresa el elemento <tt>c</tt> de la matriz de 2×2.
     * @return El elemento <tt>c</tt> de la matriz de 2×2.
     */
    public double getC() {
	return c;
	
    }

    /**
     * Regresa el elemento <tt>d</tt> de la matriz de 2×2.
     * @return El elemento <tt>d</tt> de la matriz de 2×2.
     */
    public double getD() {
	return d;

    }

    /**
     * Suma la matriz de 2×2 con la matriz de 2×2 que recibe como parámetro.
     * @param m La matriz de 2×2 con la que hay que sumar.
     * @return La suma con la matriz de 2×2 <tt>m</tt>.
     */
    public Matriz2x2 suma(Matriz2x2 m) {
        return new Matriz2x2(a + m.a, b + m.b, c + m.c, d + m.d);
    }

    /**
     * Multiplica la matriz de 2×2 con la matriz de 2×2 que recibe como
     * parámetro.
     * @param m La matriz de 2×2 con la que hay que multiplicar.
     * @return La multiplicación con la matriz de 2×2 <tt>m</tt>.
     */
    public Matriz2x2 multiplica(Matriz2x2 m) {
        return new Matriz2x2(a*m.a + b*m.c, a*m.b + b*m.d, c*m.a + d*m.c, c*m.b +d*m.d );
    }

    /**
     * Multiplica la matriz de 2×2 con la constante que recibe como parámetro.
     * @param x La constante con la que hay que multiplicar.
     * @return La multiplicación con la constante <tt>x</tt>.
     */
    public Matriz2x2 multiplica(double x) {
        return new Matriz2x2(a*x, b*x, c*x, d*x);
    }

    /**
     * Calcula el determinante de la matriz de 2×2.
     * @return El determinante de la matriz de 2×2.
     */
    public double determinante() {
         double determinante;
	 determinante = (a*d -b*c);
	 return determinante;
    }

    /**
     * Regresa una cadena con la representación de la matriz.
     * @return una cadena con la representación de la matriz.
     */
    public String toString() {
	String matriz;

	matriz = "(" +  a + "," + b + "\n" + c + "," + d + ")" ;
	
	return(matriz);
    }
}
