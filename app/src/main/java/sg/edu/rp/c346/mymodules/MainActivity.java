package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Modules test=new Modules(){};
TextView tvClick;
    TextView tvClick2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvClick=findViewById(R.id.firstTV);
        tvClick2=findViewById(R.id.secondTV);

        tvClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent2 = new Intent(getBaseContext(), ModuleDetailActivity.class);
                intent2.putExtra("AcadY", "2018");
                intent2.putExtra("Sem", "1");
                intent2.putExtra("MCode", "C346");
                intent2.putExtra("MCredit", "4");
                intent2.putExtra("Venue", "W66M");
                intent2.putExtra("MName", "Android Programming");

                startActivity(intent2);
            }
        });

        tvClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(), ModuleDetailActivity.class);

                intent.putExtra("AcadY", "2018");
                intent.putExtra("Sem", "1");
                intent.putExtra("MCode", "C349");
                intent.putExtra("MCredit", "4");
                intent.putExtra("Venue", "W66M");
                intent.putExtra("MName", "IPad Programming");
                startActivity(intent);
            }
        });

    }
}
