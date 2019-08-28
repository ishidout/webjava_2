package jp.co.systena.tigerscave.rpgbattle;

public class Knight extends Job{ //「職業」の継承クラス「戦士」
    @Override
    public void attack(){
      System.out.println("剣で攻撃した");
      //戦士は「剣」で攻撃する
    }
  }
