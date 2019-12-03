package com.bouncer77.vtt;

import java.util.Base64;

public class Main {

    public static void main(String[] args) {
	    String msg = "Super Text";
        System.out.println("До кодирования:\n" + msg + "\n");

        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encoderBytes = encoder.encode(msg.getBytes());

        System.out.println("Закодированный текст:");
        for (int i = 0; i < encoderBytes.length; ++i) {
            System.out.printf("%c", (char) encoderBytes[i]);

            if (i % 4 == 0) System.out.print(" ");
        }
        System.out.println("\n");

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decoderBytes = decoder.decode(encoderBytes);
        System.out.println("После декодирования:\n" + new String(decoderBytes));

        byte[] myDecoderBytes = myDecode(encoderBytes);
    }

    private static byte[] myDecode(byte[] encoderBytes) {
        // RFC4648
        byte[] dst = new byte[4 * ((encoderBytes.length + 2) / 3)];
        //TODO скопипастить с пояснениями функцию decode0 из Decoder.RFC4648
        return null;
    }
}
