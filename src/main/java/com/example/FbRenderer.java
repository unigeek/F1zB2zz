package com.example;

public class FbRenderer {

	public String render(int i) {
        String simpleResult = String.format("%s", i);
        String complexResult = "";

        if ((i % 3) == 0) complexResult = "Fizz";
        if ((i % 5) == 0) complexResult = complexResult + "Buzz";
        return ("".equals(complexResult)) ? simpleResult : complexResult;
	}

}
