package net.teseco.logowidget;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class InfoActivity extends Activity {
 @Override public void onCreate(Bundle state) { super.onCreate(state); TextView text = new TextView(this); text.setText("TESECO Logo Widget\n\nChọn widget TESECO Logo trong giao diện HomeTV để hiển thị logo."); text.setTextSize(20); text.setPadding(28,28,28,28); setContentView(text); }
}
