package co.edu.unipiloto.taller1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class ReciveMessageActivity extends Activity {
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView) findViewById(R.id.message);
        messageView.setText(messageText);
    }

    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.message1);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, CreateMenssageActivity.class);
        intent.putExtra("message1", messageText);
        startActivity(intent);
    }

}




