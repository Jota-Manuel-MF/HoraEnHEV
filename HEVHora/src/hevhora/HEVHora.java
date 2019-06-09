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
        
        String comando = "";
        
        miSH.reproducirSonido("Time_is_now");
        
        //Tomamos las horas
        switch(miSH.recibirHora().substring(0, 2))
        {
            case "18":
                miSH.reproducirSonido("eighteen");
                break;
        }
        
        System.out.print(miSH.recibirHora().substring(0, 2));
    }
    
}
