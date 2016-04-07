package pbru.ice.nataporn.ice59;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private Button AboutmeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindWidget();
        AboutmeButton();
    }

    private void AboutmeButton() {
        AboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.youtube.com/watch?v=7O_IPF1sJOc"));
                startActivity(intent);
            }
        });
    }

    private void bindWidget() {
        AboutmeButton = (Button) findViewById(R.id.button);
    }

    private void createListView (){
        MyData objData = new MyData();
        int[] intIcon = objData.icon();
        String[] strTitle = objData.title();

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, intIcon, strTitle);
        ListView myListView = (ListView) findViewById(R.id.listView);
        myListView.setAdapter(objMyAdapter);
    }

}
