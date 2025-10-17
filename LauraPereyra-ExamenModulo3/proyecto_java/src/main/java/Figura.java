public class Figura {
    private String nombre;
    public Figura(String nombre) { this.nombre = nombre; }
    public double calcularArea(double base, double altura) { return (base * altura) / 2; }
    public String cambiarNombre(String nuevoNombre) { if (nuevoNombre == null || nuevoNombre.isEmpty()) return null; this.nombre = nuevoNombre; return this.nombre; }
    public boolean esCuadrado(double lado1, double lado2) { return lado1 == lado2; }
}