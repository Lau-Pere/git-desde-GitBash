 /**
 * Calcula el área de un triángulo.
 * @param {number} base - La base del triángulo.
 * @param {number} altura - La altura del triángulo.
 * @returns {number} El área del triángulo.
 */
function calcularArea(base, altura) {
    return (base * altura) / 2;
}

/**
 * Describe una figura geométrica.
 * @param {string} nombre - El nombre de la figura.
 * @returns {string} Descripción de la figura.
 */
function describir(nombre) {
    return "Esta es una figura llamada: " + nombre;
}

/**
 * Cambia el nombre de una figura.
 * @param {string} nombreActual - El nombre actual.
 * @param {string} nuevoNombre - El nuevo nombre.
 * @returns {string} El nuevo nombre.
 */
function cambiarNombre(nombreActual, nuevoNombre) {
    return nuevoNombre;
}

/**
 * Verifica si es un cuadrado.
 * @param {number} lado1 - Primer lado.
 * @param {number} lado2 - Segundo lado.
 * @returns {string} "Es un cuadrado" o "No es un cuadrado".
 */
function esCuadrado(lado1, lado2) {
    if(lado1 === lado2){
        return "Es un cuadrado.";
    }else{
        return "No es un cuadrado.";
    }
}