package main.hard;

public class LastSubstringinLexicographicalOrder_1163 {
    public String lastSubstring(String s) {
        if ("([a-z])\\1*".matches(s)) {
            return s;
        }
        String temp;
        for(int i = 122; i >= 97; i--){
            temp = Character.toString((char) i);
            if(s.contains(temp)){
                if(s.indexOf(temp) == s.lastIndexOf(temp)){
                    return s.substring(s.indexOf(temp));
                } else {
                    while(s.contains(temp + temp)){
                        temp = temp + temp;
                    }
                    if(s.indexOf(temp) == s.lastIndexOf(temp)){
                        return s.substring(s.indexOf(temp));
                    }
                    String[] arr = s.split(temp);
                    String temp2 = arr[0];
                    for (String value : arr) {
                        if (value.compareTo(temp2) > 0) {
                            temp2 = value;
                        }
                    }
                    return s.substring(s.indexOf(temp.concat(temp2)));
                }
            }
        }
        return s;
    }
}
