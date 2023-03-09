import javax.sound.midi.Receiver;

public class validateInput {
    public void store() {
        final double price = 20.00;
        int quantity = currentUser.getAttribute("quantity");
        double total = price * quantity;
        chargeUser(total);
    }

    private void buildList ( int untrustedListSize ){
        if ( 0 > untrustedListSize ){
        die("Negative value supplied for list size, die evil hacker!");
        }
        Widget[] list = new Widget [ untrustedListSize ];
        list[0] = new Widget();
    }


    @Override
    public void onReceive(Context context, Intent intent) {
        IntentFilter filter = new IntentFilter("com.example.URLHandler.openURL");
        MyReceiver receiver = new MyReceiver();
        registerReceiver(receiver, filter);
        if("com.example.URLHandler.openURL".equals(intent.getAction())) {
            String URL = intent.getStringExtra("URLToOpen");
            int length = URL.length();

        }
    }

}