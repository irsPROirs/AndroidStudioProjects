package com.example.android.justjava;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummarytextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummarytextView.setText(message);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int quantity = 1;

    /**
     * This method is called when the order button is clicked.
     */
    private int calculatePrice(boolean milkCheck,boolean ChocolateCheck) {
        int price = 5;
        if (milkCheck) {
            price = price+1;
        }
        if (ChocolateCheck) {
            price=price + 2;
        }
        return price*quantity;
    }

    private String createOrderSummary(int price,boolean milkCheck,boolean ChocolateCheck,String name) {
        String priceMessage = "Name: " +name+ "\nMilk:"+ milkCheck+"\nChocolate:"+ChocolateCheck + "\nQuantity: " + quantity + "\nTotal: " + price + "\nThank you";
        return priceMessage;
    }

    public void submitOrder(View view) {
        EditText yourName = (EditText) findViewById(R.id.yourName);
                String name = yourName.getText().toString();
        CheckBox milkCheckBox = (CheckBox) findViewById(R.id.checkbox_milk);
        boolean milkCheck = milkCheckBox.isChecked();
        CheckBox ChocolateCheckBox = (CheckBox) findViewById(R.id.checkbox_chocolate);
        boolean ChocolateCheck = ChocolateCheckBox.isChecked();
        int price = calculatePrice(milkCheck,ChocolateCheck);
        String message = createOrderSummary(price,milkCheck,ChocolateCheck,name);

//        Intent intent = new Intent(Intent.ACTION_SENDTO);
//        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
//        intent.putExtra(Intent.EXTRA_SUBJECT, "Just Java order" + name);
//        intent.putExtra(Intent.EXTRA_TEXT, message);
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
        displayMessage(message);
    }

    public void increment(View view) {
        if (quantity == 100) {
            Toast.makeText(this,"More then 100",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        if (quantity == 1) {
            Toast.makeText(this,"Less then 1",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity - 1;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}