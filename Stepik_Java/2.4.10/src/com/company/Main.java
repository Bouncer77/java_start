package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] textLines= {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        String str = printTextPerRole(roles, textLines);
        System.out.println(str);
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        int lenRole, lenLine;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < roles.length; ++i) {
            res.append(roles[i]).append(":\n");
            lenRole = roles[i].length();
            for (int j = 0; j < textLines.length; ++j) {
                lenLine = textLines[j].length();
                if (textLines[j].startsWith(roles[i] + ":")) {
                    res.append((j+1)).append(") ");
                    res.append(textLines[j].substring(roles[i].length() + 2));
                    //res.append(textLines[j].toCharArray(), lenRole + 2, lenLine - lenRole - 2);
                    res.append('\n');
                }
            }

            if (i < roles.length - 1)
                res.append("\n");
        }
        return res.toString();
    }

}
