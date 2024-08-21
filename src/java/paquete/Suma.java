/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

/**
 *
 * @author marcospereirasanchez
 */
public class Suma {
    
    private float primerNumero;
    private float segundoNumero;
    private float resultado;

    public Suma(float primerNumero, float segundoNumero) {
        this.primerNumero = primerNumero;
        this.segundoNumero = segundoNumero;
        
    }

    /**
     * @return the primerNumero
     */
    public float getPrimerNumero() {
        return primerNumero;
    }

    /**
     * @param primerNumero the primerNumero to set
     */
    public void setPrimerNumero(float primerNumero) {
        this.primerNumero = primerNumero;
    }

    /**
     * @return the segundoNumero
     */
    public float getSegundoNumero() {
        return segundoNumero;
    }

    /**
     * @param segundoNumero the segundoNumero to set
     */
    public void setSegundoNumero(float segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    /**
     * @return the resultado
     */
    public float getResultado() {
        return (primerNumero + segundoNumero);
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    
    
    
    
    
}
