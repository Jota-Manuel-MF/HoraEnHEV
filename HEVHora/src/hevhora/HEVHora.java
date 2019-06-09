/**
 * Proyecto HEV Hora
 *
 * @author Jota MMF
 * @version 1.0
 * @since 9/6/2019
 * 
 * Este programa dará la hora usando clips de voz del
 * HEV Suit de Half-Life 1
 * 
 */
package hevhora;

import java.io.*;

//----------------------------------------------------------------------------



public class HEVHora 
{
    public static void main(String[] args) 
    {
        SonidosHoras miSH = new SonidosHoras();
        
        miSH.reproducirSonido("Five");
    }
    
}
