            length = Math.max(length, r-l+1);
            r++;
        }
        return length;
    }
}


//r - l + 1 - maxf: This represents the number of characters in the window that are different 
//from the character with the maximum frequency (maxf).

//time = O(n)
//space = O(1)- worst case all 26 letters have some freq, so O(1) constant space only
"
