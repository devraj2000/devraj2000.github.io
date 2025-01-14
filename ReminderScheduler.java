

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;


public class ReminderScheduler {

    public static void main(String[] args) {
        TwilioService twilioService = new TwilioService();
        Reminder reminder = new Reminder("+918617604861", "Time to drink water! Stay hydrated.");

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override

            public void run() {

                twilioService.sendSms(reminder);
            }
        }, 0, 3600000); // Sends every hour
    }
}
