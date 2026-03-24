package exercises.ejercicio03;

/**
 * Clase que resuelve ecuaciones de segundo grado de la forma ax^2 + bx + c = 0.
 * Se ha refactorizado para eliminar el anidamiento excesivo mediante Clausulas Guarda.
 */
public class Ejercicio03 {

    /**
     * Calcula y muestra las raices de una ecuacion cuadratica.
     * * @param a Coeficiente del termino cuadratico.
     * @param b Coeficiente del termino lineal.
     * @param c Termino independiente.
     */
    public void calculateQuadraticEquation(double a, double b, double c) {
        // Calculo del discriminante con nombre descriptivo en ingles
        double discriminant = (b * b) - (4 * a * c);

        // Clausula Guarda 1: Si no hay raices reales, informamos y salimos
        if (discriminant < 0) {
            System.out.println("La ecuación no tiene raíces reales");
            return;
        }

        // Clausula Guarda 2: Si solo hay una raiz (discriminante es cero)
        if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene una única raíz: x = " + x);
            return;
        }

        // Caso final: Si el flujo llega aqui, existen dos raices
        // No es necesario un 'else' gracias a los 'return' anteriores.
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);

        System.out.println("La ecuación tiene dos raíces: x1 = " + x1 + ", x2 = " + x2);
    }
}