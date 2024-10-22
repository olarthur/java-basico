public class Math {
    public static void main(String[] args) throws Exception {
    
     /* Math.abs():Retorna o valor absoluto de um número (a distância do número até o zero). 
      *
      *int valor = -10;
      *int absoluto = Math.abs(valor);  Retorna 10
      *System.out.println(absoluto);
      */
    
    /* Math.max(): Retorna o maior de dois números.
     *
     * int a = 5;
     * int b = 10;
     * int maior = Math.max(a, b);  Retorna 10
     * System.out.println(maior);
     */

    /* Math.min(): Retorna o menor de dois números.
     *
     * int a = 5;
     * int b = 10;
     * int menor = Math.min(a, b);  Retorna 5
     * System.out.println(menor);
     */

    /* Math.pow(): Retorna a potência de um número, ou seja, eleva o primeiro número à potência do segundo.
     *
     * double base = 2;
     * double expoente = 3;
     * double resultado = Math.pow(base, expoente);  Retorna 8 (2^3)
     * System.out.println(resultado);
     */
    
    /* Math.sqrt(): Calcula a raiz quadrada de um número.
     * 
     * double numero = 16;
     * double raiz = Math.sqrt(numero);  Retorna 4
     * System.out.println(raiz);
     */

    /*Math.sin(), Math.cos(), e Math.tan(): Retornam, respectivamente, o seno, cosseno e tangente de um ângulo em radianos.
     *
     * double angulo = Math.toRadians(30);  Converte 30 graus para radianos
     * double seno = Math.sin(angulo);  Seno de 30 graus
     * double cosseno = Math.cos(angulo);  Cosseno de 30 graus
     * double tangente = Math.tan(angulo);  Tangente de 30 graus
     * 
     * System.out.println("Seno: " + seno);
     * System.out.println("Cosseno: " + cosseno);
     * System.out.println("Tangente: " + tangente);
     */

    /* Math.exp(): Retorna o valor de "e" (base dos logaritmos naturais) elevado à potência especificada.
     * 
     * double potencia = 1;
     * double exp = Math.exp(potencia);  Retorna e^1
     * System.out.println(exp);
     */

    /* Math.log(): Retorna o logaritmo natural (base "e") de um número.
     * 
     * double numero = Math.E; // e = 2.718...
     * double logaritmo = Math.log(numero);  Retorna 1 (log base e de e)
     * System.out.println(logaritmo);
     */

    /* Math.round(): Arredonda um número para o inteiro mais próximo.
     *
     * double numero = 7.5;
     * long arredondado = Math.round(numero);  Retorna 8
     * System.out.println(arredondado);
     */ 

    /* Math.floor(): Arredonda um número para baixo, para o inteiro mais próximo.
     * 
     * double numero = 7.8;
     * double piso = Math.floor(numero);  Retorna 7
     * System.out.println(piso);
     */
    
    /* Math.ceil(): Arredonda um número para cima, para o inteiro mais próximo.
     * 
     * double numero = 7.2;
     * double teto = Math.ceil(numero);  Retorna 8
     * System.out.println(teto);
     */

    /* Math.random(): Retorna um número aleatório entre 0.0 (inclusivo) e 1.0 (exclusivo).
     * 
     * double aleatorio = Math.random();
     * System.out.println(aleatorio); 
     * 
     * Intervalo entre 1 e 100.
     * int numeroAleatorio = (int) (Math.random() * 100) + 1;
     * System.out.println(numeroAleatorio);
     */

    /* Math.PI: A constante de valor Pi (aproximadamente 3.14159), útil em cálculos geométricos.
     * 
     * double raio = 5;
     * double area = Math.PI * Math.pow(raio, 2); Área de um círculo
     * System.out.println(area);
     */

    /* Math.E: A constante "e" (base dos logaritmos naturais, aproximadamente 2.718).
     * 
     * System.out.println(Math.E); // Exibe o valor de "e"
     */

    }
}
