package kr.hs.emirim.sohee.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText;
    lateinit var edit2 : EditText;
    lateinit var btnAdd : Button;
    lateinit var btnMinus : Button;
    lateinit var btnMultiply : Button;
    lateinit var btnDivide : Button;
    lateinit var num1 : String;
    lateinit var num2 : String;
    lateinit var textResult: TextView;
    var result : Int? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edit1=findViewById(R.id.edit1)
        edit2=findViewById(R.id.edit2)
        textResult=findViewById(R.id.text_result)
        btnAdd=findViewById(R.id.btn_plus)
        btnMinus=findViewById(R.id.btn_minus)
        btnMultiply=findViewById(R.id.btn_multiply)
        btnDivide=findViewById(R.id.btn_divide)
        btnAdd.setOnClickListener{
            num1=edit1.text.toString()
            num2=edit2.text.toString()
            result=Integer.parseInt(num1)+Integer.parseInt(num2)
            textResult.text="계산 결과 : "+result
        }
        btnMinus.setOnClickListener{
            num1=edit1.text.toString()
            num2=edit2.text.toString()
            result=Integer.parseInt(num1)-Integer.parseInt(num2)
            textResult.text="계산 결과 : "+result
        }
        btnMultiply.setOnClickListener{
            num1=edit1.text.toString()
            num2=edit2.text.toString()
            result=Integer.parseInt(num1)*Integer.parseInt(num2)
            textResult.text="계산 결과 : "+result
        }
        btnDivide.setOnClickListener{
            num1=edit1.text.toString()
            num2=edit2.text.toString()
            result=Integer.parseInt(num1)/Integer.parseInt(num2)
            textResult.text="계산 결과 : "+result
        }
    }
}