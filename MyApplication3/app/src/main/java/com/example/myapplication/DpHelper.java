package com.example.myapplication;



import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DpHelper extends SQLiteOpenHelper {
    Context context;
    SharedPreferences sp;
    private static final String PREF_FILE_NAME="loginStatus";
    private final int PRIVATE_MODE=0;
    private final String LOGGED_IN="false";
    private static final String DATABASE_NAME="Bakery_db";
    private static final int DATABASE_VERSION=1;

    public DpHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null,DATABASE_VERSION);
        this.context=context;
        sp=context.getSharedPreferences(PREF_FILE_NAME, PRIVATE_MODE);
         SharedPreferences.Editor editor= sp.edit();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_QUERY="CREATE TABLE register(id INTEGER PRIMARY KEY AUTOINCREMENT,user_name TEXT,user_email TEXT,user_phone TEXT,user_password TEXT)";
        db.execSQL(CREATE_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
     db.execSQL("DROP TABLE IF EXISTS register");
     onCreate(db);
    }

    public boolean userSignUphelper(String name1,String email1,String phone1,String pass1){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
       SharedPreferences.Editor editor= sp.edit();
       editor.putBoolean(LOGGED_IN,true);
       editor.putString("User_Key",phone1);
       editor.commit();
        ContentValues value=new ContentValues();
        value.put("user_name",name1);
        value.put("user_email",email1);
        value.put("user_phone",phone1);
        value.put("user_password ",pass1);
      long l=  sqLiteDatabase.insert("register",null,value);
        sqLiteDatabase.close();

        if(l>0){
            return true;
        }else{
            return false;
        }

    }
    boolean validUser;
    public boolean userLoginhelper(String phone1,String pass1){
        SQLiteDatabase sqLiteDatabase= this.getReadableDatabase();
        SharedPreferences.Editor editor= sp.edit();


       Cursor cursor= sqLiteDatabase.rawQuery("SELECT * FROM register WHERE user_phone='"+phone1+"' AND user_password='"+pass1+"' ",null);
       if(cursor.moveToFirst()){
          validUser=true;
           editor.putString("User_Key",phone1);
           editor.putBoolean(LOGGED_IN,true);
       }else{
          validUser= false;
       }
        editor.commit();

       return validUser;
    }
    public  boolean checkUserLoggedIn(){
        if(sp.contains(LOGGED_IN)){
            return  true;
        }

        return false;
    }
    public String getSessionDetails(String Key){
        String val=sp.getString(Key,null);
        return val;
    }

    public ArrayList<UserModal> getLoggedinUserDetails(String phone1){
     ArrayList<UserModal> al=new ArrayList<>();
      SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
     Cursor cursor= sqLiteDatabase.rawQuery("SELECT * FROM register WHERE user_phone ='"+phone1+"'",null);
     if(cursor.moveToFirst()){
         UserModal userModal=new UserModal();
         userModal.setName(cursor.getString(1));
         userModal.setEmail(cursor.getString(2));
         userModal.setPhone(cursor.getString(3));
         al.add(userModal);
     }

     return al;
    }
    public boolean checkPhoneExist(String phone1){
       SQLiteDatabase sqLiteDatabase= this.getReadableDatabase();
      Cursor cursor=sqLiteDatabase.rawQuery("SELECT * FROM register WHERE user_phone='"+phone1+"'",null);
      if(cursor.moveToFirst()){
          return true;
      }else{
          return false;
      }

    }
    public boolean UpdateUserDetail(String email1,String name1,String phone1){
     SQLiteDatabase sqLiteDatabase=   this.getWritableDatabase();
     ContentValues content=new ContentValues();
     content.put("user_email",email1);
     content.put("user_name",name1);
   int i=  sqLiteDatabase.update("register",content,"user_phone=?",new String[]{phone1});

    if(i>0){
        return true;
    }else{
        return false;
    }
    }
    public void LogOutSession(){
        SharedPreferences.Editor editor= sp.edit();
        editor.clear();
        editor.commit();
    }

    }


