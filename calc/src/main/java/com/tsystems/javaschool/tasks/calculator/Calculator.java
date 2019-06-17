package com.tsystems.javaschool.tasks.calculator;


import java.text.DecimalFormat;
import java.util.LinkedList;


public class Calculator {
    public String evaluate(String statement){
        try{
            LinkedList<Double> numeralsSt = new LinkedList<Double>();
            LinkedList<Character> signsSt = new LinkedList<Character>();
            DecimalFormat decimalFormat = new DecimalFormat("##.####");
            int counter = 0;

            for (int i = 0; i <statement.length() ; i++) {
                char c = statement.charAt(i);
                if(isSpace(c)){
                    continue;
                }
                if (c == '('){
                    signsSt.add(c);
                    counter++;
                }else if( c == ')'){
                    if( signsSt.isEmpty()){
                        return null;
                    }
                    for (int j = 0; j <counter ; j++) {
                        if (signsSt.getLast() != '('){
                            process(numeralsSt,signsSt.removeLast());
                            signsSt.removeLast();
                        } else if( signsSt.getLast() == '('){
                            signsSt.removeLast();
                        }
                        counter--;
                    }
                }else if(isOperator(c)){
                    while(!signsSt.isEmpty() && priority(signsSt.getLast()) >= priority(c)){
                        process(numeralsSt,signsSt.removeLast());
                    }
                    signsSt.add(c);
                }
                else{
                    String operand = "";

                    for ( int j = i; j <statement.length() ; j++) {
                        if(Character.isDigit(statement.charAt(i)) || statement.charAt(i)=='.' ){
                            operand += statement.charAt(i++);
                        }else{
                            break;
                        }
                    }
                    i--;
                    numeralsSt.add(Double.parseDouble(operand));
                }
            }
            while(!signsSt.isEmpty()){
                process(numeralsSt,signsSt.removeLast());
                if(signsSt.isEmpty()){
                    return decimalFormat.format(numeralsSt.get(0));
                }
            }
            return decimalFormat.format(numeralsSt.get(0));
        }catch (Exception e){
            return null;
        }
    }


    public static boolean isSpace(char c) {
        return c == ' ';
    }

    public static boolean isOperator(char c){
        return c == '+' || c == '-' || c == '/' || c == '*';
    }

    private static void process(LinkedList<Double> n, char c){
        double first = n.removeLast();
        double second = n.removeLast();
        switch(c){
            case '+':
                n.add(second+first);
                break;
            case '-':
                n.add(second-first);
                break;
            case '*':
                n.add(second*first);
                break;
            case '/':
                n.add(second/first);
                break;
        }
    }

    private static int priority(char sign){
        switch(sign){
            case '+':
            case '-':
                return 1;
            case'/':
            case'*':
                return 2;
            default:
                return -1;
        }
    }


}
