package Templates.PhoneAdapter;

import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class MobilePhoneAdapter implements Phone {

   private MobilePhone mobilePhone;
   private String answer = "";

    public MobilePhoneAdapter(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public void dial(String number) {
       answer = mobilePhone.dial(number);
    }

    @Override
    public String getReponse() {
        return answer;
    }
}
