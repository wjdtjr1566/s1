using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculator
{
    public partial class Form1 : Form
    {
        bool isFirst = true;

        double firstNum = 0;
        double secondNum = 0;
        String op = "";
        double result = 0;

        public Form1()
        {
            InitializeComponent();
        }

        private void calc()
        {
            secondNum = double.Parse(display.Text);

            if (op == "+")
            {
                result = firstNum + secondNum;
            }
            else if (op == "-")
            {
                result = firstNum - secondNum;
            }
            else if (op == "*")
            {
                result = firstNum * secondNum;
            }
            else if (op == "/")
            {
                if (secondNum == 0)
                {
                    display.Text = "0으로 나눌 수 없습니다";
                    return;
                }
                result = firstNum / secondNum;
            }

            display.Text = result.ToString();
            firstNum = result;
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {

        }

        private void button11_Click(object sender, EventArgs e) // 이거 ac버튼
        {
            display.Text = "0";
        }

        private void button13_Click(object sender, EventArgs e) // 이거는 back
        {
            display.Text = display.Text.Substring(0, display.Text.Length - 1);
            if (display.Text.Length == 0)
            {
                display.Text = "0";
            }
            double d = double.Parse(display.Text);
            display.Text = "" + d;

            // 잘라진 글씨가 "."이면 ~으로 처리하자
            // 왜냐면 : 1.001 한칸 지우면 1.00을 유지해야 1.002로 바꾸기 쉽다. 
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btn9_Click(object sender, EventArgs e)
        {
            if(isFirst)
            {
                display.Text = "9";
                isFirst = false;
            }
            else
            {
                display.Text += "9";
            }
            
        }

        private void btn8_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                display.Text = "8";
                isFirst = false;
            }
            else
            {
                display.Text += "8";
            }
        }

        private void btn7_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                display.Text = "7";
                isFirst = false;
            }
            else
            {
                display.Text += "7";
            }
        }

        private void btn6_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                display.Text = "6";
                isFirst = false;
            }
            else
            {
                display.Text += "6";
            }
        }

        private void btn5_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                display.Text = "5";
                isFirst = false;
            }
            else
            {
                display.Text += "5";
            }
        }

        private void btn4_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                display.Text = "4";
                isFirst = false;
            }
            else
            {
                display.Text += "4";
            }
        }

        private void btn3_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                display.Text = "3";
                isFirst = false;
            }
            else
            {
                display.Text += "3";
            }
        }

        private void btn2_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                display.Text = "2";
                isFirst = false;
            }
            else
            {
                display.Text += "2";
            }
        }

        private void btn1_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                display.Text = "1";
                isFirst = false;
            }
            else
            {
                display.Text += "1";
            }
        }

        private void btn0_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                display.Text = "0";
                isFirst = false;
            }
            else
            {
                display.Text += "0";
            }
        }

        private void na_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                op = "/";
                return;
            }

            if (op != "")
            {
                calc();
            }

            else
            {
                firstNum = double.Parse(display.Text);
            }

            op = "/";
            isFirst = true;
        }

        private void minus_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                op = "-";
                return;
            }

            if (op != "")
            {
                calc();
            }

            else
            {
                firstNum = double.Parse(display.Text);
            }

            op = "-";
            isFirst = true;
        }

        private void gob_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                op = "*";
                return;
            }

            if (op != "")
            {
                calc();
            }

            else
            {
                firstNum = double.Parse(display.Text);
            }

            op = "*";
            isFirst = true;
        }

        private void plus_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                op = "+";
                return;
            }

            if (op != "")
            {
                calc();
            }
            
            else
            {
                firstNum = double.Parse(display.Text);
            }

            op = "+";
            isFirst = true;
        }

        private void dot_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                display.Text = "0.";
                isFirst = false;
                return;
            }

            if (!display.Text.Contains("."))
            {
                display.Text += ".";
            }

        }

        private void eq_Click(object sender, EventArgs e)
        {
            if ( op == "")
            {
                return;
            }
            calc();
            op = "";
            isFirst = true;
        }
    }
}
