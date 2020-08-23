package test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Mycommands {

	public static String mycomm(String comman,tts tts){
		String work=null;
		String comm=comman;
		switch(comm){
		case "JAR":
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
		case "GOOD BYE, JAR":
			tts.dospeak("Good bye! , Have a nice day.","kevin16");
                        System.exit(0);
			break;
		case "THANK YOU, JAR":
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
			tts.dospeak("My self JAR.","kevin16");
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
			tts.dospeak("My self: JAR. I am developed in JAVA. My developer is Mr. SARVESH KUMAR DEVVANSHI who is very intelligent, hard worker, handsome.","kevin16");
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
                case "OPEN FACEBOOK":
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
                 case "SET ONLY SOUND":
			tts.dospeak("Please adjust volume according you!","kevin16");
			work="cmd.exe /c start SndVol -f";
			break;
                case "SET SOUND":
			tts.dospeak("Please adjust volume according you!","kevin16");
			work="cmd.exe /c start SndVol";
			break;
                case "CLOSE SOUND":
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
                case "OPEN WORD":
			tts.dospeak("opening..... microsoft office word","kevin16");
			work="cmd.exe /c start winword";
			break;
                case "CLOSE WORD":
			tts.dospeak("closing..... microsoft office word","kevin16");
			work="Taskkill /f /im winword.exe";
			break;
                case "OPEN MICROSOFT":
			tts.dospeak("opening..... microsoft office word","kevin16");
			work="cmd.exe /c start ois";
			break;
                case "CLOSE MICROSOFT":
			tts.dospeak("closing..... microsoft office word","kevin16");
			work="Taskkill /f /im ois.exe";
			break;
                case "OPEN EXCEL":
			tts.dospeak("opening..... microsoft office excel","kevin16");
			work="cmd.exe /c start excel";
			break;
                case "CLOSE EXCEL":
			tts.dospeak("closing..... Excel","kevin16");
			work="Taskkill /f /im excel.exe";
			break;
                case "OPEN ACCESS":
			tts.dospeak("opening..... access","kevin16");
			work="cmd.exe /c start msaccess";
			break;
                case "CLOSE ACCESS":
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
                case "SHOW DATA USE":
			tts.dospeak("showing..... data usage of your network","kevin16");
			work="cmd.exe /c start ms-settings:datausage";
			break;
                case "OPEN BLUETOOTH":
			tts.dospeak("opening..... blue tooth","kevin16");
			work="cmd.exe /c start fsquirt";
			break;
                case "CLOSE BLUETOOTH":
			tts.dospeak("closing..... bluetooth","kevin16");
			work="Taskkill /f /im fsquirt.exe";
			break;
                case "OPEN BLUETOOTH SETTING":
			tts.dospeak("opening..... bluetooth setting","kevin16");
			work="cmd.exe /c start Ms-settings:bluetooth";
			break;
                case "OPEN SOUND CARD":
			tts.dospeak("opening..... sound card","kevin16");
			work="cmd.exe /c start Ms-settings:sound";
			break;
                case "OPEN NOTIFICATIONS":
			tts.dospeak("opening..... notifications","kevin16");
			work="cmd.exe /c start Ms-settings:notifications";
			break;
                case "SHOW ME SYSTEM DETAILS":
			tts.dospeak("opening..... sound card","kevin16");
			work="cmd.exe /c start Ms-settings:about";
			break;
                case "OPEN PERSONAL":
			tts.dospeak("opening..... personalization","kevin16");
			work="cmd.exe /c start Ms-settings:personalization";
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
                case "OPEN FIREWALL":
			tts.dospeak("opening..... windows defender firewall","kevin16");
			work="cmd.exe /c start Windowsdefender:";
			break;
                case "CLOSE FIREWALL":
			tts.dospeak("closing..... windows defender firewall","kevin16");
			work="taskkill /f /im sechealthui.exe";
			break;
                case "OPEN CALCULATOR":
			tts.dospeak("opening..... calculator","kevin16");
			work="cmd.exe /c start calculator:";
			break;
                case "CLOSE CALCULATOR":
			tts.dospeak("closing..... calculator","kevin16");
			work="taskkill /f /im calculator.exe";
			break;
                case "OPEN CALENDAR":
			tts.dospeak("opening..... calendar","kevin16");
			work="cmd.exe /c start outlookcal:";
			break;
                case "CLOSE CALENDAR":
			tts.dospeak("closing..... calendar","kevin16");
			work="taskkill /f /im HxCalendarAppImm.exe";
			break;
                case "OPEN CENTER":
			tts.dospeak("opening..... action center","kevin16");
			work="cmd.exe /c start Ms-actioncenter:";
			break;
                case "Hey CORTANA":
			tts.dospeak("cortana ready to help you!","kevin16");
			work="taskkill /f /im Ms-cortana:";
			break;
                case "OPEN PROJECTING":
			tts.dospeak("receiving..... device","kevin16");
			work="cmd.exe /c start ms-projection:";
			break;
                case "CLOSE PROJECTING":
			tts.dospeak("closing..... projector","kevin16");
			work="taskkill /f /im receiver.exe";
			break;
                case "OPEN CMD":
			tts.dospeak("opening..... windows command prompt","kevin16");
			work="cmd.exe";
			break;
                case "CLOSE CMD":
			tts.dospeak("closing..... command prompt","kevin16");
			work="taskkill /f /im cmd.exe";
			break;
                case "OPEN COMMAND ADMIN":
			tts.dospeak("opening..... command prompt in adminitrator mode","kevin16");
			work="cmd.exe /c start cmd :";
			break;
                case "CLOSE COMMAND ADMIN":
			tts.dospeak("closing..... command prompt","kevin16");
			work="taskkill /f /im cmd.exe";
			break;
                case "OPEN TASK":
			tts.dospeak("opening..... Task manager","kevin16");
			work="cmd.exe /c start taskmgr";
			break;
                case "CLOSE TASK":
			tts.dospeak("Please close it self!","kevin16");
			//work="taskkill /f /im taskmgr.exe";
			break;
                case "START GIT":
			tts.dospeak("opening..... Git Command Prompt","kevin16");
			work="C:\\Program Files\\Git\\git-cmd.exe";
			break;
                case "CLOSE GIT":
			tts.dospeak("closing... git","kevin16");
			work="Taskkill /f /im git-cmd.exe";
			break;
                case "OPEN GIT BASH":
			tts.dospeak("opening..... Git BASH Command Prompt","kevin16");
			work="C:\\Program Files\\Git\\git-bash.exe";
			break;
                case "CLOSE GIT BASH":
			tts.dospeak("closing... git","kevin16");
			work="Taskkill /f /im git-bash.exe";
			break;
                case "OPEN NETBEANS":
			tts.dospeak("opening..... NETBEANS","kevin16");
			work="C:\\Program Files\\NetBeans 8.0.2\\bin\\netbeans64.exe";
			break;
                case "CLOSE NETBEANS":
			tts.dospeak("closing... NETBEANS","kevin16");
			work="Taskkill /f /im netbeans64.exe";
			break;
                case "OPEN VLC":
			tts.dospeak("opening..... VLC MEDIA PLAYER","kevin16");
			work="C:\\Program Files\\VideoLAN\\VLC\\vlc.exe";
			break;
                case "CLOSE VLC":
			tts.dospeak("closing... VLC MEDIA PLAYER","kevin16");
			work="Taskkill /f /im vlc.exe";
			break;
                case "OPEN NODE":
			tts.dospeak("opening..... NODE PROMPT","kevin16");
			work="C:\\Program Files\\nodejs\\node.exe";
			break;
                case "CLOSE NODE":
			tts.dospeak("closing... NODE PROMPT","kevin16");
			work="Taskkill /f /im node.exe";
			break;
                case "OPEN ARDUINO":
			tts.dospeak("opening..... ARDUINO","kevin16");
			work="C:\\Program Files (x86)\\Arduino\\arduino.exe";
			break;
                case "CLOSE ARDUINO":
			tts.dospeak("closing... ARDUINO","kevin16");
			work="Taskkill /f /im arduino.exe";
			break;
                case "OPEN SQL":
			tts.dospeak("opening..... MYSQL","kevin16");
			work="cmd /c start mysql -uroot -proot";
			break;
                case "CLOSE SQL":
			tts.dospeak("closing... MYSQL","kevin16");
			work="Taskkill /f /im mysql.exe";
			break;
                case "OPEN PDF":
			tts.dospeak("opening..... ADOBE READER","kevin16");
			work="C:\\Program Files (x86)\\Adobe\\Reader 9.0\\Reader\\AcroRd32.exe";
			break;
                case "CLOSE PDF":
			tts.dospeak("closing... ADOBE READER","kevin16");
			work="Taskkill /f /im acrord32.exe";
			break;
                case "OPEN CODE":
			tts.dospeak("opening..... Visual Studio CODE","kevin16");
			work="C:\\Program Files (x86)\\Microsoft Visual Studio\\2019\\Community\\Common7\\IDE\\devenv.exe";
			break;
                case "CLOSE CODE":
			tts.dospeak("closing... Visual studio code","kevin16");
			work="Taskkill /f /im devenv.exe";
			break;
                case "START TURBO":
			tts.dospeak("opening..... Turbo C","kevin16");
			work="C:\\TURBOC3\\Turbo C++\\Turbo C++.exe";
			break;
                case "CLOSE C":
			tts.dospeak("closing... turbo c","kevin16");
			work="Taskkill /f /im TurboC++.exe";
			break;
                case "OPEN ANACONDA":
			tts.dospeak("opening..... anaconda","kevin16");
			work="C:\\Users\\sarvesh\\Anaconda3\\pythonw.exe C:\\Users\\sarvesh\\Anaconda3\\cwp.py C:\\Users\\sarvesh\\Anaconda3 C:\\Users\\sarvesh\\Anaconda3\\pythonw.exe C:\\Users\\sarvesh\\Anaconda3\\Scripts\\anaconda-navigator-script.py";
			break;
                case "CLOSE ANACONDA":
			tts.dospeak("closing... anaconda","kevin16");
			work="Taskkill /f /im pythonw.exe";
			break;
                
                case "OPEN MYECLIPSE":
			tts.dospeak("opening..... MYECLIPSE","kevin16");
			work="C:\\Users\\sarvesh\\AppData\\Local\\Genuitec\\MyEclipse-8.6\\myeclipse.exe";
			break;
                case "CLOSE MYECLIPSE":
			tts.dospeak("closing... MYECLIPSE","kevin16");
			work="Taskkill /f /im myeclipse.exe";
			break;
                case "OPEN ECLIPSE":
			tts.dospeak("opening..... ECLIPSE","kevin16");
			work="C:\\Users\\sarvesh\\Downloads\\eclipse-jee-indigo-SR2-win32-x86_64\\eclipse\\eclipse.exe";
			break;
                case "CLOSE ECLIPSE":
			tts.dospeak("closing... eclipse","kevin16");
			work="Taskkill /f /im eclipse.exe";
			break;
                case "OPEN PYTHON":
			tts.dospeak("opening..... python IDLE","kevin16");
			work="C:\\Users\\sarvesh\\AppData\\Local\\Programs\\Python\\Python37\\pythonw.exe \"C:\\Users\\sarvesh\\AppData\\Local\\Programs\\Python\\Python37\\Lib\\idlelib\\idle.pyw";
			break;
                case "CLOSE PYTHON":
			tts.dospeak("closing... python idle","kevin16");
			work="Taskkill /f /im pythonw.exe";
			break;
                }
		return work;
	}
}
