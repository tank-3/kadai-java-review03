package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam YS = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam DeNA = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam T = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam G = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam C = new BaseBallTeam("広島カープ", 66, 74, 3);
        BaseBallTeam CD = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
        
        YS.report();
        DeNA.report();
        T.report();
        G.report();
        C.report();
        CD.report();
        }
    
}
