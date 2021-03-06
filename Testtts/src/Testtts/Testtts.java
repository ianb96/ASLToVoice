/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testtts;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
//import com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory;
/**
 *
 * @author calebshirley0610
 */
public class Testtts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VoiceManager voiceManager = VoiceManager.getInstance();
        Voice helloVoice = voiceManager.getVoice("kevin16");

        if (helloVoice == null) {
            System.err.println(
                "Cannot find a voice named kevin16.  Please specify a different voice.");
            System.exit(1);
        }
        
        /* Allocates the resources for the voice.
         */
        helloVoice.allocate();
        
        /* Synthesize speech.
         */
        helloVoice.speak(args[0]);

        /* Clean up and leave.
         */
        helloVoice.deallocate();
        System.exit(0);
    }
    
}
