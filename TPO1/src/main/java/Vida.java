/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gastón
 */
public class Vida {
    
    //Esta clase será el recurso compartido que se encargará de llevar el conteo de los puntos de vida
    
    private int puntosVida = 10;
    
    public Vida(){
    }
    
    public int getPuntosVida(){
        return puntosVida;
    } 
    
    public void golpear(){
        puntosVida = puntosVida - 3;
    } //metodo para que el orco golpee
    
    public void curar(){
        puntosVida = puntosVida - 3;
    } //metodo para que el curandero cure
}
