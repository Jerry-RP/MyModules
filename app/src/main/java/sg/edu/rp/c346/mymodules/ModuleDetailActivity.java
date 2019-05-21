package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ModuleDetailActivity extends AppCompatActivity {
TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
Button btnR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        tv1=findViewById(R.id.textView1);
        tv2=findViewById(R.id.textView2);
        tv3=findViewById(R.id.textView3);
        tv4=findViewById(R.id.textView4);
        tv5=findViewById(R.id.textView5);
        tv6=findViewById(R.id.textView6);
        btnR=findViewById(R.id.btnReturn);
        Intent intentReceived = getIntent();


        tv1.setText("Module Code: "+intentReceived.getStringExtra("MCode"));
        tv2.setText("Module Name: "+intentReceived.getStringExtra("MName"));
        tv3.setText("Academic Year: "+intentReceived.getStringExtra("AcadY"));
        tv4.setText("Semester: "+intentReceived.getStringExtra("Sem"));
        tv5.setText("Module Credit: "+intentReceived.getStringExtra("MCredit"));
        tv6.setText("Venue: "+intentReceived.getStringExtra("Venue"));

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             finish();
            }
        });


    }
}
