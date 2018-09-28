package com.geekerstar.s02;

public class Solution3 {
    public String replaceSpace(StringBuffer str){
        if(str == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(String.valueOf(str.charAt(i)).equals(" ")){
                sb.append("%20");
            }else{
                sb.append(str.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}
