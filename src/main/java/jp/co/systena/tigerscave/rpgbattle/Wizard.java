package jp.co.systena.tigerscave.rpgbattle;

public class Wizard extends Job{ //「職業」の継承クラス「魔法使い」
  @Override
  public void attack(){
    System.out.println("まほうで攻撃した");
    //魔法使いは「まほう」で攻撃する
  }
}
