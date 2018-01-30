package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

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

    int quantity = 0;

    /**
     * This method is called when the order button is clicked.
     */
    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }

    private String createOrderSummary(int price) {
        String priceMessage = "Name:Mike " + "\nQuantity: " + quantity + "\nTotal: " + price + "\nThank you";
        return priceMessage;
    }

    public void submitOrder(View view) {
        int price = calculatePrice();
        String message = createOrderSummary(price);
        displayMessage(message);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
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