package Soal1.jurnal05;

public class OperasiHitung {
    private final Stack stack;
    private final String inputan;
    private String output = "";

    public OperasiHitung(String masukan) {
        inputan = masukan;
        int ukuranStack = inputan.length();
        stack = new Stack(ukuranStack);
    }

    public String doTrans() {
        for (int A = 0; A < inputan.length(); A++) {
            char amr = inputan.charAt(A);
            switch (amr) {
                case '+':
                case '-':
                    gotOper(amr, 1);
                    break;
                case '*':
                case '/':
                    gotOper(amr, 2);
                    break;
                case '^':
                    gotOper(amr, 3);
                    break;
                case '(':
                    stack.push(amr);
                    break;
                case ')':
                    gotParen(amr);
                    break;
                default:
                    output = output + amr;
                    break;
            }
        }
        while (!stack.isEmpty()) {
            output = output + stack.pop();
        }
        return output;
    }

    public void gotOper(char opThis, int prec1) {
        while (!stack.isEmpty()) {
            char opTop = (char) stack.pop();
            if (opTop == '(') {
                stack.push(opTop);
                break;
            }
            else {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else if (opTop == '*' || opTop == '/')
                    prec2 = 2;
                else
                    prec2 = 3;
                if (prec2 < prec1)
                {
                    stack.push(opTop);
                    break;
                } else
                    output = output + opTop;
            }
        }
        stack.push(opThis);
    }

    public void gotParen(char ch){
        while (!stack.isEmpty()) {
            char arm = (char) stack.pop();
            if (arm == '(')
                break;
            else
                output = output + arm;
        }
    }

}
