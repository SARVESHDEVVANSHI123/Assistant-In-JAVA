package test;

import java.io.IOException;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
//import com.sun.speech.*;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
public class voiceRecognizer {
	
	//public void tts(String text){
		//System.setProperty("mbrola.base","C:/Users/sarvesh/newecworkspace/Assistant/mbrola/");
		//System.clearProperty("mbrola.base");
		//VoiceManager vm=VoiceManager.getInstance();
		//Voice v=vm.getVoice("Kevin16");
		
		//v.allocate();
		//v.speak(text);
//	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		tts tts=new tts();
		// TODO Auto-generated method stub
		//voiceRecognizer vr=new voiceRecognizer();
		Configuration configuration = new Configuration();
		 configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
	        configuration.setDictionaryPath("/Users/sarvesh/newecworkspace/Assistant/src/com/voicerecog/resources/6383.dic");
	        configuration.setLanguageModelPath("/Users/sarvesh/newecworkspace/Assistant/src/com/voicerecog/resources/6383.lm");
	        
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
