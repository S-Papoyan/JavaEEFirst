package com.digi.util;

import java.util.Random;

public class GenerateTokens {

    public static String generateVerifyCode() {
        Random random = new Random(99999);

        return random.nextInt(99999)+"";

    }
}
