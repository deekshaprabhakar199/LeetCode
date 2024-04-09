    }
        return l;

    public int calculateTime(int[] piles, int speed){
        int time=0;
        for (int i:piles){
            time += Math.ceil((double)i/(double)speed);
        }
        return time;
    }
}
[
