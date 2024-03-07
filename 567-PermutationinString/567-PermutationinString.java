        }
            str2[s2.charAt(i)-'a']++;
        if(Arrays.equals(str1,str2)) return true;
        for( int i = l1; i< l2; i++){
            str2[s2.charAt(i-l1)-'a']--;
            str2[s2.charAt(i)-'a']++;
            if(Arrays.equals(str1,str2)) return true;
        }
        return false;
    }
}

//Time = O(s2.length())
//spcae = O(1)
"
