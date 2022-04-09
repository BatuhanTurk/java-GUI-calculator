import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {

    public static String evaluate(String expression) {
        char[] arr = expression.toCharArray();
        String operand1 = "";String operand2 = "";String operator = "";
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
                if(operator.isEmpty()){
                    operand1 += arr[i];
                }else{
                    operand2 += arr[i];
                }
            }

            if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
                operator += arr[i];
            }
        }

        if (operator.equals("+"))
            result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
        else if (operator.equals("-"))
            result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
        else if (operator.equals("/"))
            result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
        else
            result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
        return operand1 + operator + operand2 + "=" +result;
    }


    public static void main(String[] args) {

        JFrame jf = new JFrame();

        JLabel label = new JLabel();
        JTextField entry= new JTextField();
        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton tree = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton dot = new JButton(".");
        JButton clear = new JButton("C");
        JButton dell = new JButton("DEL");
        JButton equal = new JButton("=");
        JButton mul = new JButton("x");
        JButton div = new JButton("/");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");

        label.setBounds(250, 0, 20, 50);
        label.setForeground(Color.white);
        jf.add(label);

        entry.setBounds(10, 10, 280, 40);
        entry.setFont(new Font("Arial", Font.BOLD, 20));
        entry.setBackground(Color.gray);
        entry.setForeground(Color.white);
        entry.setBorder(null);
        entry.setEditable(false);
        entry.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(entry);

        clear.setBounds(10, 60, 60, 40);
        clear.setFont(new Font("Arial", Font.BOLD, 17));
        clear.setBackground(Color.red);
        clear.setForeground(Color.white);
        jf.add(clear);

        dell.setBounds(80, 60, 60, 40);
        dell.setFont(new Font("Arial", Font.BOLD, 10));
        dell.setBackground(Color.red);
        dell.setForeground(Color.white);
        jf.add(dell);

        seven.setBounds(10, 110, 60, 40);
        seven.setFont(new Font("Arial", Font.BOLD, 20));
        seven.setBackground(Color.gray);
        seven.setForeground(Color.white);
        jf.add(seven);

        eight.setBounds(80, 110, 60, 40);
        eight.setFont(new Font("Arial", Font.BOLD, 20));
        eight.setBackground(Color.gray);
        eight.setForeground(Color.white);
        jf.add(eight);

        nine.setBounds(150, 110, 60, 40);
        nine.setFont(new Font("Arial", Font.BOLD, 20));
        nine.setBackground(Color.gray);
        nine.setForeground(Color.white);
        jf.add(nine);

        four.setBounds(10, 160, 60, 40);
        four.setFont(new Font("Arial", Font.BOLD, 20));
        four.setBackground(Color.gray);
        four.setForeground(Color.white);
        jf.add(four);

        five.setBounds(80, 160, 60, 40);
        five.setFont(new Font("Arial", Font.BOLD, 20));
        five.setBackground(Color.gray);
        five.setForeground(Color.white);
        jf.add(five);

        six.setBounds(150, 160, 60, 40);
        six.setFont(new Font("Arial", Font.BOLD, 20));
        six.setBackground(Color.gray);
        six.setForeground(Color.white);
        jf.add(six);

        one.setBounds(10, 210, 60, 40);
        one.setFont(new Font("Arial", Font.BOLD, 20));
        one.setBackground(Color.gray);
        one.setForeground(Color.white);
        jf.add(one);

        two.setBounds(80, 210, 60, 40);
        two.setFont(new Font("Arial", Font.BOLD, 20));
        two.setBackground(Color.gray);
        two.setForeground(Color.white);
        jf.add(two);

        tree.setBounds(150, 210, 60, 40);
        tree.setFont(new Font("Arial", Font.BOLD, 20));
        tree.setBackground(Color.gray);
        tree.setForeground(Color.white);
        jf.add(tree);

        zero.setBounds(10, 260, 130, 40);
        zero.setFont(new Font("Arial", Font.BOLD, 20));
        zero.setBackground(Color.gray);
        zero.setForeground(Color.white);
        jf.add(zero);

        dot.setBounds(150, 260, 60, 40);
        dot.setFont(new Font("Arial", Font.BOLD, 20));
        dot.setBackground(Color.gray);
        dot.setForeground(Color.white);
        jf.add(dot);

        div.setBounds(150, 60, 60, 40);
        div.setFont(new Font("Arial", Font.BOLD, 20));
        div.setBackground(Color.gray);
        div.setForeground(Color.white);
        jf.add(div);

        mul.setBounds(220, 60, 60, 40);
        mul.setFont(new Font("Arial", Font.BOLD, 20));
        mul.setBackground(Color.gray);
        mul.setForeground(Color.white);
        jf.add(mul);

        minus.setBounds(220, 110, 60, 40);
        minus.setFont(new Font("Arial", Font.BOLD, 20));
        minus.setBackground(Color.gray);
        minus.setForeground(Color.white);
        jf.add(minus);

        plus.setBounds(220, 160, 60, 40);
        plus.setFont(new Font("Arial", Font.BOLD, 20));
        plus.setBackground(Color.gray);
        plus.setForeground(Color.white);
        jf.add(plus);

        equal.setBounds(220, 210, 60, 90);
        equal.setFont(new Font("Arial", Font.BOLD, 20));
        equal.setBackground(Color.decode("#119111"));
        equal.setForeground(Color.white);
        jf.add(equal);

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText("");
            }
        });

        dell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = entry.getText().length()-1;
                entry.setText(entry.getText().substring(0,a));
            }
        });

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"1");
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"2");
            }
        });

        tree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"3");
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"4");
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"5");
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"6");
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"7");
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"8");
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"9");
            }
        });

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"0");
            }
        });

        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+".");
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {entry.setText(entry.getText()+"/");}
        });

        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"*");
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"-");
            }
        });

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(entry.getText()+"+");
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entry.setText(evaluate(entry.getText()));
            }
        });

        jf.setTitle("Calculator");
        jf.setSize(300, 350);
        jf.getContentPane().setLayout(null);
        jf.getContentPane().setBackground(Color.DARK_GRAY);
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
