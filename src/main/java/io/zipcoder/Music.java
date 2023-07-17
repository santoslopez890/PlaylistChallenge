package io.zipcoder;
import java.util.Arrays;
import java.util.Scanner;

public class Music {

    private String[] playList;


    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int songIndex;
        int count=0;
       songIndex= Arrays.asList(playList).indexOf(selection);
        for (int i = 0; i < playList.length; i++) {
            if(songIndex >= startIndex){
                songIndex--;
                count++;
            }
            if(songIndex <= songIndex){
                songIndex++;
                count++;
            }
        }




        return songIndex-1;
    }
}
