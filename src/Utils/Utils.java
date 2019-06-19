/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author chand
 */
public class Utils {
        //function obtained from https://stackoverflow.com/questions/15526255/best-way-to-get-sound-on-button-press-for-a-java-calculator
        public static void playSound(String soundName)
        {
          try 
          {
           AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
           Clip clip = AudioSystem.getClip( );
           clip.open(audioInputStream);
           clip.start( );
          }
          catch(IOException | LineUnavailableException | UnsupportedAudioFileException ex)
          {
            System.out.println("Error with playing sound.");
          }
        }
    
    
}
