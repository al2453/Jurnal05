package Soal1.jurnal05;

public class OperasiHitung {
    private final Stack stack;
    private final String inputan;
    private String output = "";

    public OperasiHitung(String masukan) {
        inputan = masukan;
        int batasStack= inputan.length();
        stack = new Stack(batasStack);
    }

    public String doTrans() {
        for (int i = 0; i < inputan.length(); i++) {
            char angka = inputan.charAt(i);
            switch (angka) {
                case '+':
                case '-':
                    operator(angka, 1);
                    break;
                case '*':
                case '/':
                    operator(angka, 2);
                    break;
                case '^':
                    operator(angka, 3);
                    break;
                case '(':
                    stack.push(angka);
                    break;
                case ')':
                    gotParen(angka);
                    break;
                default:
                    output = output + angka;
                    break;
            }
        }
        while (!stack.isEmpty()) {
            output = output + stack.pop();
        }
        return output;
    }

    public void operator(char opThis, int bilangan1) {
        while (!stack.isEmpty()) {
            char opTop = (char) stack.pop();
            if (opTop == '(') {
                stack.push(opTop);
                break;
            }
            else {
                int bilangan2;
                if (opTop == '+' || opTop == '-')
                    bilangan2 = 1;
                else if (opTop == '*' || opTop == '/')
                    bilangan2 = 2;
                else
                    bilangan2 = 3;
                if (bilangan2 < bilangan1)
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
