class Solution {
    public String interpret(String str) {
        if(str.contains("()")){
            str=str.replace("()","o");
        }
        if(str.contains("(")){
            str=str.replace("(","");
        }
        if(str.contains(")")){
            str=str.replace(")","");
        }
        return str;
    }
}