package com.suveybesena.upschoolprojects

import android.os.Bundle
import android.text.SpannableStringBuilder
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.text.bold
import androidx.core.text.color
import androidx.core.text.scale
import androidx.databinding.DataBindingUtil
import com.suveybesena.upschoolprojects.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_payment)

        val spannableString1 = SpannableStringBuilder()
            .bold { scale(1.5f) { append("$11.99\n") } }
            .bold {
                color(
                    ContextCompat.getColor(
                        this@PaymentActivity,
                        R.color.dark
                    )
                ) { append("$11.99") }
            }
            .bold {
                color(
                    ContextCompat.getColor(
                        this@PaymentActivity,
                        R.color.regular
                    )
                ) { append("per month\n") }
            }
            .bold {
                color(
                    ContextCompat.getColor(
                        this@PaymentActivity,
                        R.color.dark
                    )
                ) { append("$143.99") }
            }
            .bold {
                color(
                    ContextCompat.getColor(
                        this@PaymentActivity,
                        R.color.regular
                    )
                ) { append("per year\n") }
            }
        binding.tvMonthly.text = spannableString1

        val spannableString2 = SpannableStringBuilder()
            .bold { scale(1.5f) { append("$4.99\n") } }
            .bold {
                color(
                    ContextCompat.getColor(
                        this@PaymentActivity,
                        R.color.dark
                    )
                ) { append("$.99") }
            }
            .bold {
                color(
                    ContextCompat.getColor(
                        this@PaymentActivity,
                        R.color.regular
                    )
                ) { append("per month\n") }
            }
            .bold {
                color(
                    ContextCompat.getColor(
                        this@PaymentActivity,
                        R.color.dark
                    )
                ) { append("$59.99") }
            }
            .bold {
                color(
                    ContextCompat.getColor(
                        this@PaymentActivity,
                        R.color.regular
                    )
                ) { append("per year\n") }
            }
        binding.tvYearly.text = spannableString2
    }

}