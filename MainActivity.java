package com.example.test;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
 //메인화면 버튼
 private Button button_main;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_home);
 //'시작하기' 버튼 누르면 메인화면에서 메뉴화면으로 이동
 button_main = findViewById(R.id.button_main);
 button_main.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 Intent intent = new Intent(MainActivity.this, Menu.class);
 startActivity(intent);
 }
 });
 }
}
