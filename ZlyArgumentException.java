/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv3_14;

/**
 *
 * @author Ondrej Gallo ID: 27000 Zadanie: zadanie2
 */
public class ZlyArgumentException extends RuntimeException{

    public ZlyArgumentException() {
    super("Zadal si zle argument: delis nulou");
    }
    
}
