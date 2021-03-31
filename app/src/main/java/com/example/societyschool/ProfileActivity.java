package com.example.societyschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {

    private Button buton_logout;
    private FirebaseUser user;
    private DatabaseReference reference;
    private String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        buton_logout = (Button) findViewById(R.id.buton_logout);

        buton_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(ProfileActivity.this, MainActivity.class));

            }
        });

        user = FirebaseAuth.getInstance().getCurrentUser();
        reference = FirebaseDatabase.getInstance().getReference("User");
        userID = user.getUid();

        final TextView greetingTextView = (TextView) findViewById(R.id.display_greeting);
        final TextView emailTextView = (TextView) findViewById(R.id.display_email);
        final TextView nameTextView = (TextView) findViewById(R.id.display_name);
        final TextView ageTextView = (TextView) findViewById(R.id.display_age);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile = snapshot.getValue(User.class);

                if(userProfile != null){
                    String fullName = userProfile.fullName;
                    String email = userProfile.Email;
                    String age = userProfile.Age;

                    greetingTextView.setText("Salutare, " + fullName + " !");
                    nameTextView.setText(fullName);
                    emailTextView.setText(email);
                    ageTextView.setText(age);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(ProfileActivity.this,"Eroare !",Toast.LENGTH_LONG).show();
            }
        });

    }
}