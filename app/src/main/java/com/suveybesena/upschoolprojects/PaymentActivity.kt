package com.suveybesena.upschoolprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.text.bold
import androidx.core.text.color
import androidx.core.text.scale

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val tvSpannableStringMonth :TextView = findViewById(R.id.tvMonthly)

        val spannableString1 = SpannableStringBuilder()
            .bold { scale(1.5f){append("$11.99\n")} }
            .bold { color(ContextCompat.getColor(this@PaymentActivity , R.color.dark)) {append("$11.99")} }
            .bold { color(ContextCompat.getColor(this@PaymentActivity , R.color.regular)) {append("per month\n")} }
            .bold { color(ContextCompat.getColor(this@PaymentActivity , R.color.dark)) {append("$143.99")} }
            .bold { color(ContextCompat.getColor(this@PaymentActivity , R.color.regular)) {append("per year\n")} }
        tvSpannableStringMonth.text = spannableString1

        val tvSpannableStringYear :TextView = findViewById(R.id.tvYearly)

        val spannableString2 = SpannableStringBuilder()
            .bold { scale(1.5f){append("$4.99\n")} }
            .bold { color(ContextCompat.getColor(this@PaymentActivity , R.color.dark)) {append("$.99")} }
            .bold { color(ContextCompat.getColor(this@PaymentActivity , R.color.regular)) {append("per month\n")} }
            .bold { color(ContextCompat.getColor(this@PaymentActivity , R.color.dark)) {append("$59.99")} }
            .bold { color(ContextCompat.getColor(this@PaymentActivity , R.color.regular)) {append("per year\n")} }
            tvSpannableStringYear.text = spannableString2


    }


}