package review.adapter.studentlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv_student;
    Utils utils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create references to listview
        lv_student=findViewById(R.id.lvStudent);

        //data source of listView=
        final ArrayList<Student >students=Utils.loadStudent();
        //create instance of the adapter
        StudentAdapter studentAdapter=new StudentAdapter(this,
                R.layout.row_layout_student,students);
        //associate the list view with adapter --> this is what populate the data each row
        lv_student.setAdapter(studentAdapter);
        //create click handler and send to selected student to screen two

        lv_student.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(),Screen2.class);
                intent.putExtra("student", students.get(position));
                startActivity(intent);
            }
        });
    }
}