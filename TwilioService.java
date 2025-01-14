import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioService {

    private static final String ACCOUNT_SID = "AC33da6682c13b05f7064c572d86a8a605";
    private static final String AUTH_TOKEN = "e8d9cbea473c06c1d58f1e31b0aa7389";
    private static final String FROM_NUMBER = "+12317972741";

    static {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    public void sendSms(Reminder reminder) {
        Message.creator(
                new PhoneNumber(reminder.getPhoneNumber()),
                new PhoneNumber(FROM_NUMBER),
                reminder.getMessage()
        ).create();
        System.out.println("Reminder sent to " + reminder.getPhoneNumber());
    }
}
