/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assistant;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;
import test.Mycommands;
import test.tts;

/**
 *
 * @author sarvesh
 */
public class Assistant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
       tts tts=new tts();
		// TODO Auto-generated method stub
		//voiceRecognizer vr=new voiceRecognizer();
		Configuration configuration = new Configuration();
		 configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
	        configuration.setDictionaryPath("/Users/sarvesh/Documents/test/Assistant/src/resources/3899.dic");
	        configuration.setLanguageModelPath("/Users/sarvesh/Documents/test/Assistant/src/resources/3899.lm");
	        
            LiveSpeechRecognizer recognizer = new LiveSpeechRecognizer(configuration);
	     // Start recognition process pruning previously cached data.
	     recognizer.startRecognition(true);
	     SpeechResult result;
	     while ((result = recognizer.getResult()) != null) {
	    	 String command=result.getHypothesis();
	    	 //String work=null;
	 	    System.out.println("Input command is: "+command);
	 	   String work=Mycommands.mycomm(command, tts);
	 	    if( work != null){
	 	    	//System.out.println(work);
	 	    	//String newcmd=String.format("cmd.exe /c %s", work);
	 	    	Runtime.getRuntime().exec(work);
	 	    }
	 	}
	     // Pause recognition process. It can be resumed then with startRecognition(false).
	     recognizer.stopRecognition(); 



    }
    
}
