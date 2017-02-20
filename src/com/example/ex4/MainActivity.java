package com.example.ex4;
 
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
 
public class MainActivity extends Activity {
    EditText fname,fcontent,fnameread;
    Button write,read;
    TextView filecon;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname = (EditText)findViewById(R.id.RelativeLayout01);
        fcontent = (EditText)findViewById(R.id.RelativeLayout01);
        fnameread = (EditText)findViewById(R.id.RelativeLayout01);
        write = (Button)findViewById(R.id.RelativeLayout01);
        read = (Button)findViewById(R.id.RelativeLayout01);
        filecon = (TextView)findViewById(R.id.RelativeLayout01);
        write.setOnClickListener(new View.OnClickListener() {
 
        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
        String filename = fname.getText().toString();
        String filecontent = fcontent.getText().toString();
        FileOperations fop = new FileOperations();
        fop.write(filename, filecontent);
        if(fop.write(filename, filecontent)){
        Toast.makeText(getApplicationContext(), filename+".txt created", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "I/O error", Toast.LENGTH_SHORT).show();
 
        }
        }
    });
    read.setOnClickListener(new View.OnClickListener() {
 
        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            String readfilename = fnameread.getText().toString();
            FileOperations fop = new FileOperations();
            String text = fop.read(readfilename);
            if(text != null){
            filecon.setText(text);
            }
            else {
                Toast.makeText(getApplicationContext(), "File not Found", Toast.LENGTH_SHORT).show();
                filecon.setText(null);
            }
 
        }
    });
    }
    }