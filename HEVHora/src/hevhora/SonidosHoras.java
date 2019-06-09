package hevhora;

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

/**
 *  SonidosHoras
 *  Esta clase contiene sonidos que se reproducirán
 *  Dependiendo de la hora.
 */
public class SonidosHoras 
{
    //Se crea una variable estática que consiga el valor de los
    // milisegundos
    public static final long AHORA_MILISEGUNDOS = System.currentTimeMillis();
    
    
    public String recibirHora()
    {
        SonidosHoras miSH = new SonidosHoras();
        
        //Creamos una fecha
        Date ahora = new Date(AHORA_MILISEGUNDOS);
        
        //Creamos un formato de fecha: HH:mm:ss
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        
        //Creamos un un String y lo formateamos
        String hora = formato.format(ahora);
        
        return hora;
    }
    
    //Método para reproducir sonidos
    public void reproducirSonido(String archivo)
    {
        File ruta = new File(System.getProperty("user.dir") + "\\fvox\\" + archivo + ".wav");
        try
        {
            Clip sonido = AudioSystem.getClip();
            sonido.open(AudioSystem.getAudioInputStream(ruta));
            sonido.start();
            
            Thread.sleep(sonido.getMicrosecondLength()/1000);
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
    }
    
    
}
