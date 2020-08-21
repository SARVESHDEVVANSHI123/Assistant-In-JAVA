package test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Mycommands {

	public static String mycomm(String comman,tts tts){
		String work=null;
		String comm=comman;
		switch(comm){
		case "JARVIS":
			 tts.dospeak("Yes Boss, How can I help you?","kevin16");
			 break;
		case "GOOD MORNING":
			tts.dospeak("Good morning, Have a good day","kevin16");
			break;
		case "GOOD NIGHT":
			tts.dospeak("Good night, Have a sweet dream.","kevin16");
			break;
		case "GOOD AFTERNOON":
			tts.dospeak("Good Afternoon.","kevin16");
			break;
		case "GOOD EVENING":
			tts.dospeak("Good evening, It�s time for nature.","kevin16");
			break;
		case "GOOD BYE, JARVIS":
			tts.dospeak("Good bye! , Have a nice day.","kevin16");
                        System.exit(0);
			break;
		case "THANK YOU, JARVIS":
			tts.dospeak("It is my pleasure.","kevin16");
			break;
		case "I LOVE YOU":
			tts.dospeak("I love you too.","kevin16");
			break;
		case "HOW ARE YOU?":
			tts.dospeak("I am absolutely fine. How are you?","kevin16");
			break;
		case "WHERE ARE YOU?":
			tts.dospeak("I am always in your PC. ","kevin16");
			break;
		case "WHAT IS YOUR NAME?":
			tts.dospeak("My self JARVIS.","kevin16");
			break;
		case "WHO IS YOUR DEVELOPER?":
			tts.dospeak("My developer is Mr. SARVESH KUMAR DEVVANSHI who is very intelligent, hard worker, handsome.","kevin16");
			break;
		case "WHAT PROGRAMMING LANGUAGE IS USED IN YOU?":
			tts.dospeak("I am developed in JAVA.","kevin16");
			break;
		case "WHAT IS YOUR DEVELOPING CODE?":
			tts.dospeak("It is a top secret.Please contact my developer at.","kevin16");
			work="Cmd.exe /c start chrome spvsolution.com    https://www.facebook.com/sarvesh.devvanshi.3";
			break;
		case "INTRODUCE YOURSELF":
			tts.dospeak("My self: JARVIS. I am developed in JAVA. My developer is Mr. SARVESH KUMAR DEVVANSHI who is very intelligent, hard worker, handsome.","kevin16");
			break;
		case "DATE":
			Date date=new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMMM yyyy");  
		   String das=formatter.format(date);
                   System.out.println(das);
			tts.dospeak( das, "kevin16");
			break;
                case "TIME":
			Date date1=new Date();
			SimpleDateFormat formatter1 = new SimpleDateFormat("HH:mm:ss zzzz");  
                        String das1=formatter1.format(date1);
                        System.out.println(das1);
			tts.dospeak( das1, "kevin");
			break;
                case "OPEN YOUTUBE":
			tts.dospeak("opening..... youtube","kevin16");
			work="Cmd.exe /c start chrome www.youtube.com";
			break;
                case "OPEN WIKIPEDIA":
			tts.dospeak("opening..... wikipedia","kevin16");
			work="Cmd.exe /c start chrome www.wikipedia.com";
			break;
                case "OPEN MAIL":
			tts.dospeak("opening..... mail","kevin16");
			work="Cmd.exe /c start chrome www.gmail.com";
			break;
                case "OPEN FB":
			tts.dospeak("opening..... facebook","kevin16");
			work="Cmd.exe /c start chrome www.facebook.com";
			break;
                case "OPEN CHROME":
			tts.dospeak("opening..... chrome","kevin16");
			work="Cmd.exe /c start chrome ";
			break;
                case "OPEN FIREFOX":
			tts.dospeak("opening..... firefox","kevin16");
			work="Cmd.exe /c start firefox";
			break;
                case "CLOSE FIREFOX":
			tts.dospeak("CLOSINGING..... firefox","kevin16");
			work="TASKKILL /F /IM firefox.EXE";
			break; 
                 case "CLOSE CHROME":
			tts.dospeak("closing..... chrome","kevin16");
			work="taskkill /f /im chrome.exe";
			break;
                 case "SET ONLY VOLUME":
			tts.dospeak("Please adjust volume according you!","kevin16");
			work="cmd.exe /c start SndVol -f";
			break;
                case "SET VOLUME":
			tts.dospeak("Please adjust volume according you!","kevin16");
			work="cmd.exe /c start SndVol";
			break;
                case "CLOSE VOLUME":
			tts.dospeak("Please adjust volume according you!","kevin16");
			work="taskkill /f /im sndvol.exe";
			break;
                case "PLAY MUSIC":
			tts.dospeak("Please wait! playing music...","kevin16");
			work="cmd.exe /c start wmplayer";
			break;
		 case "CLOSE MUSIC":
			tts.dospeak("closing..... music","kevin16");
			work="taskkill /f /im wmplayer.exe";
			break;
                case "PLAY GROOVE":
			tts.dospeak("Please wait! playing  groove music...","kevin16");
			work="cmd.exe /c start Mswindowsmusic:";
			break;
		 case "CLOSE GROOVE":
			tts.dospeak("closing..... music","kevin16");
			work="Taskkill /f /im music.ui.exe";
			break;
                case "OPEN NOTEPAD":
			tts.dospeak("opening..... notepad","kevin16");
			work="cmd.exe /c start notepad";
			break;
                case "CLOSE NOTEPAD":
			tts.dospeak("closing..... notepad","kevin16");
			work="Taskkill /f /im notepad.exe";
			break;
                case "OPEN PAINT":
			tts.dospeak("opening..... paint","kevin16");
			work="cmd.exe /c start mspaint";
			break;
                case "CLOSE PAINT":
			tts.dospeak("closing..... paint","kevin16");
			work="Taskkill /f /im mspaint.exe";
			break;
                case "OPEN MSWORD":
			tts.dospeak("opening..... microsoft office word","kevin16");
			work="cmd.exe /c start winword";
			break;
                case "CLOSE MSWORD":
			tts.dospeak("closing..... microsoft office word","kevin16");
			work="Taskkill /f /im notepad.exe";
			break;
                case "OPEN EXCEL":
			tts.dospeak("opening..... microsoft office excel","kevin16");
			work="cmd.exe /c start excel";
			break;
                case "CLOSE EXCEL":
			tts.dospeak("closing..... Excel","kevin16");
			work="Taskkill /f /im excel.exe";
			break;
                case "OPEN MSACCESS":
			tts.dospeak("opening..... access","kevin16");
			work="cmd.exe /c start msaccess";
			break;
                case "CLOSE MSACCESS":
			tts.dospeak("closing..... access","kevin16");
			work="Taskkill /f /im msaccess.exe";
			break;
                case "OPEN PPT":
			tts.dospeak("opening..... microsoft office power point","kevin16");
			work="cmd.exe /c start powerpnt";
			break;
                case "CLOSE PPT":
			tts.dospeak("closing..... power point","kevin16");
			work="Taskkill /f /im powerpnt.exe";
			break;
                case "SHOW WIFI NETWORK":
			tts.dospeak("showing..... available wifi network","kevin16");
			work="cmd.exe /c start ms-availablenetworks:";
			break;
                case "SHOW DATA USAGE":
			tts.dospeak("showing..... data usage of your network","kevin16");
			work="cmd.exe /c start ms-settings:datausage";
			break;
                case "CLOSE SETTING":
			tts.dospeak("closing..... settings","kevin16");
			work="Taskkill /f /im systemsettings.exe";
			break;
                case "OPEN WIFI SETTING":
			tts.dospeak("opening.....  wifi network settings","kevin16");
			work="cmd.exe /c start ms-settings:netwirk-wifi";
			break;
                case "OPEN NETWORK":
			tts.dospeak("opening..... network setting","kevin16");
			work="cmd.exe /c start ms-settings:network";
			break;
                case "OPEN SETTING":
			tts.dospeak("opening..... system setting","kevin16");
			work="cmd.exe /c start ms-settings:";
			break;
                case "OPEN CAMERA":
			tts.dospeak("opening..... camera","kevin16");
			work="cmd.exe /c start microsoft.windows.camera:";
			break;
                case "CLOSE CAMERA":
			tts.dospeak("closing..... camera","kevin16");
			work="taskkill /f /im windowscamera.exe";
			break;
                case "OPEN PHOTOS":
			tts.dospeak("opening..... your photos","kevin16");
			work="cmd.exe /c start ms-photos:";
			break;
                case "CLOSE PHOTOS":
			tts.dospeak("closing..... your photos","kevin16");
			work="taskkill /f /im microsoft.photos.exe";
			break;
                }
		return work;
	}
}
