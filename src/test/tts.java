package test;
import com.sun.speech.freetts.*;
import java.io.* ;
public class tts
{
private String speaktext;
public void dospeak(String spak,String voice)
{
speaktext=spak; 
try
{
VoiceManager voiceManager=VoiceManager.getInstance();
Voice voices=voiceManager.getVoice(voice);
Voice voices1[]=voiceManager.getVoices();
//System.out.println("Available Voices");
//for(int i=0;i<voices1.length;i++)
//System.out.println(voices1[i].getName());
Voice sp=null;
if(voices!=null)
{
sp=voices; 
}
else
{
System.out.println("No Voice Available");
}
sp.allocate();
sp.speak(speaktext);
sp.deallocate();
}
catch(Exception e)
{
e.printStackTrace();
}
} 
}