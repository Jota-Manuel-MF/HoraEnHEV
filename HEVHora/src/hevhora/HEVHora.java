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
        
        miSH.reproducirSonido("Time_is_now");
        
        String comando = miSH.recibirHora();
        
        //True: AM
        //False: PM
        boolean amPM = true;
        
        //Nombrar las horas
        //Si la hora se encuentra entre 0 y 20, se
        // reproducirá el comando regular
        if(Integer.parseInt(comando.substring(0, 2)) >= 0 &&
                Integer.parseInt(comando.substring(0, 2))<= 20)
        {
            //Si la hora es mayor a 13, se considerará PM
            if(Integer.parseInt(comando.substring(0, 2)) >=13)amPM = false;
            
            miSH.reproducirSonido(comando.substring(0, 2));
        }
        //Si no, se tratará de un número compuesto de dos
        // clips de voz.
        else
        {
            switch(comando.substring(0, 2))
            {
                case "21":
                    miSH.reproducirSonido("20");
                    miSH.reproducirSonido("1");
                    break;
                case "22":
                    miSH.reproducirSonido("20");
                    miSH.reproducirSonido("2");
                    break;
                case "23":
                    miSH.reproducirSonido("20");
                    miSH.reproducirSonido("3");
                    break;
            }
        }
        
        
        //Nombrar los minutos
        //Si los minutos se encuentran entre 0 y 20, se
        // reproducirá el clip de voz regular
        if(Integer.parseInt(comando.substring(3, 5)) >= 0 &&
                Integer.parseInt(comando.substring(3, 5))<= 20)
        {
            miSH.reproducirSonido(comando.substring(3, 5));
        }
        //Si no, se tratará de un número compuesto de dos
        // clips de voz.
        else
        {
            switch(comando.substring(3,4))
            {
                case "2":
                    miSH.reproducirSonido("20");
                    miSH.reproducirSonido("0" + comando.substring(4,5));
                    break;
                case "3":
                    miSH.reproducirSonido("30");
                    miSH.reproducirSonido("0" + comando.substring(4,5));
                    break;
                case "4":
                    miSH.reproducirSonido("40");
                    miSH.reproducirSonido("0" + comando.substring(4,5));
                    break;
                case "5":
                    miSH.reproducirSonido("50");
                    miSH.reproducirSonido("0" + comando.substring(4,5));
                    break;
            }
        }
        
        //Se nombrará si es AM o PM dependiendo de si
        // la hora es antes o después de las 12
        if(amPM) miSH.reproducirSonido("am");
        else miSH.reproducirSonido("pm");
    }
    
}
