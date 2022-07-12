package ru.innopolis.bootcamp22.day2.lambda2;

import javax.swing.*;

/**
 * Whenever a button is pressed, write "hello" to the tf JTextField. Hint: to set the text of a TextField, you should call tf.setText("hello");
 * */
public class LambdaEventListenerExample {
    public static void main(String[] args) {
        JTextField tf=new JTextField();
        tf.setBounds(50, 50,150,20);
        JButton b=new JButton("click");
        b.setBounds(80,100,70,30);

        // uncomment the below expression and implement button clicking by a lambda expression.
//        b.addActionListener();

        JFrame f=new JFrame();
        f.add(tf);f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);

    }

}
