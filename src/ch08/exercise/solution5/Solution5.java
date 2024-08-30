package ch08.exercise.solution5;

public class Solution5 {
    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}

interface Remocon {
    public void powerOn();
}

class TV implements Remocon {
    @Override
    public void powerOn() {
        System.out.println("TV를 켰습니다.");
    }
}
