package at.spengergasse.whatsapp_reengineered.app.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import at.spengergasse.whatsapp_reengineered.sharedData.domain.ChatMessage;
import com.example.whatsapp_reengineered.app.R;

import java.util.ArrayList;


public class ChatActivity extends ActionBarActivity {

    private ArrayList<ChatMessage> messageLog;

    //GUI Elements
    private ListView lv_chatlog;
    private EditText t_enterText;
    private Button b_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        lv_chatlog = (ListView) findViewById(R.id.lv_chatlog);
        lv_chatlog.setAdapter(new ArrayAdapter<ChatMessage>(getApplicationContext(), 0, messageLog));

        t_enterText = (EditText) findViewById(R.id.t_enterText);

        b_send = (Button) findViewById(R.id.b_send);
        b_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (t_enterText.getText().length() > 0) {
                    messageLog.add(new ChatMessage(t_enterText.getText().toString()));
                }
                else{
                    Toast.makeText(getApplicationContext(), "Please enter some text!", Toast.LENGTH_SHORT).show();
                }
                ((ArrayAdapter<ChatMessage>)lv_chatlog.getAdapter()).notifyDataSetChanged();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chat, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
