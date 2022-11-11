package com.example.test;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Menu extends AppCompatActivity {
 //'제철음식을 알고싶어요' 버튼
 private Button button_Items;
 //'구매하고 싶어요' 버튼
 private Button button_Sellers;
 //'모든 판매자 리스트' 버튼
 private Button button_AllSellers;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_menu);
 //'제철음식을 알고싶어요' 버튼 클릭하면 Items 액티비티로 이동
 button_Items = findViewById(R.id.button_Items);
 button_Items.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 Intent intent = new Intent(Menu.this, Items.class);
 startActivity(intent);
 }
 });
 //'구매하고 싶어요' 버튼 클릭하면 Sellers 액티비티로 이동
 button_Sellers = findViewById(R.id.button_Sellers);
 button_Sellers.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 Intent intent = new Intent(Menu.this, Sellers.class);
 startActivity(intent);
 }
 });
 //'모든 판매자 리스트' 버튼을 클릭하면 AllSellers 액티비티로 이동
10
 button_AllSellers = findViewById(R.id.button_AllSellers);
 button_AllSellers.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 Intent intent = new Intent(Menu.this, AllSellers.class);
 startActivity(intent);
 }
 });
 }
}
