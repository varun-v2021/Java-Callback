import java.util.ArrayList;
import java.util.List;

//Caller
public class SystemTimer {
	
	List<TimeUpdaterCallback> callbacks = new ArrayList<TimeUpdaterCallback>();
		
	public void registerCallbackForEveryHourUpdate(TimeUpdaterCallback timerCallback){
		callbacks.add(timerCallback);		
	}
	
	// At some point of the implementaion of this SystemTimer (you don't know)
    // this method will be called and every registered timerCallBack
    // will be called. Every registered timerCallBack may have a totally
    // different implementation of the method updateTime() and may be
    // used in different ways by different clients.
	
	public void oneHourHasBeenExpired(){
		for(TimeUpdaterCallback timerCallback: callbacks){
			timerCallback.updateTime(System.currentTimeMillis());
		}
	}	
}
