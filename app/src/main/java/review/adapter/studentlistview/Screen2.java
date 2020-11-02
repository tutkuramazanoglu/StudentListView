package review.adapter.studentlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {

    private Student currentStudent;
    TextView tvName;
    TextView tvID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        //get UI component
        tvName=findViewById(R.id.tvName);
        tvID=findViewById(R.id.tvId);

        //get to data from screen one using serializable
        Intent i = getIntent();
        this.currentStudent = (Student) i.getSerializableExtra("student");

        //display the UI
        tvName.setText(this.currentStudent.getName());
        tvID.setText(this.currentStudent.getId());

    }

    //go back to screen one
    public void goBackPressed(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}