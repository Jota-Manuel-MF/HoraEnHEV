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
 * Se sigue <a href = https://youtu.be/QVrxiJyLTqU> el siguiente tutorial</a>
 * 
 */
package hevhora;

//----------------------------------------------------------------------------

/**
* Estos Packages nos permitirán capturar el instante en el que se
* llama al programa como un Instant.
* 
* De ahí, se sacará la hora en un formato simple.
*/
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Estos Packages nos permitirán obtener y manipular
 * ficheros de sonido.
 */
import java.io.*;
import javax.sound.sampled.*;


public class HEVHora 
{
    //Se crea una variable estática que consiga el valor de los
    // milisegundos
    public static final long AHORA_MILISEGUNDOS = System.currentTimeMillis();
    
    public static void main(String[] args) 
    {
        //Creamos una fecha
        Date ahora = new Date(AHORA_MILISEGUNDOS);
        
        //Creamos un formato de fecha: HH:mm:ss
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        
        //Creamos un un String y lo formateamos
        String hora = formato.format(ahora);
        
        //Creamos un archivo File
        File five = new File("F:\\Users\\Lawlz\\Desktop\\"
                + "Sonidos\\Half-Life\\fvox\\five.wav");
        reproducirSonido(five);
    }
    
    static void reproducirSonido(File archivo)
    {
        try
        {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(archivo));
            sonido.start();
            
            Thread.sleep(sonido.getMicrosecondLength()/1000);
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
    }
}
