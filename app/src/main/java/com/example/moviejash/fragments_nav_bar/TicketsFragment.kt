package com.example.moviejash.fragments_nav_bar

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment
import com.example.moviejash.MainActivity_CreditCard
import com.example.moviejash.R

class TicketsFragment: Fragment (R.layout.fragment_tickets){

    private lateinit var BuyTicket: Button
    private lateinit var E1: Button
    private lateinit var E2: Button
    private lateinit var E3: Button
    private lateinit var E4: Button
    private lateinit var D1: Button
    private lateinit var D2: Button
    private lateinit var D3: Button
    private lateinit var D4: Button
    private lateinit var C1: Button
    private lateinit var C2: Button
    private lateinit var C3: Button
    private lateinit var C4: Button
    private lateinit var B1: Button
    private lateinit var B2: Button
    private lateinit var B3: Button
    private lateinit var B4: Button
    private lateinit var A1: Button
    private lateinit var A2: Button
    private lateinit var A3: Button
    private lateinit var A4: Button

    private lateinit var Dune: RadioButton
    private lateinit var HouseOfGucci: RadioButton
    private lateinit var NoTimeToDie: RadioButton
    private lateinit var SpiderMan: RadioButton
    private lateinit var KingsMan: RadioButton

    private lateinit var Movies: RadioGroup

    private lateinit var Seats: TextView
    private lateinit var Price: TextView

    private var seatsNumber = 20
    private var priceNumber = 0

    var i = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()

        E1.setOnClickListener { clickButton() }
        E2.setOnClickListener { clickButton() }
        E3.setOnClickListener { clickButton() }
        E4.setOnClickListener { clickButton() }
        D1.setOnClickListener { clickButton() }
        D2.setOnClickListener { clickButton() }
        D3.setOnClickListener { clickButton() }
        D4.setOnClickListener { clickButton() }
        C1.setOnClickListener { clickButton() }
        C2.setOnClickListener { clickButton() }
        C3.setOnClickListener { clickButton() }
        C4.setOnClickListener { clickButton() }
        B1.setOnClickListener { clickButton() }
        B2.setOnClickListener { clickButton() }
        B3.setOnClickListener { clickButton() }
        B4.setOnClickListener { clickButton() }
        A1.setOnClickListener { clickButton() }
        A2.setOnClickListener { clickButton() }
        A3.setOnClickListener { clickButton() }
        A4.setOnClickListener { clickButton() }


        BuyTicket.setOnClickListener {
            if (Movies.checkedRadioButtonId == -1) {
                Toast.makeText(requireActivity(), "You Have To Choose A Movie", Toast.LENGTH_SHORT).show()
            }
            else if (seatsNumber == 20) {
                Toast.makeText(requireActivity(), "You have To Choose A Seat", Toast.LENGTH_SHORT).show()
            }
            else {
                goToCreditCardActivity()
            }
        }

    }

    private fun goToCreditCardActivity() {
        startActivity(Intent(requireActivity(), MainActivity_CreditCard::class.java))
        requireActivity().finish()
    }

    private fun init() {
        BuyTicket = requireView().findViewById(R.id.buyTicket)
        E1 = requireView().findViewById(R.id.e1)
        E2 = requireView().findViewById(R.id.e2)
        E3 = requireView().findViewById(R.id.e3)
        E4 = requireView().findViewById(R.id.e4)
        D1 = requireView().findViewById(R.id.d1)
        D2 = requireView().findViewById(R.id.d2)
        D3 = requireView().findViewById(R.id.d3)
        D4 = requireView().findViewById(R.id.d4)
        C1 = requireView().findViewById(R.id.c1)
        C2 = requireView().findViewById(R.id.c2)
        C3 = requireView().findViewById(R.id.c3)
        C4 = requireView().findViewById(R.id.c4)
        B1 = requireView().findViewById(R.id.b1)
        B2 = requireView().findViewById(R.id.b2)
        B3 = requireView().findViewById(R.id.b3)
        B4 = requireView().findViewById(R.id.b4)
        A1 = requireView().findViewById(R.id.a1)
        A2 = requireView().findViewById(R.id.a2)
        A3 = requireView().findViewById(R.id.a3)
        A4 = requireView().findViewById(R.id.a4)

        Seats = requireView().findViewById(R.id.seatsNumber)
        Price = requireView().findViewById(R.id.priceNumber)

        Dune = requireView().findViewById(R.id.dune)
        HouseOfGucci = requireView().findViewById(R.id.gucci)
        NoTimeToDie = requireView().findViewById(R.id.noTimeToDie)
        SpiderMan = requireView().findViewById(R.id.spiderMan)
        KingsMan = requireView().findViewById(R.id.kingsMan)

        Movies = requireView().findViewById(R.id.radioGroup)

    }

    private fun clickButton() {
        if (i == 0) {
            seatsNumber = seatsNumber - 1
            Seats.text = "$seatsNumber"
            priceNumber = priceNumber + 15
            Price.text = "$priceNumber"

            i++
        }
        else if (i == 1) {
            seatsNumber = seatsNumber + 1
            Seats.text = "$seatsNumber"
            priceNumber = priceNumber - 15
            Price.text = "$priceNumber"

            i--
        }
    }

}