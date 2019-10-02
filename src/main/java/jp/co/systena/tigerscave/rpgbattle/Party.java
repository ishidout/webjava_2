package jp.co.systena.tigerscave.rpgbattle;

import java.util.ArrayList;
import java.util.List;

public class Party {

  private List <Charactor> charaList = new ArrayList <Charactor>();

  public Party() {

  }

  public List<Charactor> getcharaList(){
  return this.charaList;
  }

}