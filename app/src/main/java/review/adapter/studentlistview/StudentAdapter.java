package review.adapter.studentlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class StudentAdapter extends ArrayAdapter<Student> {

    //create copy of data sources
    ArrayList<Student>studentList=new ArrayList<Student>();
    public StudentAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Student> objects) {
        super(context, resource, objects);

        //save a copy of students to the class variable
        this.studentList=objects;
    }

    //populate each row with data
    //the function is called for each row.
    //If the listView has 20 rows then getView function will call 20 times because each row
    // draws one by one


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //get the current student to display in the row
        Student currentStudent=this.studentList.get(position);

        //tempate code
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.row_layout_student, parent,false);
        }

        //put the data UI
        TextView tvName=convertView.findViewById(R.id.row_tvName);
        TextView tvId=convertView.findViewById(R.id.row_tvStudentId);
        tvName.setText(currentStudent.getName());
        tvId.setText(currentStudent.getId());

        //return view
        return convertView;
    }
}
