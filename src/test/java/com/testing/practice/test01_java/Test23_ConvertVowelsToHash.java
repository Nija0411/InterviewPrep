package com.testing.practice.test01_java;

//Convert String "Nikhita" to N#kh#t#
public class Test23_ConvertVowelsToHash {
    public static void main(String[] args) {
        String str = "NikhitA";
        str = str.toLowerCase();

        String replaced = "";
        for(char ch: str.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                replaced+='#';
            }else {
                replaced +=ch;
            }
        }
        System.out.println(replaced);
    }
}
