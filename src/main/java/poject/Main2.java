package poject;

import poject.service.RequestUrlProcessing;

import java.io.IOException;
import java.util.List;

import static java.util.Arrays.asList;

public class Main2 {
    public static void main(String[] args) throws IOException {
        List<String> input = asList("289183", "302348", "302349", "302355", "302359");

        for (String in : input){
            System.out.println(RequestUrlProcessing.test(in).toString());
        }

    }



}
