package Templates.PhoneAdapter;

import itaphones.phone.AutomaticDialer;
import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class AppMain {
/*
Užduotis. Reikia išmokyti AutomaticDialer paskambinti MobilePhone
nors jis moka naudoti tik Phone interface'ą.
Atsispausdinkite AutomaticDialer rezultatą (sysout main metode).
Turi grįžti sveikinimas, kuris prasideda žodžiais "Jus sveikina ...".
 */
    public static void main(String[] args) {

        MobilePhoneAdapter mobilePhoneAdapter = new MobilePhoneAdapter(new MobilePhone());
        System.out.println(AutomaticDialer.dial(mobilePhoneAdapter));





    }

}
